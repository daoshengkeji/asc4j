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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.UserUpdateRequest;
import net.odyssi.asc4j.model.UserVisibleAppsLinkagesRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/users")
public interface UsersResource {

	/**
	 * Give a user on your team access to one or more apps.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}/relationships/visibleApps")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addUserVisibleApps(@PathParam("userIdentifier") String userIdentifier,
			UserVisibleAppsLinkagesRequest data);

	/**
	 * Get information about a user on your team, such as name, roles, and app
	 * visibility.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUser(@PathParam("userIdentifier") String userIdentifier,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("fields[users]") List<String> fieldsUsers,
			@QueryParam("include") List<String> include, @QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Get a list of the users on your team.
	 *
	 * @return The service response
	 */
	@Path("")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUsers(@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[users]") List<String> fieldsUsers, @QueryParam("include") List<String> include,
			@QueryParam("sort") List<String> sort, @QueryParam("filter[roles]") List<String> filterRoles,
			@QueryParam("filter[visibleApps]") List<String> filterVisibleApps,
			@QueryParam("filter[username]") List<String> filterUsername, @QueryParam("limit") Integer limit,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Get a list of app resource IDs to which a user on your team has access.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}/relationships/visibleApps")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserVisibleAppResourceIDs(@PathParam("userIdentifier") String userIdentifier,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of apps that a user on your team can view.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}/visibleApps")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserVisibleApps(@PathParam("userIdentifier") String userIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Remove a user from your team.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	public Response removeUser(@PathParam("userIdentifier") String userIdentifier);

	/**
	 * Remove a user on your team’s access to one or more apps.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}/relationships/visibleApps")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response removeUserVisibleApps(@PathParam("userIdentifier") String userIdentifier,
			UserVisibleAppsLinkagesRequest data);

	/**
	 * Change a user's role, app visibility information, or other account details.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}")
	@PATCH
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response updateUser(@PathParam("userIdentifier") String userIdentifier, UserUpdateRequest data);

	/**
	 * Replace the list of apps a user on your team can see.
	 *
	 * @return The service response
	 */
	@Path("/{userIdentifier}/relationships/visibleApps")
	@PATCH
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response updateUserVisibleApps(@PathParam("userIdentifier") String userIdentifier,
			UserVisibleAppsLinkagesRequest data);
}
