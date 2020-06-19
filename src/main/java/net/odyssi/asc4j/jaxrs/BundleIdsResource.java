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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.BundleIdCreateRequest;
import net.odyssi.asc4j.model.BundleIdUpdateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/bundleIds")
public interface BundleIdsResource {

	// TODO Produces

	/**
	 * Find and list bundle IDs that are registered to your team.
	 * 
	 * @return The service response
	 */
	@Path("/")
	@Produces({ MediaType.APPLICATION_JSON })
	@GET
	public Response getBundleIDs(@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("filter[identifier]") List<String> filterIdentifier,
			@QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[seetId]") List<String> filterSeetId,
			@QueryParam("filter[platform]") List<String> filterPlatform, @QueryParam("include") List<String> include,
			@QueryParam("limit") Integer limit, @QueryParam("limit[profiles]") List<Integer> limitProfiles,
			@QueryParam("sort") List<String> sort,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities);

	/**
	 * Register a new bundle ID for app development.
	 * 
	 * @return The service response
	 */
	@Path("/")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response createBundleID(BundleIdCreateRequest data);

	/**
	 * Get information about a specific bundle ID.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getBundleID(@PathParam("bundleIdentifier") String bundleIdentifier,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles, @QueryParam("include") List<String> include,
			@QueryParam("limit[profiles]") List<Integer> limitProfiles,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities);

	/**
	 * Delete a bundle ID that is used for app development.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}")
	@DELETE
	public Response deleteBundleID(@PathParam("bundleIdentifier") String bundleIdentifier);

	/**
	 * Update a specific bundle ID’s name.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}")
	@PATCH
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response updateBundleID(@PathParam("bundleIdentifier") String bundleIdentifier, BundleIdUpdateRequest data);

	/**
	 * Get the resource IDs for all profiles associated with a specific bundle ID.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}/relationships/profiles")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getBundleIDProfileIDs(@PathParam("bundleIdentifier") String bundleIdentifier,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of all profiles for a specific bundle ID.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}/profiles")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getBundleIDProfiles(@PathParam("bundleIdentifier") String bundleIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[profiles]") List<String> fieldsProfiles);

	/**
	 * Get the resource IDs for all capabilities associated with a specific bundle
	 * ID.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}/relationships/bundleIdCapabilities")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getBundleIDCapabilityIDs(@PathParam("bundleIdentifier") String bundleIdentifier,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of all capabilities for a specific bundle ID.
	 * 
	 * @return The service response
	 */
	@Path("/{bundleIdentifier}/bundleIdCapabilities")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getBundleIDCapabilities(@PathParam("bundleIdentifier") String bundleIdentifier,
			@QueryParam("limit") Integer limit,
			@QueryParam("fields[bundleIdCapabilities]") List<String> fieldsBundleIdCapabilities);
}
