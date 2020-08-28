/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.BundleIdCapabilityCreateRequest;
import net.odyssi.asc4j.model.BundleIdCapabilityResponse;
import net.odyssi.asc4j.model.BundleIdCapabilityUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface BundleIDCapabilitiesResource {

	/**
	 * Disable a capability for a bundle ID.
	 */
	@Path("/bundleIdCapabilities/{id}")
	@DELETE
	void disableBundleIDCapability(@PathParam("id") String id);

	/**
	 * Enable a capability for a bundle ID.
	 */
	@Path("/bundleIdCapabilities")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BundleIdCapabilityResponse enableBundleIDCapability(BundleIdCapabilityCreateRequest data);

	/**
	 * Update the configuration of a specific capability.
	 */
	@Path("/bundleIdCapabilities/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BundleIdCapabilityResponse modifyBundleIDCapability(@PathParam("id") String id,
			BundleIdCapabilityUpdateRequest data);

}
