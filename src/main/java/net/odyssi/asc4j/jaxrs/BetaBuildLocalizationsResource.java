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

import net.odyssi.asc4j.model.BetaBuildLocalizationCreateRequest;
import net.odyssi.asc4j.model.BetaBuildLocalizationResponse;
import net.odyssi.asc4j.model.BetaBuildLocalizationUpdateRequest;
import net.odyssi.asc4j.model.BuildResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaBuildLocalizationsResource {

	/**
	 * Create localized What’s New text for a build.
	 */
	@Path("/betaBuildLocalizations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaBuildLocalizationResponse createBetaBuildLocalization(BetaBuildLocalizationCreateRequest data);

	/**
	 * Delete a specific beta build localization associated with a build.
	 */
	@Path("/betaBuildLocalizations/{id}")
	@DELETE
	void deleteBetaBuildLocalization(@PathParam("id") String id);

	/**
	 * Update the localized What’s New text for a specific beta build and locale.
	 */
	@Path("/betaBuildLocalizations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BetaBuildLocalizationResponse modifyBetaBuildLocalization(@PathParam("id") String id,
			BetaBuildLocalizationUpdateRequest data);

	/**
	 * Get a specific beta build localization resource.
	 */
	@Path("/betaBuildLocalizations/{id}")
	@GET
	@Produces("application/json")
	BetaBuildLocalizationResponse readBetaBuildLocalization(@PathParam("id") String id,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Get the build information for a specific beta build localization.
	 */
	@Path("/betaBuildLocalizations/{id}/build")
	@GET
	@Produces("application/json")
	BuildResponse readBetaBuildLocalizationBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

}
