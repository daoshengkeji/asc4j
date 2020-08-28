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

import net.odyssi.asc4j.model.BuildBetaDetailResponse;
import net.odyssi.asc4j.model.BuildBetaDetailUpdateRequest;
import net.odyssi.asc4j.model.BuildBetaDetailsResponse;
import net.odyssi.asc4j.model.BuildResponse;

/**
 * @author sdnakhla
 *
 */
public interface BuildBetaDetailsResource {

	/**
	 * Find and list build beta details for all builds.
	 */
	@Path("/buildBetaDetails")
	@GET
	@Produces("application/json")
	BuildBetaDetailsResponse listBuildBetaDetails(@QueryParam("filter[build]") List<String> filterBuild,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Update beta test details for a specific build.
	 */
	@Path("/buildBetaDetails/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BuildBetaDetailResponse modifyBuildBetaDetails(@PathParam("id") String id, BuildBetaDetailUpdateRequest data);

	/**
	 * Get a specific build beta details resource.
	 */
	@Path("/buildBetaDetails/{id}")
	@GET
	@Produces("application/json")
	BuildBetaDetailResponse readBuildBetaDetails(@PathParam("id") String id,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds);

	/**
	 * Get the build information for a specific build beta details resource.
	 */
	@Path("/buildBetaDetails/{id}/build")
	@GET
	@Produces("application/json")
	BuildResponse readBuildBetaDetailsBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds);

}
