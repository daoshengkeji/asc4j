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

import net.odyssi.asc4j.model.AgeRatingDeclarationResponse;
import net.odyssi.asc4j.model.AppStoreReviewDetailResponse;
import net.odyssi.asc4j.model.AppStoreVersionBuildLinkageRequest;
import net.odyssi.asc4j.model.AppStoreVersionBuildLinkageResponse;
import net.odyssi.asc4j.model.AppStoreVersionCreateRequest;
import net.odyssi.asc4j.model.AppStoreVersionLocalizationsResponse;
import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseResponse;
import net.odyssi.asc4j.model.AppStoreVersionResponse;
import net.odyssi.asc4j.model.AppStoreVersionSubmissionResponse;
import net.odyssi.asc4j.model.AppStoreVersionUpdateRequest;
import net.odyssi.asc4j.model.AppStoreVersionsResponse;
import net.odyssi.asc4j.model.BuildResponse;
import net.odyssi.asc4j.model.IdfaDeclarationResponse;
import net.odyssi.asc4j.model.RoutingAppCoverageResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreVersionsResource {

	/**
	 * Add a new App Store version or platform to an app.
	 */
	@Path("/appStoreVersions")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionResponse createAppStoreVersion(AppStoreVersionCreateRequest data);

	/**
	 * Delete an app store version that is associated with an app.
	 */
	@Path("/appStoreVersions/{id}")
	@DELETE
	void deleteAppStoreVersion(@PathParam("id") String id);

	/**
	 * Get a list of all App Store versions of an app across all platforms.
	 */
	@Path("/apps/{id}/appStoreVersions")
	@GET
	@Produces("application/json")
	AppStoreVersionsResponse listAppAppStoreVersions(@PathParam("id") String id,
			@QueryParam("filter[appStoreState]") List<String> filterAppStoreState,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[versionString]") List<String> filterVersionString,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[idfaDeclarations]") List<String> fieldsIdfaDeclarations,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages,
			@QueryParam("fields[appStoreVersionPhasedReleases]") List<String> fieldsAppStoreVersionPhasedReleases,
			@QueryParam("fields[ageRatingDeclarations]") List<String> fieldsAgeRatingDeclarations,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[appStoreVersionSubmissions]") List<String> fieldsAppStoreVersionSubmissions,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Get a list of localized, version-level information about an app, for all
	 * locales.
	 */
	@Path("/appStoreVersions/{id}/appStoreVersionLocalizations")
	@GET
	@Produces("application/json")
	AppStoreVersionLocalizationsResponse listAppStoreVersionLocalizations(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("limit") Integer limit);

	/**
	 * Update the app store version for a specific app.
	 */
	@Path("/appStoreVersions/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionResponse modifyAppStoreVersion(@PathParam("id") String id, AppStoreVersionUpdateRequest data);

	/**
	 * Change the build that is attached to a specific App Store version.
	 */
	@Path("/appStoreVersions/{id}/relationships/build")
	@PATCH
	@Consumes("application/json")
	void modifyAppStoreVersionBuild(@PathParam("id") String id, AppStoreVersionBuildLinkageRequest data);

	/**
	 * Get the details you provide to App Review so they can test your app.
	 */
	@Path("/appStoreVersions/{id}/appStoreReviewDetail")
	@GET
	@Produces("application/json")
	AppStoreReviewDetailResponse readAppStoreReviewDetailsResourceInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[appStoreReviewAttachments]") List<String> fieldsAppStoreReviewAttachments,
			@QueryParam("include") List<String> include);

	/**
	 * Get information for a specific app store version.
	 */
	@Path("/appStoreVersions/{id}")
	@GET
	@Produces("application/json")
	AppStoreVersionResponse readAppStoreVersion(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("fields[idfaDeclarations]") List<String> fieldsIdfaDeclarations,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages,
			@QueryParam("fields[appStoreVersionPhasedReleases]") List<String> fieldsAppStoreVersionPhasedReleases,
			@QueryParam("fields[ageRatingDeclarations]") List<String> fieldsAgeRatingDeclarations,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[appStoreVersionSubmissions]") List<String> fieldsAppStoreVersionSubmissions,
			@QueryParam("limit[appStoreVersionLocalizations]") Integer limitAppStoreVersionLocalizations);

	/**
	 * Get the age-related information declared for your app.
	 */
	@Path("/appStoreVersions/{id}/ageRatingDeclaration")
	@GET
	@Produces("application/json")
	AgeRatingDeclarationResponse readAppStoreVersionAgeRatingDeclaration(@PathParam("id") String id,
			@QueryParam("fields[ageRatingDeclarations]") List<String> fieldsAgeRatingDeclarations);

	/**
	 * Get the ID of the build that is attached to a specific App Store version.
	 */
	@Path("/appStoreVersions/{id}/relationships/build")
	@GET
	@Produces("application/json")
	AppStoreVersionBuildLinkageResponse readAppStoreVersionBuildID(@PathParam("id") String id);

	/**
	 * Get the build that is attached to a specific App Store version.
	 */
	@Path("/appStoreVersions/{id}/build")
	@GET
	@Produces("application/json")
	BuildResponse readAppStoreVersionBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Read your declared Advertising Identifier (IDFA) usage responses.
	 */
	@Path("/appStoreVersions/{id}/idfaDeclaration")
	@GET
	@Produces("application/json")
	IdfaDeclarationResponse readAppStoreVersionIDFADeclaration(@PathParam("id") String id,
			@QueryParam("fields[idfaDeclarations]") List<String> fieldsIdfaDeclarations);

	/**
	 * Read the phased release status and configuration for a version with phased
	 * release enabled.
	 */
	@Path("/appStoreVersions/{id}/appStoreVersionPhasedRelease")
	@GET
	@Produces("application/json")
	AppStoreVersionPhasedReleaseResponse readAppStoreVersionPhasedReleaseInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersionPhasedReleases]") List<String> fieldsAppStoreVersionPhasedReleases);

	/**
	 * Get the routing app coverage file that is associated with a specific App
	 * Store version
	 */
	@Path("/appStoreVersions/{id}/routingAppCoverage")
	@GET
	@Produces("application/json")
	RoutingAppCoverageResponse readAppStoreVersionRoutingAppCoverage(@PathParam("id") String id,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages);

	@Path("/appStoreVersions/{id}/appStoreVersionSubmission")
	@GET
	@Produces("application/json")
	AppStoreVersionSubmissionResponse readAppStoreVersionSubmissionInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[appStoreVersionSubmissions]") List<String> fieldsAppStoreVersionSubmissions,
			@QueryParam("include") List<String> include);

}
