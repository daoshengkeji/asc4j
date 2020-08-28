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

import net.odyssi.asc4j.model.AppScreenshotSetAppScreenshotsLinkagesRequest;
import net.odyssi.asc4j.model.AppScreenshotSetAppScreenshotsLinkagesResponse;
import net.odyssi.asc4j.model.AppScreenshotSetCreateRequest;
import net.odyssi.asc4j.model.AppScreenshotSetResponse;
import net.odyssi.asc4j.model.AppScreenshotsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppScreenshotSetsResource {

	/**
	 * Add a new screenshot set to an App Store version localization for a specific
	 * screenshot type and display size.
	 */
	@Path("/appScreenshotSets")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppScreenshotSetResponse createAppScreenshotSet(AppScreenshotSetCreateRequest data);

	/**
	 * Delete an app screenshot set and all of its screenshots.
	 */
	@Path("/appScreenshotSets/{id}")
	@DELETE
	void deleteAppScreenshotSet(@PathParam("id") String id);

	/**
	 * Get the ordered screenshot IDs in a screenshot set.
	 */
	@Path("/appScreenshotSets/{id}/relationships/appScreenshots")
	@GET
	@Produces("application/json")
	AppScreenshotSetAppScreenshotsLinkagesResponse listAppScreenshotSetScreenshotIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * List all ordered screenshots in a screenshot set.
	 */
	@Path("/appScreenshotSets/{id}/appScreenshots")
	@GET
	@Produces("application/json")
	AppScreenshotsResponse listAppScreenshotSetScreenshots(@PathParam("id") String id,
			@QueryParam("fields[appScreenshotSets]") List<String> fieldsAppScreenshotSets,
			@QueryParam("fields[appScreenshots]") List<String> fieldsAppScreenshots, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Get an app screenshot set including its display target, language, and the
	 * screenshot it contains.
	 */
	@Path("/appScreenshotSets/{id}")
	@GET
	@Produces("application/json")
	AppScreenshotSetResponse readAppScreenshotSet(@PathParam("id") String id,
			@QueryParam("fields[appScreenshotSets]") List<String> fieldsAppScreenshotSets,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appScreenshots]") List<String> fieldsAppScreenshots,
			@QueryParam("limit[appScreenshots]") Integer limitAppScreenshots);

	/**
	 * Change the order of the screenshots in a screenshot set.
	 */
	@Path("/appScreenshotSets/{id}/relationships/appScreenshots")
	@PATCH
	@Consumes("application/json")
	void replaceAppScreenshotSetScreenshots(@PathParam("id") String id,
			AppScreenshotSetAppScreenshotsLinkagesRequest data);

}
