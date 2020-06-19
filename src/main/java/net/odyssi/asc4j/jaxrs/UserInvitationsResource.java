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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.UserInvitationCreateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/userInvitations")
public interface UserInvitationsResource {

	/**
	 * Get a list of pending invitations to join your team.
	 * 
	 * @return The service response
	 */
	@Path("/")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInvitedUsers(@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[users]") List<String> fieldsUsers, @QueryParam("include") List<String> include,
			@QueryParam("sort") List<String> sort, @QueryParam("filter[roles]") List<String> filterRoles,
			@QueryParam("filter[visibleApps]") List<String> filterVisibleApps,
			@QueryParam("filter[username]") List<String> filterUsername, @QueryParam("limit") Integer limit,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Invite a user with assigned user roles to join your team.
	 * 
	 * @return The service response
	 */
	@Path("/")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response inviteUser(UserInvitationCreateRequest data);

	/**
	 * Get information about a pending invitation to join your team.
	 * 
	 * @return The service response
	 */
	@Path("/{invitationIdentifier}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserInvitation(@PathParam("invitationIdentifier") String invitationIdentifier,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("fields[users]") List<String> fieldsUsers,
			@QueryParam("include") List<String> include, @QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Cancel a pending invitation for a user to join your team.
	 * 
	 * @return The service response
	 */
	@Path("/{invitationIdentifier}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	public Response cancelUserInvitation(@PathParam("invitationIdentifier") String invitationIdentifier);

	/**
	 * Get a list of apps that will be visible to a user with a pending invitation.
	 * 
	 * @return The service response
	 */
	@Path("/{invitationIdentifier}/visibleApps")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserInvitationVisibleApps(@PathParam("invitationIdentifier") String invitationIdentifier,
			@QueryParam("limit") Integer limit, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get a list of app resource IDs that will be visible to a user with a pending
	 * invitation.
	 * 
	 * @return The service response
	 */
	@Path("/{invitationIdentifier}/relationships/visibleApps")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserInvitationVisibleAppIDs(@QueryParam("limit") Integer limit,
			@PathParam("invitationIdentifier") String invitationIdentifier);
}
