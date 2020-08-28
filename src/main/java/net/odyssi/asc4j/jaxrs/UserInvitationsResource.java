/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppsResponse;
import net.odyssi.asc4j.model.UserInvitationCreateRequest;
import net.odyssi.asc4j.model.UserInvitationResponse;
import net.odyssi.asc4j.model.UserInvitationsResponse;

/**
 * @author sdnakhla
 *
 */
public interface UserInvitationsResource {

	/**
	 * Cancel a pending invitation for a user to join your team.
	 */
	@Path("/userInvitations/{id}")
	@DELETE
	void cancelUserInvitation(@PathParam("id") String id);

	/**
	 * Invite a user with assigned user roles to join your team.
	 */
	@Path("/userInvitations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	UserInvitationResponse inviteUser(UserInvitationCreateRequest data);

	/**
	 * Get a list of pending invitations to join your team.
	 */
	@Path("/userInvitations")
	@GET
	@Produces("application/json")
	UserInvitationsResponse listInvitedUsers(@QueryParam("filter[email]") List<String> filterEmail,
			@QueryParam("filter[roles]") List<String> filterRoles,
			@QueryParam("filter[visibleApps]") List<String> filterVisibleApps, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[userInvitations]") List<String> fieldsUserInvitations,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Get a list of apps that will be visible to a user with a pending invitation.
	 */
	@Path("/userInvitations/{id}/visibleApps")
	@GET
	@Produces("application/json")
	AppsResponse listInvitedUserVisibleApps(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit);

	/**
	 * Get information about a pending invitation to join your team.
	 */
	@Path("/userInvitations/{id}")
	@GET
	@Produces("application/json")
	UserInvitationResponse readUserInvitation(@PathParam("id") String id,
			@QueryParam("fields[userInvitations]") List<String> fieldsUserInvitations,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

}
