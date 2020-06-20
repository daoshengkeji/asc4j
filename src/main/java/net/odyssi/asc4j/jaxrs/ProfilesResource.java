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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.ProfileCreateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/profiles")
public interface ProfilesResource {

	/**
	 * Create a new provisioning profile.
	 *
	 * @return The service response
	 */
	@Path("")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response createProfile(ProfileCreateRequest data);

	/**
	 * Delete a provisioning profile that is used for app development or
	 * distribution.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteProfile(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get information for a specific provisioning profile and download its data.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfile(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles, @QueryParam("include") List<String> include,
			@QueryParam("limit[certificates]") Integer limitCertificates,
			@QueryParam("limit[devices]") Integer limitDevices,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds);

	/**
	 * Get the bundle ID information for a specific provisioning profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/bundleId")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileBundleID(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("fieldsbundleIds") List<String> fieldsbundleIds);

	/**
	 * Get the resource ID of a bundle associated with a specific provisioning
	 * profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/relationships/bundleId")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileBundleResourceID(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get the resource IDs of all certificates associated with a specific
	 * provisioning profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/relationships/certificates")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileCertificateIDs(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get a list of all certificates and their data for a specific provisioning
	 * profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/certificates")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileCertificates(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[certificates]") List<String> fieldsCertificates);

	/**
	 * Get the resource IDs of all devices associated with a specific provisioning
	 * profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/relationships/devices")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileDeviceResourceIDs(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of all devices for a specific provisioning profile.
	 *
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/devices")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfileDevices(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[devices]") List<String> fieldsDevices);

	/**
	 * Find and list provisioning profiles and download their data.
	 *
	 * @return The service response
	 */
	@Path("")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getProfiles(@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("filter[name]") List<String> filterName,
			@QueryParam("include") List<String> include, @QueryParam("limit") Integer limit,
			@QueryParam("limit[certificates]") Integer limitCertificates,
			@QueryParam("limit[devices]") Integer limitDevices, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("filter[profileState]") List<String> filterProfileState,
			@QueryParam("filter[profileType]") List<String> filterProfileType);
}
