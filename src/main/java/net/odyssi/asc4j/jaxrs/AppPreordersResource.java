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

import net.odyssi.asc4j.model.AppPreOrderCreateRequest;
import net.odyssi.asc4j.model.AppPreOrderResponse;
import net.odyssi.asc4j.model.AppPreOrderUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface AppPreordersResource {

	/**
	 * Turn on pre-order and set the expected app release date.
	 */
	@Path("/appPreOrders")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	AppPreOrderResponse createAppPreOrder(AppPreOrderCreateRequest data);

	/**
	 * Cancel a planned app pre-order that has not begun.
	 */
	@Path("/appPreOrders/{id}")
	@DELETE
	void deleteAppPreOrder(@PathParam("id") String id);

	/**
	 * Update the release date for your app pre-order.
	 */
	@Path("/appPreOrders/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AppPreOrderResponse modifyAppPreOrder(@PathParam("id") String id, AppPreOrderUpdateRequest data);

	/**
	 * Get information about your app's pre-order configuration.
	 */
	@Path("/appPreOrders/{id}")
	@GET
	@Produces("application/json")
	AppPreOrderResponse readAppPreOrderInformation(@PathParam("id") String id,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders,
			@QueryParam("include") List<String> include);

}
