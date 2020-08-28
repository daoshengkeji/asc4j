/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.BetaTesterInvitationCreateRequest;
import net.odyssi.asc4j.model.BetaTesterInvitationResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaTesterInvitationsResource {

	/**
	 * Send or resend an invitation to a beta tester to test a specified app.
	 */
	@Path("/betaTesterInvitations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BetaTesterInvitationResponse sendBetaTesterInvitation(BetaTesterInvitationCreateRequest data);

}
