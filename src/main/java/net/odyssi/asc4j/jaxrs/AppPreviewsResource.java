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

import net.odyssi.asc4j.model.AppPreviewCreateRequest;
import net.odyssi.asc4j.model.AppPreviewResponse;
import net.odyssi.asc4j.model.AppPreviewUpdateRequest;
import net.odyssi.asc4j.model.AppPreviewsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppPreviewsResource {

	/**
	 * Add a new app preview to a preview set.
	 */
	@Path("/appPreviews")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppPreviewResponse createAppPreview(AppPreviewCreateRequest data);

	/**
	 * Delete an app preview within a preview set.
	 */
	@Path("/appPreviews/{id}")
	@DELETE
	void deleteAppPreview(@PathParam("id") String id);

	/**
	 * List all ordered app previews in a preview set.
	 */
	@Path("/appPreviewSets/{id}/appPreviews")
	@GET
	@Produces("application/json")
	AppPreviewsResponse listAppPreviewSetAppPreviews(@PathParam("id") String id,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Commit the app preview after uploading it, and update the poster frame
	 * timecode.
	 */
	@Path("/appPreviews/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppPreviewResponse modifyAppPreview(@PathParam("id") String id, AppPreviewUpdateRequest data);

	/**
	 * Get information about an app preview and its upload and processing status.
	 */
	@Path("/appPreviews/{id}")
	@GET
	@Produces("application/json")
	AppPreviewResponse readAppPreview(@PathParam("id") String id,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("include") List<String> include);

}
