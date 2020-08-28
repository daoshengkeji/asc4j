/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppBetaTestersLinkagesRequest;
import net.odyssi.asc4j.model.AppInfosResponse;
import net.odyssi.asc4j.model.AppPreOrderResponse;
import net.odyssi.asc4j.model.AppPricesResponse;
import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.AppStoreVersionsResponse;
import net.odyssi.asc4j.model.AppUpdateRequest;
import net.odyssi.asc4j.model.AppsResponse;
import net.odyssi.asc4j.model.BetaAppLocalizationsResponse;
import net.odyssi.asc4j.model.BetaAppReviewDetailResponse;
import net.odyssi.asc4j.model.BetaGroupsResponse;
import net.odyssi.asc4j.model.BetaLicenseAgreementResponse;
import net.odyssi.asc4j.model.BuildsResponse;
import net.odyssi.asc4j.model.EndUserLicenseAgreementResponse;
import net.odyssi.asc4j.model.InAppPurchaseResponse;
import net.odyssi.asc4j.model.InAppPurchasesResponse;
import net.odyssi.asc4j.model.PerfPowerMetricsResponse;
import net.odyssi.asc4j.model.PreReleaseVersionsResponse;
import net.odyssi.asc4j.model.TerritoriesResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppsResource {

	/**
	 * Get the performance and power metrics data for the most recent versions of an
	 * app.
	 */
	@Path("/apps/{id}/perfPowerMetrics")
	@GET
	@Produces("application/json")
	PerfPowerMetricsResponse getAppPowerAndPerformanceMetrics(@PathParam("id") String id,
			@QueryParam("filter[deviceType]") List<String> filterDeviceType,
			@QueryParam("filter[metricType]") List<String> filterMetricType,
			@QueryParam("filter[platform]") List<String> filterPlatform);

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
	 * Get a list of App Store territories where an app is or will be available.
	 */
	@Path("/apps/{id}/availableTerritories")
	@GET
	@Produces("application/json")
	TerritoriesResponse listAppAvailableTerritories(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of beta groups associated with a specific app.
	 */
	@Path("/apps/{id}/betaGroups")
	@GET
	@Produces("application/json")
	BetaGroupsResponse listAppBetaGroups(@PathParam("id") String id,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of builds associated with a specific app.
	 */
	@Path("/apps/{id}/builds")
	@GET
	@Produces("application/json")
	BuildsResponse listAppBuilds(@PathParam("id") String id, @QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("limit") Integer limit);

	/**
	 * List the in-app purchases that are available for your app.
	 */
	@Path("/apps/{id}/inAppPurchases")
	@GET
	@Produces("application/json")
	InAppPurchasesResponse listAppInAppPurchases(@PathParam("id") String id,
			@QueryParam("filter[inAppPurchaseType]") List<String> filterInAppPurchaseType,
			@QueryParam("filter[canBeSubmitted]") List<String> filterCanBeSubmitted,
			@QueryParam("sort") List<String> sort,
			@QueryParam("fields[inAppPurchases]") List<String> fieldsInAppPurchases,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Get information about an app that is currently live on App Store, or that
	 * goes live with the next version.
	 */
	// FIXME Look at this
	@Path("/apps/{id}/appInfos")
	@GET
	@Produces("application/json")
	AppInfosResponse listAppInfos(@PathParam("id") String id,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories,
			@QueryParam("fields[appInfoLocalizations]") List<String> fieldsAppInfoLocalizations,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Get a list of prerelease versions associated with a specific app.
	 */
	@Path("/apps/{id}/preReleaseVersions")
	@GET
	@Produces("application/json")
	PreReleaseVersionsResponse listAppPrereleaseVersions(@PathParam("id") String id,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("limit") Integer limit);

	/**
	 * Get current price tier of an app and any future planned price changes.
	 */
	@Path("/apps/{id}/prices")
	@GET
	@Produces("application/json")
	AppPricesResponse listAppPrices(@PathParam("id") String id,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Find and list apps added in App Store Connect.
	 */
	@Path("/apps")
	@GET
	@Produces("application/json")
	AppsResponse listApps(
			@QueryParam("filter[appStoreVersions.appStoreState]") List<String> filterAppStoreVersionsAppStoreState,
			@QueryParam("filter[appStoreVersions.platform]") List<String> filterAppStoreVersionsPlatform,
			@QueryParam("filter[bundleId]") List<String> filterBundleId,
			@QueryParam("filter[name]") List<String> filterName, @QueryParam("filter[sku]") List<String> filterSku,
			@QueryParam("filter[appStoreVersions]") List<String> filterAppStoreVersions,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("exists[gameCenterEnabledVersions]") List<String> existsGameCenterEnabledVersions,
			@QueryParam("sort") List<String> sort, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices,
			@QueryParam("fields[inAppPurchases]") List<String> fieldsInAppPurchases,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails,
			@QueryParam("fields[territories]") List<String> fieldsTerritories,
			@QueryParam("fields[gameCenterEnabledVersions]") List<String> fieldsGameCenterEnabledVersions,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements,
			@QueryParam("limit[appInfos]") Integer limitAppInfos,
			@QueryParam("limit[appStoreVersions]") Integer limitAppStoreVersions,
			@QueryParam("limit[availableTerritories]") Integer limitAvailableTerritories,
			@QueryParam("limit[betaAppLocalizations]") Integer limitBetaAppLocalizations,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups, @QueryParam("limit[builds]") Integer limitBuilds,
			@QueryParam("limit[gameCenterEnabledVersions]") Integer limitGameCenterEnabledVersions,
			@QueryParam("limit[inAppPurchases]") Integer limitInAppPurchases,
			@QueryParam("limit[preReleaseVersions]") Integer limitPreReleaseVersions,
			@QueryParam("limit[prices]") Integer limitPrices);

	/**
	 * Get a list of localized beta test information for a specific app.
	 */
	@Path("/apps/{id}/betaAppLocalizations")
	@GET
	@Produces("application/json")
	BetaAppLocalizationsResponse listBetaAppLocalizations(@PathParam("id") String id,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("limit") Integer limit);

	/**
	 * Update app information including bundle ID, primary locale, price schedule,
	 * and global availability.
	 */
	@Path("/apps/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppResponse modifyApp(@PathParam("id") String id, AppUpdateRequest data);

	/**
	 * Get information about a specific app.
	 */
	@Path("/apps/{id}")
	@GET
	@Produces("application/json")
	AppResponse readApp(@PathParam("id") String id, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices,
			@QueryParam("fields[inAppPurchases]") List<String> fieldsInAppPurchases,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails,
			@QueryParam("fields[territories]") List<String> fieldsTerritories,
			@QueryParam("fields[gameCenterEnabledVersions]") List<String> fieldsGameCenterEnabledVersions,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements,
			@QueryParam("limit[appInfos]") Integer limitAppInfos,
			@QueryParam("limit[appStoreVersions]") Integer limitAppStoreVersions,
			@QueryParam("limit[availableTerritories]") Integer limitAvailableTerritories,
			@QueryParam("limit[betaAppLocalizations]") Integer limitBetaAppLocalizations,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups, @QueryParam("limit[builds]") Integer limitBuilds,
			@QueryParam("limit[gameCenterEnabledVersions]") Integer limitGameCenterEnabledVersions,
			@QueryParam("limit[inAppPurchases]") Integer limitInAppPurchases,
			@QueryParam("limit[preReleaseVersions]") Integer limitPreReleaseVersions,
			@QueryParam("limit[prices]") Integer limitPrices);

	/**
	 * Get the custom end user license agreement (EULA) for a specific app and the
	 * territories where the agreement applies.
	 */
	@Path("/apps/{id}/endUserLicenseAgreement")
	@GET
	@Produces("application/json")
	EndUserLicenseAgreementResponse readAppLicenseAgreement(@PathParam("id") String id,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements);

	/**
	 * Get available date and release date of an app that is available for
	 * pre-order.
	 */
	@Path("/apps/{id}/preOrder")
	@GET
	@Produces("application/json")
	AppPreOrderResponse readAppPreOrderInfo(@PathParam("id") String id,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders);

	/**
	 * Get the beta license agreement for a specific app.
	 */
	@Path("/apps/{id}/betaLicenseAgreement")
	@GET
	@Produces("application/json")
	BetaLicenseAgreementResponse readBetaAppLicenseAgreement(@PathParam("id") String id,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements);

	/**
	 * Get the beta app review details for a specific app.
	 */
	@Path("/apps/{id}/betaAppReviewDetail")
	@GET
	@Produces("application/json")
	BetaAppReviewDetailResponse readBetaAppReviewDetails(@PathParam("id") String id,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails);

	/**
	 * Get a specific beta license agreement.
	 */
	@Path("/betaLicenseAgreements/{id}")
	@GET
	@Produces("application/json")
	BetaLicenseAgreementResponse readBetaLicenseAgreementInformation(@PathParam("id") String id,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get information about an in-app purchase.
	 */
	@Path("/inAppPurchases/{id}")
	@GET
	@Produces("application/json")
	InAppPurchaseResponse readInAppPurchaseInfo(@PathParam("id") String id,
			@QueryParam("fields[inAppPurchases]") List<String> fieldsInAppPurchases,
			@QueryParam("include") List<String> include, @QueryParam("limit[apps]") Integer limitApps);

	/**
	 * Remove one or more beta testers' access to test any builds of a specific app.
	 */
	@Path("/apps/{id}/relationships/betaTesters")
	@DELETE
	@Consumes("application/json")
	void removeAppBetaTesters(@PathParam("id") String id, AppBetaTestersLinkagesRequest data);

}
