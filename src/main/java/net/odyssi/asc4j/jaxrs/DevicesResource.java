/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.DeviceCreateRequest;
import net.odyssi.asc4j.model.DeviceResponse;
import net.odyssi.asc4j.model.DeviceUpdateRequest;
import net.odyssi.asc4j.model.DevicesResponse;

/**
 * @author sdnakhla
 *
 */
public interface DevicesResource {

	/**
	 * Find and list devices registered to your team.
	 */
	@Path("/devices")
	@GET
	@Produces("application/json")
	DevicesResponse listDevices(@QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[status]") List<String> filterStatus,
			@QueryParam("filter[udid]") List<String> filterUdid, @QueryParam("filter[id]") List<String> filterId,
			@QueryParam("sort") List<String> sort, @QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("limit") Integer limit);

	/**
	 * Update the name or status of a specific device.
	 */
	@Path("/devices/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	DeviceResponse modifyRegisteredDevice(@PathParam("id") String id, DeviceUpdateRequest data);

	/**
	 * Get information for a specific device registered to your team.
	 */
	@Path("/devices/{id}")
	@GET
	@Produces("application/json")
	DeviceResponse readDevice(@PathParam("id") String id, @QueryParam("fields[devices]") List<String> fieldsDevices);

	/**
	 * Register a new device for app development.
	 */
	@Path("/devices")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	DeviceResponse registerDevice(DeviceCreateRequest data);

}
