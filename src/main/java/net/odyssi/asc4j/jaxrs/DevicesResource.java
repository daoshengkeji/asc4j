package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.DeviceCreateRequest;
import net.odyssi.asc4j.model.DeviceUpdateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/devices")
public interface DevicesResource {

	// TODO Produces

	/**
	 * Find and list devices registered to your team.
	 * 
	 * @return The service response
	 */
	@GET
	public Response getDevices(@QueryParam("fields[devices]") List<String> fieldsDevices,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("filter[name]") List<String> filterName,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[status]") List<String> filterStatus,
			@QueryParam("filter[udid]") List<String> filterUdid, @QueryParam("limit") Integer limit,
			@QueryParam("sort") List<String> sort);

	/**
	 * Register a new device for app development.
	 * 
	 * @return The service response
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response createDevice(DeviceCreateRequest data);

	/**
	 * Get information for a specific device registered to your team.
	 * 
	 * @return The service response
	 */
	@Path("/{deviceIdentifier}")
	@GET
	public Response getDevice(@PathParam("deviceIdentifier") String deviceIdentifier,
			@QueryParam("fields[devices]") List<String> fieldsDevices);

	/**
	 * Update the name or status of a specific device.
	 * 
	 * @return The service response
	 */
	@Path("/{deviceIdentifier}")
	@PATCH
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response updateDevice(@PathParam("deviceIdentifier") String deviceIdentifier, DeviceUpdateRequest data);
}
