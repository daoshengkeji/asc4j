/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppCategoriesResponse;
import net.odyssi.asc4j.model.AppCategoryResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppCategoriesResource {

	/**
	 * List all categories on the App Store, including the category and subcategory
	 * hierarchy.
	 */
	@Path("/appCategories")
	@GET
	@Produces("application/json")
	AppCategoriesResponse listAppCategories(@QueryParam("filter[platforms]") List<String> filterPlatforms,
			@QueryParam("exists[parent]") List<String> existsParent,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("limit[subcategories]") Integer limitSubcategories);

	/**
	 * List all App Store subcategories that belong to a specific category.
	 */
	@Path("/appCategories/{id}/subcategories")
	@GET
	@Produces("application/json")
	AppCategoriesResponse listAppSubcategories(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories, @QueryParam("limit") Integer limit);

	/**
	 * Get a specific app category.
	 */
	@Path("/appCategories/{id}")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppCategory(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories,
			@QueryParam("include") List<String> include,
			@QueryParam("limit[subcategories]") Integer limitSubcategories);

	/**
	 * Get the App Store category to which a specific subcategory belongs.
	 */
	@Path("/appCategories/{id}/parent")
	@GET
	@Produces("application/json")
	AppCategoryResponse readAppSubcategoryParent(@PathParam("id") String id,
			@QueryParam("fields[appCategories]") List<String> fieldsAppCategories);

}
