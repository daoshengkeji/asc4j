/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BetaGroupBetaTestersLinkagesRequest;
import net.odyssi.asc4j.model.BetaGroupBetaTestersLinkagesResponse;
import net.odyssi.asc4j.model.BetaGroupBuildsLinkagesRequest;
import net.odyssi.asc4j.model.BetaGroupBuildsLinkagesResponse;
import net.odyssi.asc4j.model.BetaGroupCreateRequest;
import net.odyssi.asc4j.model.BetaGroupResponse;
import net.odyssi.asc4j.model.BetaGroupUpdateRequest;
import net.odyssi.asc4j.model.BetaGroupsResponse;
import net.odyssi.asc4j.model.BetaTestersResponse;
import net.odyssi.asc4j.model.BuildsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaGroupsResource {

	/**
	 * Add a specific beta tester to one or more beta groups for beta testing.
	 */
	@Path("/betaGroups/{id}/relationships/betaTesters")
	@POST
	@Consumes("application/json")
	void addBetaTestersToBetaGroup(@PathParam("id") String id, BetaGroupBetaTestersLinkagesRequest data);

	/**
	 * Associate builds with a beta group to enable the group to test the builds.
	 */
	@Path("/betaGroups/{id}/relationships/builds")
	@POST
	@Consumes("application/json")
	void addBuildsToBetaGroup(@PathParam("id") String id, BetaGroupBuildsLinkagesRequest data);

	/**
	 * Create a beta group associated with an app, optionally enabling TestFlight
	 * public links.
	 */
	@Path("/betaGroups")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaGroupResponse createBetaGroup(BetaGroupCreateRequest data);

	/**
	 * Delete a beta group and remove beta tester access to associated builds.
	 */
	@Path("/betaGroups/{id}")
	@DELETE
	void deleteBetaGroup(@PathParam("id") String id);

	/**
	 * Get a list of the beta tester resource IDs in a specific beta group.
	 */
	@Path("/betaGroups/{id}/relationships/betaTesters")
	@GET
	@Produces("application/json")
	BetaGroupBetaTestersLinkagesResponse listBetaGroupBetaTesterIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of beta testers contained in a specific beta group.
	 */
	@Path("/betaGroups/{id}/betaTesters")
	@GET
	@Produces("application/json")
	BetaTestersResponse listBetaGroupBetaTesters(@PathParam("id") String id,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of build resource IDs in a specific beta group.
	 */
	@Path("/betaGroups/{id}/relationships/builds")
	@GET
	@Produces("application/json")
	BetaGroupBuildsLinkagesResponse listBetaGroupBuildIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of builds associated with a specific beta group.
	 */
	@Path("/betaGroups/{id}/builds")
	@GET
	@Produces("application/json")
	BuildsResponse listBetaGroupBuilds(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit);

	/**
	 * Find and list beta groups for all apps.
	 */
	@Path("/betaGroups")
	@GET
	@Produces("application/json")
	BetaGroupsResponse listBetaGroups(@QueryParam("filter[isInternalGroup]") List<String> filterIsInternalGroup,
			@QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[publicLink]") List<String> filterPublicLink,
			@QueryParam("filter[publicLinkEnabled]") List<String> filterPublicLinkEnabled,
			@QueryParam("filter[publicLinkLimitEnabled]") List<String> filterPublicLinkLimitEnabled,
			@QueryParam("filter[app]") List<String> filterApp, @QueryParam("filter[builds]") List<String> filterBuilds,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[betaTesters]") Integer limitBetaTesters,
			@QueryParam("limit[builds]") Integer limitBuilds);

	/**
	 * Modify a beta group's metadata, including changing its Testflight public link
	 * status.
	 */
	@Path("/betaGroups/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BetaGroupResponse modifyBetaGroup(@PathParam("id") String id, BetaGroupUpdateRequest data);

	/**
	 * Get the app information for a specific beta group.
	 */
	@Path("/betaGroups/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBetaGroupAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get a specific beta group.
	 */
	@Path("/betaGroups/{id}")
	@GET
	@Produces("application/json")
	BetaGroupResponse readBetaGroupInformation(@PathParam("id") String id,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[betaTesters]") Integer limitBetaTesters,
			@QueryParam("limit[builds]") Integer limitBuilds);

	/**
	 * Remove a specific beta tester from a one or more beta groups, revoking their
	 * access to test builds associated with those groups.
	 */
	@Path("/betaGroups/{id}/relationships/betaTesters")
	@DELETE
	@Consumes("application/json")
	void removeBetaTestersFromBetaGroup(@PathParam("id") String id, BetaGroupBetaTestersLinkagesRequest data);

	/**
	 * Remove access to test one or more builds from beta testers in a specific beta
	 * group.
	 */
	@Path("/betaGroups/{id}/relationships/builds")
	@DELETE
	@Consumes("application/json")
	void removeBuildsFromBetaGroup(@PathParam("id") String id, BetaGroupBuildsLinkagesRequest data);

}
