/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppsResponse;
import net.odyssi.asc4j.model.BetaGroupsResponse;
import net.odyssi.asc4j.model.BetaTesterAppsLinkagesRequest;
import net.odyssi.asc4j.model.BetaTesterAppsLinkagesResponse;
import net.odyssi.asc4j.model.BetaTesterBetaGroupsLinkagesRequest;
import net.odyssi.asc4j.model.BetaTesterBetaGroupsLinkagesResponse;
import net.odyssi.asc4j.model.BetaTesterBuildsLinkagesRequest;
import net.odyssi.asc4j.model.BetaTesterBuildsLinkagesResponse;
import net.odyssi.asc4j.model.BetaTesterCreateRequest;
import net.odyssi.asc4j.model.BetaTesterResponse;
import net.odyssi.asc4j.model.BetaTestersResponse;
import net.odyssi.asc4j.model.BuildsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaTestersResource {

	/**
	 * Add one or more beta testers to a specific beta group.
	 */
	@Path("/betaTesters/{id}/relationships/betaGroups")
	@POST
	@Consumes("application/json")
	void addBetaTesterToBetaGroups(@PathParam("id") String id, BetaTesterBetaGroupsLinkagesRequest data);

	/**
	 * Individually assign a beta tester to a build.
	 */
	@Path("/betaTesters/{id}/relationships/builds")
	@POST
	@Consumes("application/json")
	void assignBetaTesterToBuild(@PathParam("id") String id, BetaTesterBuildsLinkagesRequest data);

	/**
	 * Create a beta tester assigned to a group, a build, or an app.
	 */
	@Path("/betaTesters")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaTesterResponse createBetaTester(BetaTesterCreateRequest data);

	/**
	 * Remove a beta tester's ability to test all apps.
	 */
	@Path("/betaTesters/{id}")
	@DELETE
	void deleteBetaTester(@PathParam("id") String id);

	/**
	 * Get a list of app resource IDs associated with a beta tester.
	 */
	@Path("/betaTesters/{id}/relationships/apps")
	@GET
	@Produces("application/json")
	BetaTesterAppsLinkagesResponse listBetaTesterAppResourceIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of apps that a beta tester can test.
	 */
	@Path("/betaTesters/{id}/apps")
	@GET
	@Produces("application/json")
	AppsResponse listBetaTesterApps(@PathParam("id") String id, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of build resource IDs individually assigned to a specific beta
	 * tester.
	 */
	@Path("/betaTesters/{id}/relationships/builds")
	@GET
	@Produces("application/json")
	BetaTesterBuildsLinkagesResponse listBetaTesterAssignedBuildIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of builds individually assigned to a specific beta tester.
	 */
	@Path("/betaTesters/{id}/builds")
	@GET
	@Produces("application/json")
	BuildsResponse listBetaTesterAssignedBuilds(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of group resource IDs associated with a beta tester.
	 */
	@Path("/betaTesters/{id}/relationships/betaGroups")
	@GET
	@Produces("application/json")
	BetaTesterBetaGroupsLinkagesResponse listBetaTesterBetaGroupIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of beta groups that contain a specific beta tester.
	 */
	@Path("/betaTesters/{id}/betaGroups")
	@GET
	@Produces("application/json")
	BetaGroupsResponse listBetaTesterBetaGroups(@PathParam("id") String id,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups, @QueryParam("limit") Integer limit);

	/**
	 * Find and list beta testers for all apps, builds, and beta groups.
	 */
	@Path("/betaTesters")
	@GET
	@Produces("application/json")
	BetaTestersResponse listBetaTesters(@QueryParam("filter[email]") List<String> filterEmail,
			@QueryParam("filter[firstName]") List<String> filterFirstName,
			@QueryParam("filter[inviteType]") List<String> filterInviteType,
			@QueryParam("filter[lastName]") List<String> filterLastName,
			@QueryParam("filter[apps]") List<String> filterApps,
			@QueryParam("filter[betaGroups]") List<String> filterBetaGroups,
			@QueryParam("filter[builds]") List<String> filterBuilds, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit[apps]") Integer limitApps,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups, @QueryParam("limit[builds]") Integer limitBuilds);

	/**
	 * Get a specific beta tester.
	 */
	@Path("/betaTesters/{id}")
	@GET
	@Produces("application/json")
	BetaTesterResponse readBetaTesterInformation(@PathParam("id") String id,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit[apps]") Integer limitApps,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups, @QueryParam("limit[builds]") Integer limitBuilds);

	/**
	 * Remove a specific beta tester's access to test any builds of one or more
	 * apps.
	 */
	@Path("/betaTesters/{id}/relationships/apps")
	@DELETE
	@Consumes("application/json")
	void removeBetaTesterAppAccess(@PathParam("id") String id, BetaTesterAppsLinkagesRequest data);

	/**
	 * Remove a specific beta tester from one or more beta groups, revoking their
	 * access to test builds associated with those groups.
	 */
	@Path("/betaTesters/{id}/relationships/betaGroups")
	@DELETE
	@Consumes("application/json")
	void removeBetaTesterFromBetaGroups(@PathParam("id") String id, BetaTesterBetaGroupsLinkagesRequest data);

	/**
	 * Remove an individually assigned beta tester's ability to test a build.
	 */
	@Path("/betaTesters/{id}/relationships/builds")
	@DELETE
	@Consumes("application/json")
	void removeBetaTesterFromBuild(@PathParam("id") String id, BetaTesterBuildsLinkagesRequest data);

}
