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

import net.odyssi.asc4j.model.TerritoriesResponse;
import net.odyssi.asc4j.model.TerritoryResponse;

/**
 * @author sdnakhla
 *
 */
public interface TerritoriesResource {

	/**
	 * Get a list of App Store territories where an app is or will be available.
	 */
	@Path("/apps/{id}/availableTerritories")
	@GET
	@Produces("application/json")
	TerritoriesResponse listAppAvailableTerritories(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories, @QueryParam("limit") Integer limit);

	/**
	 * List all the App Store territories to which a specific custom app license
	 * agreement applies.
	 */
	@Path("/endUserLicenseAgreements/{id}/territories")
	@GET
	@Produces("application/json")
	TerritoriesResponse listEndUserLicenseAgreementTerritories(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories, @QueryParam("limit") Integer limit);

	/**
	 * List all territories where the App Store operates.
	 */
	@Path("/territories")
	@GET
	@Produces("application/json")
	TerritoriesResponse listTerritories(@QueryParam("fields[territories]") List<String> fieldsTerritories,
			@QueryParam("limit") Integer limit);

	/**
	 * Get the territory in which a specific price point applies.
	 */
	@Path("/appPricePoints/{id}/territory")
	@GET
	@Produces("application/json")
	TerritoryResponse readAppPricePointTerritory(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories);

}
