/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.BetaAppReviewSubmissionCreateRequest;
import net.odyssi.asc4j.model.BetaAppReviewSubmissionResponse;
import net.odyssi.asc4j.model.BetaAppReviewSubmissionsResponse;
import net.odyssi.asc4j.model.BuildResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaAppReviewSubmissionsResource {

	/**
	 * Find and list beta app review submissions for all builds.
	 */
	@Path("/betaAppReviewSubmissions")
	@GET
	@Produces("application/json")
	BetaAppReviewSubmissionsResponse listBetaAppReviewSubmissions(
			@QueryParam("filter[betaReviewState]") List<String> filterBetaReviewState,
			@QueryParam("filter[build]") List<String> filterBuild,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Get a specific beta app review submission.
	 */
	@Path("/betaAppReviewSubmissions/{id}")
	@GET
	@Produces("application/json")
	BetaAppReviewSubmissionResponse readBetaAppReviewSubmission(@PathParam("id") String id,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Get the build information for a specific beta app review submission.
	 */
	@Path("/betaAppReviewSubmissions/{id}/build")
	@GET
	@Produces("application/json")
	BuildResponse readBetaAppReviewSubmissionBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Submit an app for beta app review to allow external testing.
	 */
	@Path("/betaAppReviewSubmissions")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaAppReviewSubmissionResponse submitAppForBetaReview(BetaAppReviewSubmissionCreateRequest data);

}
