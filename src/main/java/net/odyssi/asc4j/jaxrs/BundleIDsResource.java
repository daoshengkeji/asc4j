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
import net.odyssi.asc4j.model.BundleIdCapabilitiesResponse;
import net.odyssi.asc4j.model.BundleIdCreateRequest;
import net.odyssi.asc4j.model.BundleIdResponse;
import net.odyssi.asc4j.model.BundleIdUpdateRequest;
import net.odyssi.asc4j.model.BundleIdsResponse;
import net.odyssi.asc4j.model.ProfilesResponse;

/**
 * @author sdnakhla
 *
 */
public interface BundleIDsResource {

	/**
	 * Delete a bundle ID that is used for app development.
	 */
	@Path("/bundleIds/{id}")
	@DELETE
	void deleteBundleID(@PathParam("id") String id);

	/**
	 * Get a list of all capabilities for a specific bundle ID.
	 */
	@Path("/bundleIds/{id}/bundleIdCapabilities")
	@GET
	@Produces("application/json")
	BundleIdCapabilitiesResponse listBundleIDCapabilities(@PathParam("id") String id,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of all profiles for a specific bundle ID.
	 */
	@Path("/bundleIds/{id}/profiles")
	@GET
	@Produces("application/json")
	ProfilesResponse listBundleIDProfiles(@PathParam("id") String id,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles, @QueryParam("limit") Integer limit);

	/**
	 * Find and list bundle IDs that are registered to your team.
	 */
	@Path("/bundleIds")
	@GET
	@Produces("application/json")
	BundleIdsResponse listBundleIDs(@QueryParam("filter[identifier]") List<String> filterIdentifier,
			@QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[seedId]") List<String> filterSeedId, @QueryParam("filter[id]") List<String> filterId,
			@QueryParam("sort") List<String> sort, @QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[bundleIdCapabilities]") Integer limitBundleIdCapabilities,
			@QueryParam("limit[profiles]") Integer limitProfiles);

	/**
	 * Update a specific bundle ID’s name.
	 */
	@Path("/bundleIds/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BundleIdResponse modifyBundleID(@PathParam("id") String id, BundleIdUpdateRequest data);

	/**
	 * Get information about a specific bundle ID.
	 */
	@Path("/bundleIds/{id}")
	@GET
	@Produces("application/json")
	BundleIdResponse readBundleID(@PathParam("id") String id,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds, @QueryParam("include") List<String> include,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[bundleIdCapabilities]") Integer limitBundleIdCapabilities,
			@QueryParam("limit[profiles]") Integer limitProfiles);

	@Path("/bundleIds/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBundleIDApp(@PathParam("id") String id, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Register a new bundle ID for app development.
	 */
	@Path("/bundleIds")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BundleIdResponse registerBundleID(BundleIdCreateRequest data);

}
