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

import net.odyssi.asc4j.model.AppStoreReviewAttachmentCreateRequest;
import net.odyssi.asc4j.model.AppStoreReviewAttachmentResponse;
import net.odyssi.asc4j.model.AppStoreReviewAttachmentUpdateRequest;
import net.odyssi.asc4j.model.AppStoreReviewAttachmentsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreReviewAttachmentsResource {

	/**
	 * Commit an app screenshot after uploading it to the App Store.
	 */
	@Path("/appStoreReviewAttachments/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreReviewAttachmentResponse commitAppStoreReviewAttachment(@PathParam("id") String id,
			AppStoreReviewAttachmentUpdateRequest data);

	/**
	 * Attach a document for App Review to an App Store version.
	 */
	@Path("/appStoreReviewAttachments")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreReviewAttachmentResponse createAppStoreReviewAttachment(AppStoreReviewAttachmentCreateRequest data);

	/**
	 * Remove an attachment before you send your app to App Review.
	 */
	@Path("/appStoreReviewAttachments/{id}")
	@DELETE
	void deleteAppStoreReviewAttachment(@PathParam("id") String id);

	/**
	 * List all the App Store review attachments you include with a version when you
	 * submit it for App Review.
	 */
	@Path("/appStoreReviewDetails/{id}/appStoreReviewAttachments")
	@GET
	@Produces("application/json")
	AppStoreReviewAttachmentsResponse listAppStoreReviewDetailReviewAttachments(@PathParam("id") String id,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("fields[appStoreReviewAttachments]") List<String> fieldsAppStoreReviewAttachments,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);

	/**
	 * Get information about an App Store review attachment and its upload and
	 * processing status.
	 */
	@Path("/appStoreReviewAttachments/{id}")
	@GET
	@Produces("application/json")
	AppStoreReviewAttachmentResponse readAppStoreReviewAttachment(@PathParam("id") String id,
			@QueryParam("fields[appStoreReviewAttachments]") List<String> fieldsAppStoreReviewAttachments,
			@QueryParam("include") List<String> include);

}
