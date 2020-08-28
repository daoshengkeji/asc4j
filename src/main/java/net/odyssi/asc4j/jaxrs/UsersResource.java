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

import net.odyssi.asc4j.model.AppsResponse;
import net.odyssi.asc4j.model.UserResponse;
import net.odyssi.asc4j.model.UserUpdateRequest;
import net.odyssi.asc4j.model.UserVisibleAppsLinkagesRequest;
import net.odyssi.asc4j.model.UserVisibleAppsLinkagesResponse;
import net.odyssi.asc4j.model.UsersResponse;

/**
 * @author sdnakhla
 *
 */
public interface UsersResource {

	/**
	 * Give a user on your team access to one or more apps.
	 */
	@Path("/users/{id}/relationships/visibleApps")
	@POST
	@Consumes("application/json")
	void addUserVisibleApp(@PathParam("id") String id, UserVisibleAppsLinkagesRequest data);

	/**
	 * Get a list of app resource IDs to which a user on your team has access.
	 */
	@Path("/users/{id}/relationships/visibleApps")
	@GET
	@Produces("application/json")
	UserVisibleAppsLinkagesResponse getUserVisibleAppResourceIDs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get a list of the users on your team.
	 */
	@Path("/users")
	@GET
	@Produces("application/json")
	UsersResponse listUsers(@QueryParam("filter[roles]") List<String> filterRoles,
			@QueryParam("filter[username]") List<String> filterUsername,
			@QueryParam("filter[visibleApps]") List<String> filterVisibleApps, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[users]") List<String> fieldsUsers, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Get a list of apps that a user on your team can view.
	 */
	@Path("/users/{id}/visibleApps")
	@GET
	@Produces("application/json")
	AppsResponse listUserVisibleApps(@PathParam("id") String id, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit") Integer limit);

	/**
	 * Change a user's role, app visibility information, or other account details.
	 */
	@Path("/users/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	UserResponse modifyUserAccount(@PathParam("id") String id, UserUpdateRequest data);

	/**
	 * Get information about a user on your team, such as name, roles, and app
	 * visibility.
	 */
	@Path("/users/{id}")
	@GET
	@Produces("application/json")
	UserResponse readUserInformation(@PathParam("id") String id, @QueryParam("fields[users]") List<String> fieldsUsers,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Remove a user from your team.
	 */
	@Path("/users/{id}")
	@DELETE
	void removeUserAccount(@PathParam("id") String id);

	/**
	 * Remove a user on your team’s access to one or more apps.
	 */
	@Path("/users/{id}/relationships/visibleApps")
	@DELETE
	@Consumes("application/json")
	void removeUserVisibleApps(@PathParam("id") String id, UserVisibleAppsLinkagesRequest data);

	/**
	 * Replace the list of apps a user on your team can see.
	 */
	@Path("/users/{id}/relationships/visibleApps")
	@PATCH
	@Consumes("application/json")
	void replaceUserVisibleApps(@PathParam("id") String id, UserVisibleAppsLinkagesRequest data);

}
