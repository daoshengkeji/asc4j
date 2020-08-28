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

import net.odyssi.asc4j.model.AppPreviewSetsResponse;
import net.odyssi.asc4j.model.AppScreenshotSetsResponse;
import net.odyssi.asc4j.model.AppStoreVersionLocalizationCreateRequest;
import net.odyssi.asc4j.model.AppStoreVersionLocalizationResponse;
import net.odyssi.asc4j.model.AppStoreVersionLocalizationUpdateRequest;
import net.odyssi.asc4j.model.AppStoreVersionLocalizationsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppStoreVersionLocalizationsResource {

	/**
	 * Add localized version-level information for a new locale.
	 */
	@Path("/appStoreVersionLocalizations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionLocalizationResponse createAppStoreVersionLocalization(
			AppStoreVersionLocalizationCreateRequest data);

	/**
	 * Delete a language from your version metadata.
	 */
	@Path("/appStoreVersionLocalizations/{id}")
	@DELETE
	void deleteAppStoreVersionLocalization(@PathParam("id") String id);

	/**
	 * List all app preview sets for a specific localization.
	 */
	@Path("/appStoreVersionLocalizations/{id}/appPreviewSets")
	@GET
	@Produces("application/json")
	AppPreviewSetsResponse listAppStoreVersionLocalizationPreviewSets(@PathParam("id") String id,
			@QueryParam("filter[previewType]") List<String> filterPreviewType,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets, @QueryParam("limit") Integer limit,
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
	 * List all screenshot sets for a specific localization.
	 */
	@Path("/appStoreVersionLocalizations/{id}/appScreenshotSets")
	@GET
	@Produces("application/json")
	AppScreenshotSetsResponse listAppStoreVersionLocalizationScreenshotSets(@PathParam("id") String id,
			@QueryParam("filter[screenshotDisplayType]") List<String> filterScreenshotDisplayType,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("fields[appScreenshotSets]") List<String> fieldsAppScreenshotSets,
			@QueryParam("fields[appScreenshots]") List<String> fieldsAppScreenshots, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Modify localized version-level information for a particular language.
	 */
	@Path("/appStoreVersionLocalizations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppStoreVersionLocalizationResponse modifyAppStoreVersionLocalization(@PathParam("id") String id,
			AppStoreVersionLocalizationUpdateRequest data);

	/**
	 * Read localized version-level information.
	 */
	@Path("/appStoreVersionLocalizations/{id}")
	@GET
	@Produces("application/json")
	AppStoreVersionLocalizationResponse readAppStoreVersionLocalization(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appScreenshotSets]") List<String> fieldsAppScreenshotSets,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets,
			@QueryParam("limit[appPreviewSets]") Integer limitAppPreviewSets,
			@QueryParam("limit[appScreenshotSets]") Integer limitAppScreenshotSets);

}
