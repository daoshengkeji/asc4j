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

import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseCreateRequest;
import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseResponse;
import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreVersionPhasedReleasesResource {

	/**
	 * Enable phased release for an App Store version.
	 */
	@Path("/appStoreVersionPhasedReleases")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionPhasedReleaseResponse createAppStoreVersionPhasedRelease(
			AppStoreVersionPhasedReleaseCreateRequest data);

	/**
	 * Cancel a planned phased release that has not been started.
	 */
	@Path("/appStoreVersionPhasedReleases/{id}")
	@DELETE
	void deleteAppStoreVersionPhasedRelease(@PathParam("id") String id);

	/**
	 * Pause or resume a phased release, or immediately release an app.
	 */
	@Path("/appStoreVersionPhasedReleases/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionPhasedReleaseResponse modifyAppStoreVersionPhasedRelease(@PathParam("id") String id,
			AppStoreVersionPhasedReleaseUpdateRequest data);

}
