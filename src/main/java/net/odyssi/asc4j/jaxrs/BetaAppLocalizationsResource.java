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

import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BetaAppLocalizationCreateRequest;
import net.odyssi.asc4j.model.BetaAppLocalizationResponse;
import net.odyssi.asc4j.model.BetaAppLocalizationUpdateRequest;
import net.odyssi.asc4j.model.BetaAppLocalizationsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaAppLocalizationsResource {

	/**
	 * Create localized descriptive information for an app.
	 */
	@Path("/betaAppLocalizations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaAppLocalizationResponse createBetaAppLocalization(BetaAppLocalizationCreateRequest data);

	/**
	 * Delete a beta app localization associated with an app.
	 */
	@Path("/betaAppLocalizations/{id}")
	@DELETE
	void deleteBetaAppLocalization(@PathParam("id") String id);

	/**
	 * Find and list beta app localizations for all apps and locales.
	 */
	@Path("/betaAppLocalizations")
	@GET
	@Produces("application/json")
	BetaAppLocalizationsResponse listBetaAppLocalizations(@QueryParam("filter[locale]") List<String> filterLocale,
			@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Update the localized What’s New text for a specific app and locale.
	 */
	@Path("/betaAppLocalizations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BetaAppLocalizationResponse modifyBetaAppLocalization(@PathParam("id") String id,
			BetaAppLocalizationUpdateRequest data);

	/**
	 * Get the app information associated with a specific beta app localization.
	 */
	@Path("/betaAppLocalizations/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBetaAppLocalizationAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get localized beta app information for a specific app and locale.
	 */
	@Path("/betaAppLocalizations/{id}")
	@GET
	@Produces("application/json")
	BetaAppLocalizationResponse readBetaAppLocalizationInformation(@PathParam("id") String id,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

}
