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

import net.odyssi.asc4j.model.RoutingAppCoverageCreateRequest;
import net.odyssi.asc4j.model.RoutingAppCoverageResponse;
import net.odyssi.asc4j.model.RoutingAppCoverageUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface RoutingAppCoveragesResource {

	/**
	 * Attach a routing app coverage file to an App Store version.
	 */
	@Path("/routingAppCoverages")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	RoutingAppCoverageResponse createRoutingAppCoverage(RoutingAppCoverageCreateRequest data);

	/**
	 * Delete the routing app coverage file that is associated with a version.
	 */
	@Path("/routingAppCoverages/{id}")
	@DELETE
	void deleteRoutingAppCoverage(@PathParam("id") String id);

	/**
	 * Commit a routing app coverage file after uploading it.
	 */
	@Path("/routingAppCoverages/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	RoutingAppCoverageResponse modifyRoutingAppCoverage(@PathParam("id") String id,
			RoutingAppCoverageUpdateRequest data);

	/**
	 * Get the routing app coverage file that is associated with a specific App
	 * Store version
	 */
	@Path("/appStoreVersions/{id}/routingAppCoverage")
	@GET
	@Produces("application/json")
	RoutingAppCoverageResponse readAppStoreVersionRoutingAppCoverage(@PathParam("id") String id,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages);

	/**
	 * Get information about the routing app coverage file and its upload and
	 * processing status.
	 */
	@Path("/routingAppCoverages/{id}")
	@GET
	@Produces("application/json")
	RoutingAppCoverageResponse readRoutingAppCoverageInformation(@PathParam("id") String id,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages,
			@QueryParam("include") List<String> include);

}
