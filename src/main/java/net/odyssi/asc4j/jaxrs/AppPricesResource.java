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

import net.odyssi.asc4j.model.AppPriceResponse;
import net.odyssi.asc4j.model.AppPricesResponse;

/**
 * @author sdnakhla
 *
 */
public interface AppPricesResource {

	/**
	 * Get current price tier of an app and any future planned price changes.
	 */
	@Path("/appPrices/{id}")
	@GET
	@Produces("application/json")
	AppPriceResponse listAppPrices(@PathParam("id") String id,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices, @QueryParam("include") List<String> include);

	/**
	 * Get current price tier of an app and any future planned price changes.
	 */
	@Path("/apps/{id}/prices")
	@GET
	@Produces("application/json")
	AppPricesResponse listAppPrices(@PathParam("id") String id,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

}
