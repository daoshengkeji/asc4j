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

import net.odyssi.asc4j.model.AppScreenshotCreateRequest;
import net.odyssi.asc4j.model.AppScreenshotResponse;
import net.odyssi.asc4j.model.AppScreenshotUpdateRequest;
import net.odyssi.asc4j.model.AppScreenshotsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppScreenshotsResource {

	/**
	 * Add a new screenshot to a screenshot set.
	 */
	@Path("/appScreenshots")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppScreenshotResponse createAppScreenshot(AppScreenshotCreateRequest data);

	/**
	 * Delete an app screenshot that is associated with a screenshot set.
	 */
	@Path("/appScreenshots/{id}")
	@DELETE
	void deleteAppScreenshot(@PathParam("id") String id);

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
	 * Commit an app screenshot after uploading it.
	 */
	@Path("/appScreenshots/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppScreenshotResponse modifyAppScreenshot(@PathParam("id") String id, AppScreenshotUpdateRequest data);

	/**
	 * Get information about an app screenshot and its upload and processing status.
	 */
	@Path("/appScreenshots/{id}")
	@GET
	@Produces("application/json")
	AppScreenshotResponse readAppScreenshotInformation(@PathParam("id") String id,
			@QueryParam("fields[appScreenshots]") List<String> fieldsAppScreenshots,
			@QueryParam("include") List<String> include);

}
