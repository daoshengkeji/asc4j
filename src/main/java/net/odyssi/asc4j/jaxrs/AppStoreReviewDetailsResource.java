/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppStoreReviewDetailCreateRequest;
import net.odyssi.asc4j.model.AppStoreReviewDetailResponse;
import net.odyssi.asc4j.model.AppStoreReviewDetailUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreReviewDetailsResource {

	/**
	 * Add App Store review details to an App Store version, including contact and
	 * demo account information.
	 */
	@Path("/appStoreReviewDetails")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreReviewDetailResponse createAppStoreReviewDetails(AppStoreReviewDetailCreateRequest data);

	/**
	 * Update the app store review details, including the contact information, demo
	 * account, and notes.
	 */
	@Path("/appStoreReviewDetails/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreReviewDetailResponse modifyAppStoreReviewDetails(@PathParam("id") String id,
			AppStoreReviewDetailUpdateRequest data);

	/**
	 * Get App Review details you provided, including contact information, demo
	 * account, and notes.
	 */
	@Path("/appStoreReviewDetails/{id}")
	@GET
	@Produces("application/json")
	AppStoreReviewDetailResponse readAppStoreReviewDetails(@PathParam("id") String id,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appStoreReviewAttachments]") List<String> fieldsAppStoreReviewAttachments,
			@QueryParam("limit[appStoreReviewAttachments]") Integer limitAppStoreReviewAttachments);

}
