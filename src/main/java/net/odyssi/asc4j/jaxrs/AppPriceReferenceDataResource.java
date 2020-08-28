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

import net.odyssi.asc4j.model.AppPricePointResponse;
import net.odyssi.asc4j.model.AppPricePointsResponse;
import net.odyssi.asc4j.model.AppPriceTierResponse;
import net.odyssi.asc4j.model.AppPriceTiersResponse;
import net.odyssi.asc4j.model.TerritoryResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppPriceReferenceDataResource {

	/**
	 * List all app price points available in App Store Connect, including related
	 * price tier, developer proceeds, and territory.
	 */
	@Path("/appPricePoints")
	@GET
	@Produces("application/json")
	AppPricePointsResponse listAppPricePoints(@QueryParam("filter[priceTier]") List<String> filterPriceTier,
			@QueryParam("filter[territory]") List<String> filterTerritory,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[territories]") List<String> fieldsTerritories);

	/**
	 * List price points across all App Store territories for a specific price tier.
	 */
	@Path("/appPriceTiers/{id}/pricePoints")
	@GET
	@Produces("application/json")
	AppPricePointsResponse listAppPriceTierPricePoints(@PathParam("id") String id,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("limit") Integer limit);

	/**
	 * List all app price tiers available in App Store Connect, including related
	 * price points.
	 */
	@Path("/appPriceTiers")
	@GET
	@Produces("application/json")
	AppPriceTiersResponse listAppPriceTiers(@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("limit[pricePoints]") Integer limitPricePoints);

	/**
	 * Read the customer prices and your proceeds for a price tier.
	 */
	@Path("/appPricePoints/{id}")
	@GET
	@Produces("application/json")
	AppPricePointResponse readAppPricePoint(@PathParam("id") String id,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[territories]") List<String> fieldsTerritories);

	/**
	 * Get the territory in which a specific price point applies.
	 */
	@Path("/appPricePoints/{id}/territory")
	@GET
	@Produces("application/json")
	TerritoryResponse readAppPricePointTerritory(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories);

	/**
	 * Read available app price tiers.
	 */
	@Path("/appPriceTiers/{id}")
	@GET
	@Produces("application/json")
	AppPriceTierResponse readAppPriceTier(@PathParam("id") String id,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("limit[pricePoints]") Integer limitPricePoints);

}
