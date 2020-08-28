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

import net.odyssi.asc4j.model.BundleIdResponse;
import net.odyssi.asc4j.model.CertificatesResponse;
import net.odyssi.asc4j.model.DevicesResponse;
import net.odyssi.asc4j.model.ProfileCreateRequest;
import net.odyssi.asc4j.model.ProfileResponse;
import net.odyssi.asc4j.model.ProfilesResponse;

/**
 * @author sdnakhla
 *
 */
public interface ProfilesResource {

	/**
	 * Create a new provisioning profile.
	 */
	@Path("/profiles")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	ProfileResponse createProfile(ProfileCreateRequest data);

	/**
	 * Delete a provisioning profile that is used for app development or
	 * distribution.
	 */
	@Path("/profiles/{id}")
	@DELETE
	void deleteProfile(@PathParam("id") String id);

	/**
	 * Get a list of all certificates and their data for a specific provisioning
	 * profile.
	 */
	@Path("/profiles/{id}/certificates")
	@GET
	@Produces("application/json")
	CertificatesResponse listProfileCertificates(@PathParam("id") String id,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of all devices for a specific provisioning profile.
	 */
	@Path("/profiles/{id}/devices")
	@GET
	@Produces("application/json")
	DevicesResponse listProfileDevices(@PathParam("id") String id,
			@QueryParam("fields[devices]") List<String> fieldsDevices, @QueryParam("limit") Integer limit);

	/**
	 * Find and list provisioning profiles and download their data.
	 */
	@Path("/profiles")
	@GET
	@Produces("application/json")
	ProfilesResponse listProfiles(@QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[profileState]") List<String> filterProfileState,
			@QueryParam("filter[profileType]") List<String> filterProfileType,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[profiles]") List<String> fieldsProfiles, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("limit[certificates]") Integer limitCertificates,
			@QueryParam("limit[devices]") Integer limitDevices);

	/**
	 * Get information for a specific provisioning profile and download its data.
	 */
	@Path("/profiles/{id}")
	@GET
	@Produces("application/json")
	ProfileResponse readProfile(@PathParam("id") String id, @QueryParam("fields[profiles]") List<String> fieldsProfiles,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds,
			@QueryParam("limit[certificates]") Integer limitCertificates,
			@QueryParam("limit[devices]") Integer limitDevices);

	/**
	 * Get the bundle ID information for a specific provisioning profile.
	 */
	@Path("/profiles/{id}/bundleId")
	@GET
	@Produces("application/json")
	BundleIdResponse readProfileBundleID(@PathParam("id") String id,
			@QueryParam("fields[bundleIds]") List<String> fieldsBundleIds);

}
