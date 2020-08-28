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

import net.odyssi.asc4j.model.AppCategoryResponse;
import net.odyssi.asc4j.model.AppInfoLocalizationsResponse;
import net.odyssi.asc4j.model.AppInfoResponse;
import net.odyssi.asc4j.model.AppInfoUpdateRequest;
import net.odyssi.asc4j.model.AppInfosResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppInfoResource {

	/**
	 * Get a list of localized, app-level information for an app.
	 */
	@Path("/appInfos/{id}/appInfoLocalizations")
	@GET
	@Produces("application/json")
	AppInfoLocalizationsResponse listAppInfoLocalizationsForAppInfo(@PathParam("id") String id,
			@QueryParam("filter[locale]") List<String> filterLocale,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos,
			@QueryParam("fields[appInfoLocalizations]") List<String> fieldsAppInfoLocalizations,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);

	/**
	 * Get information about an app that is currently live on App Store, or that
	 * goes live with the next version.
	 */
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
	 * Update the App Store categories and sub-categories for your app.
	 */
	@Path("/appInfos/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppInfoResponse modifyAppInfo(@PathParam("id") String id, AppInfoUpdateRequest data);

	/**
	 * Get an app’s primary App Store category.
	 */
	@Path("/appInfos/{id}/primaryCategory")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoPrimaryCategory(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

	/**
	 * Get the first App Store subcategory within an app’s primary category.
	 */
	@Path("/appInfos/{id}/primarySubcategoryOne")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoPrimarySubcategoryOne(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

	/**
	 * Get the second App Store subcategory within an app’s primary category.
	 */
	@Path("/appInfos/{id}/primarySubcategoryTwo")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoPrimarySubcategoryTwo(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

	/**
	 * Read App Store information including your App Store state, age ratings,
	 * Brazil age rating, and kids' age band.
	 */
	@Path("/appInfos/{id}")
	@GET
	@Produces("application/json")
	AppInfoResponse readAppInformation(@PathParam("id") String id,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos, @QueryParam("include") List<String> include,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories,
			@QueryParam("fields[appInfoLocalizations]") List<String> fieldsAppInfoLocalizations,
			@QueryParam("limit[appInfoLocalizations]") Integer limitAppInfoLocalizations);

	/**
	 * Get an app’s secondary App Store category.
	 */
	@Path("/appInfos/{id}/secondaryCategory")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoSecondaryCategory(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

	/**
	 * Get the first App Store subcategory within an app’s secondary category.
	 */
	@Path("/appInfos/{id}/secondarySubcategoryOne")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoSecondarySubcategoryOne(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

	/**
	 * Get the second App Store subcategory within an app’s secondary category.
	 */
	@Path("/appInfos/{id}/secondarySubcategoryTwo")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppInfoSecondarySubcategoryTwo(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

}
