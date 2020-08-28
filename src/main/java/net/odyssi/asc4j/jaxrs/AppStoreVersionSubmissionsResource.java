/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.AppStoreVersionSubmissionCreateRequest;
import net.odyssi.asc4j.model.AppStoreVersionSubmissionResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreVersionSubmissionsResource {

	/**
	 * Submit an App Store version to App Review.
	 */
	@Path("/appStoreVersionSubmissions")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionSubmissionResponse createAppStoreVersionSubmission(AppStoreVersionSubmissionCreateRequest data);

	/**
	 * Remove a version from App Store review.
	 */
	@Path("/appStoreVersionSubmissions/{id}")
	@DELETE
	void deleteAppStoreVersionSubmission(@PathParam("id") String id);

}
