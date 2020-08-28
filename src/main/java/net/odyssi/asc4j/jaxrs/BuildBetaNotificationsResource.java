/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.BuildBetaNotificationCreateRequest;
import net.odyssi.asc4j.model.BuildBetaNotificationResponse;

/**
 * @author sdnakhla
 *
 */
public interface BuildBetaNotificationsResource {

	/**
	 * Send a notification to all assigned beta testers that a build is available
	 * for testing.
	 */
	@Path("/buildBetaNotifications")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	BuildBetaNotificationResponse sendBetaBuildNotification(BuildBetaNotificationCreateRequest data);

}
