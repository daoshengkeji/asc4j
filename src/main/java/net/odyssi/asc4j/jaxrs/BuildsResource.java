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

import net.odyssi.asc4j.model.AppEncryptionDeclarationBuildsLinkagesRequest;
import net.odyssi.asc4j.model.AppEncryptionDeclarationResponse;
import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.AppStoreVersionResponse;
import net.odyssi.asc4j.model.BetaAppReviewSubmissionResponse;
import net.odyssi.asc4j.model.BetaBuildLocalizationsResponse;
import net.odyssi.asc4j.model.BetaTestersResponse;
import net.odyssi.asc4j.model.BuildAppEncryptionDeclarationLinkageResponse;
import net.odyssi.asc4j.model.BuildBetaDetailResponse;
import net.odyssi.asc4j.model.BuildBetaGroupsLinkagesRequest;
import net.odyssi.asc4j.model.BuildIndividualTestersLinkagesRequest;
import net.odyssi.asc4j.model.BuildIndividualTestersLinkagesResponse;
import net.odyssi.asc4j.model.BuildResponse;
import net.odyssi.asc4j.model.BuildUpdateRequest;
import net.odyssi.asc4j.model.BuildsResponse;
import net.odyssi.asc4j.model.PrereleaseVersionResponse;

/**
 * @author sdnakhla
 *
 */
public interface BuildsResource {

	/**
	 * Add or create a beta group to a build to enable testing.
	 */
	@Path("/builds/{id}/relationships/betaGroups")
	@POST
	@Consumes("application/json")
	void addBuildBetaGroupAccess(@PathParam("id") String id, BuildBetaGroupsLinkagesRequest data);

	/**
	 * Assign one or more builds to an app encryption declaration.
	 */
	@Path("/appEncryptionDeclarations/{id}/relationships/builds")
	@POST
	@Consumes("application/json")
	void assignAppEncryptionDeclarationBuild(@PathParam("id") String id,
			AppEncryptionDeclarationBuildsLinkagesRequest data);

	/**
	 * Enable a beta tester who is not a part of a beta group to test a build.
	 */
	@Path("/builds/{id}/relationships/individualTesters")
	@POST
	@Consumes("application/json")
	void assignBuildTester(@PathParam("id") String id, BuildIndividualTestersLinkagesRequest data);

