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

import net.odyssi.asc4j.model.AppPreviewSetAppPreviewsLinkagesRequest;
import net.odyssi.asc4j.model.AppPreviewSetAppPreviewsLinkagesResponse;
import net.odyssi.asc4j.model.AppPreviewSetCreateRequest;
import net.odyssi.asc4j.model.AppPreviewSetResponse;
import net.odyssi.asc4j.model.AppPreviewsResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppPreviewSetsResource {

	/**
	 * Add a new app preview set to an App Store version localization for a specific
	 * app preview type and display size.
	 */
	@Path("/appPreviewSets")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppPreviewSetResponse createAppPreviewSet(AppPreviewSetCreateRequest data);

	/**
	 * Delete an app preview set and all of its previews.
	 */
	@Path("/appPreviewSets/{id}")
	@DELETE
	void deleteAppPreviewSet(@PathParam("id") String id);

	/**
	 * Get the ordered app preview IDs in a preview set.
	 */
	@Path("/appPreviewSets/{id}/relationships/appPreviews")
	@GET
	@Produces("application/json")
	AppPreviewSetAppPreviewsLinkagesResponse listAppPreviewSetAppPreviewIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

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
	 * Get an app preview set that includes its display target, language, and the
	 * previews it contains.
	 */
	@Path("/appPreviewSets/{id}")
	@GET
	@Produces("application/json")
	AppPreviewSetResponse readAppPreviewSet(@PathParam("id") String id,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("limit[appPreviews]") Integer limitAppPreviews);

	/**
	 * Change the order of the app previews in a preview set.
	 */
	@Path("/appPreviewSets/{id}/relationships/appPreviews")
	@PATCH
	@Consumes("application/json")
	void replaceAppPreviewSetAppPreviews(@PathParam("id") String id, AppPreviewSetAppPreviewsLinkagesRequest data);

}
