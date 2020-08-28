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

import net.odyssi.asc4j.model.BuildIconsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BuildIconsResource {

	/**
	 * List all the icons for various platforms delivered with a build.
	 */
	@Path("/builds/{id}/icons")
	@GET
	@Produces("application/json")
	BuildIconsResponse listBuildIcons(@PathParam("id") String id,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons, @QueryParam("limit") Integer limit);

}