	/**
	 * Find and list beta build localizations currently associated with apps.
	 */
	@Path("/betaBuildLocalizations")
	@GET
	@Produces("application/json")
	BetaBuildLocalizationsResponse listBetaBuildLocalizations(@QueryParam("filter[locale]") List<String> filterLocale,
			@QueryParam("filter[build]") List<String> filterBuild,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Get a list of localized beta test information for a specific build.
	 */
	@Path("/builds/{id}/betaBuildLocalizations")
	@GET
	@Produces("application/json")
	BetaBuildLocalizationsResponse listBuildBetaBuildLocalizations(@PathParam("id") String id,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("limit") Integer limit);

	/**
	 * Find and list builds for all apps in App Store Connect.
	 */
	@Path("/builds")
	@GET
	@Produces("application/json")
	BuildsResponse listBuilds(
			@QueryParam("filter[betaAppReviewSubmission.betaReviewState]") List<String> filterBetaAppReviewSubmissionBetaReviewState,
			@QueryParam("filter[expired]") List<String> filterExpired,
			@QueryParam("filter[preReleaseVersion.platform]") List<String> filterPreReleaseVersionPlatform,
			@QueryParam("filter[preReleaseVersion.version]") List<String> filterPreReleaseVersionVersion,
			@QueryParam("filter[processingState]") List<String> filterProcessingState,
			@QueryParam("filter[usesNonExemptEncryption]") List<String> filterUsesNonExemptEncryption,
			@QueryParam("filter[version]") List<String> filterVersion,
			@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("filter[appStoreVersion]") List<String> filterAppStoreVersion,
			@QueryParam("filter[betaGroups]") List<String> filterBetaGroups,
			@QueryParam("filter[preReleaseVersion]") List<String> filterPreReleaseVersion,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[betaBuildLocalizations]") Integer limitBetaBuildLocalizations,
			@QueryParam("limit[icons]") Integer limitIcons,
			@QueryParam("limit[individualTesters]") Integer limitIndividualTesters);

	/**
	 * Get a list of resource IDs of individual testers associated with a build.
	 */
	@Path("/builds/{id}/relationships/individualTesters")
	@GET
	@Produces("application/json")
	BuildIndividualTestersLinkagesResponse listBuildTesterResourceIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of beta testers individually assigned to a build.
	 */
	@Path("/builds/{id}/individualTesters")
	@GET
	@Produces("application/json")
	BetaTestersResponse listBuildTesters(@PathParam("id") String id,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters, @QueryParam("limit") Integer limit);

	/**
	 * Expire a build or change its encryption exemption setting.
	 */
	@Path("/builds/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BuildResponse modifyBuild(@PathParam("id") String id, BuildUpdateRequest data);

	/**
	 * Get the beta app review submission status for a specific build.
	 */
	@Path("/builds/{id}/betaAppReviewSubmission")
	@GET
	@Produces("application/json")
	BetaAppReviewSubmissionResponse readBetaAppReviewSubmission(@PathParam("id") String id,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions);

	/**
	 * Get the beta test details for a specific build.
	 */
	@Path("/builds/{id}/buildBetaDetail")
	@GET
	@Produces("application/json")
	BuildBetaDetailResponse readBetaBuildDetails(@PathParam("id") String id,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails);

	/**
	 * Read an app encryption declaration associated with a specific build.
	 */
	@Path("/builds/{id}/appEncryptionDeclaration")
	@GET
	@Produces("application/json")
	AppEncryptionDeclarationResponse readBuildAppEncryptionDeclaration(@PathParam("id") String id,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations);

	/**
	 * Get the beta app encryption declaration resource ID associated with a build.
	 */
	@Path("/builds/{id}/relationships/appEncryptionDeclaration")
	@GET
	@Produces("application/json")
	BuildAppEncryptionDeclarationLinkageResponse readBuildAppEncryptionDeclarationID(@PathParam("id") String id);

	/**
	 * Get the app information for a specific build.
	 */
	@Path("/builds/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBuildAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get the App Store version of a specific build.
	 */
	@Path("/builds/{id}/appStoreVersion")
	@GET
	@Produces("application/json")
	AppStoreVersionResponse readBuildAppStoreVersionInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions);

	/**
	 * Get information about a specific build.
	 */
	@Path("/builds/{id}")
	@GET
	@Produces("application/json")
	BuildResponse readBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("include") List<String> include,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[betaBuildLocalizations]") Integer limitBetaBuildLocalizations,
			@QueryParam("limit[icons]") Integer limitIcons,
			@QueryParam("limit[individualTesters]") Integer limitIndividualTesters);

	/**
	 * Get the prerelease version for a specific build.
	 */
	@Path("/builds/{id}/preReleaseVersion")
	@GET
	@Produces("application/json")
	PrereleaseVersionResponse readBuildPrereleaseVersion(@PathParam("id") String id,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions);

	/**
	 * Remove access to a specific build for all beta testers in one or more beta
	 * groups.
	 */
	@Path("/builds/{id}/relationships/betaGroups")
	@DELETE
	@Consumes("application/json")
	void removeBuildBetaGroupAccess(@PathParam("id") String id, BuildBetaGroupsLinkagesRequest data);

	/**
	 * Remove access to test a specific build from one or more individually assigned
	 * testers.
	 */
	@Path("/builds/{id}/relationships/individualTesters")
	@DELETE
	@Consumes("application/json")
	void removeBuildTester(@PathParam("id") String id, BuildIndividualTestersLinkagesRequest data);

}
