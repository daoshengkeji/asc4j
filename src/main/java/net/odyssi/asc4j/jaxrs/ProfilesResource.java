package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.ProfileCreateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/profiles")
public interface ProfilesResource {

	// TODO Produces

	/**
	 * Find and list provisioning profiles and download their data.
	 * 
	 * @return The service response
	 */
	@GET
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

	/**
	 * Create a new provisioning profile.
	 * 
	 * @return The service response
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response createProfile(ProfileCreateRequest data);

	/**
	 * Get information for a specific provisioning profile and download its data.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}")
	@GET
	public Response getProfile(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles, @QueryParam("include") List<String> include,
			@QueryParam("limit[certificates]") Integer limitCertificates,
			@QueryParam("limit[devices]") Integer limitDevices,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds);

	/**
	 * Delete a provisioning profile that is used for app development or
	 * distribution.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}")
	@DELETE
	public Response deleteProfile(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get the bundle ID information for a specific provisioning profile.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/bundleId")
	@GET
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
	public Response getProfileBundleResourceID(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get a list of all certificates and their data for a specific provisioning
	 * profile.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/certificates")
	@GET
	public Response getProfileCertificates(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[certificates]") List<String> fieldsCertificates);

	/**
	 * Get the resource IDs of all certificates associated with a specific
	 * provisioning profile.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/relationships/certificates")
	@GET
	public Response getProfileCertificateIDs(@PathParam("profileIdentifier") String profileIdentifier);

	/**
	 * Get a list of all devices for a specific provisioning profile.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/devices")
	@GET
	public Response getProfileDevices(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[devices]") List<String> fieldsDevices);

	/**
	 * Get the resource IDs of all devices associated with a specific provisioning
	 * profile.
	 * 
	 * @return The service response
	 */
	@Path("/{profileIdentifier}/relationships/devices")
	@GET
	public Response getProfileDeviceResourceIDs(@PathParam("profileIdentifier") String profileIdentifier,
			@QueryParam("limit") Integer limit);
}
