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

import net.odyssi.asc4j.model.AppInfoLocalizationCreateRequest;
import net.odyssi.asc4j.model.AppInfoLocalizationResponse;
import net.odyssi.asc4j.model.AppInfoLocalizationUpdateRequest;
import net.odyssi.asc4j.model.AppInfoLocalizationsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppInfoLocalizationResource {

	/**
	 * Add app-level localized information for a new locale.
	 */
	@Path("/appInfoLocalizations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppInfoLocalizationResponse createAppInfoLocalization(AppInfoLocalizationCreateRequest data);

	/**
	 * Delete an app information localization that is associated with an app.
	 */
	@Path("/appInfoLocalizations/{id}")
	@DELETE
	void deleteAppInfoLocalization(@PathParam("id") String id);

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
	 * Modify localized app-level information for a particular language.
	 */
	@Path("/appInfoLocalizations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppInfoLocalizationResponse modifyAppInfoLocalization(@PathParam("id") String id,
			AppInfoLocalizationUpdateRequest data);

	/**
	 * Read localized app-level information.
	 */
	@Path("/appInfoLocalizations/{id}")
	@GET
	@Produces("application/json")
	AppInfoLocalizationResponse readAppInfoLocalization(@PathParam("id") String id,
			@QueryParam("fields[appInfoLocalizations]") List<String> fieldsAppInfoLocalizations,
			@QueryParam("include") List<String> include);

}
