/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BetaAppReviewDetailResponse;
import net.odyssi.asc4j.model.BetaAppReviewDetailUpdateRequest;
import net.odyssi.asc4j.model.BetaAppReviewDetailsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaAppReviewDetailService {

	/**
	 * Find and list beta app review details for all apps.
	 */
	@Path("/betaAppReviewDetails")
	@GET
	@Produces("application/json")
	BetaAppReviewDetailsResponse listBetaAppReviewDetails(@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Update the details for a specific app's beta app review.
	 */
	@Path("/betaAppReviewDetails/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BetaAppReviewDetailResponse modifyBetaAppReviewDetails(@PathParam("id") String id,
			BetaAppReviewDetailUpdateRequest data);

	/**
	 * Get the app information for a specific beta app review details resource.
	 */
	@Path("/betaAppReviewDetails/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBetaAppReviewDetailAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get beta app review details for a specific app.
	 */
	@Path("/betaAppReviewDetails/{id}")
	@GET
	@Produces("application/json")
	BetaAppReviewDetailResponse readBetaAppReviewDetails(@PathParam("id") String id,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

}
