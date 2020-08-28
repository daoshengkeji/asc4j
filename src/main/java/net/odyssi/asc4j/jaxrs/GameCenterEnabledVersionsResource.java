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

import net.odyssi.asc4j.model.GameCenterEnabledVersionCompatibleVersionsLinkagesRequest;
import net.odyssi.asc4j.model.GameCenterEnabledVersionCompatibleVersionsLinkagesResponse;
import net.odyssi.asc4j.model.GameCenterEnabledVersionsResponse;

/**
 * @author sdnakhla
 *
 */
public interface GameCenterEnabledVersionsResource {

	@Path("/gameCenterEnabledVersions/{id}/relationships/compatibleVersions")
	@POST
	@Consumes("application/json")
	void addGameCenterEnabledVersionCompatibleVersions(@PathParam("id") String id,
			GameCenterEnabledVersionCompatibleVersionsLinkagesRequest data);

	@Path("/apps/{id}/gameCenterEnabledVersions")
	@GET
	@Produces("application/json")
	GameCenterEnabledVersionsResponse listAppGameCenterEnabledVersions(@PathParam("id") String id,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[versionString]") List<String> filterVersionString,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[gameCenterEnabledVersions]") List<String> fieldsGameCenterEnabledVersions,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	@Path("/gameCenterEnabledVersions/{id}/compatibleVersions")
	@GET
	@Produces("application/json")
	GameCenterEnabledVersionsResponse listCompatibleGameCenterEnabledVersions(@PathParam("id") String id,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[versionString]") List<String> filterVersionString,
			@QueryParam("filter[app]") List<String> filterApp, @QueryParam("filter[id]") List<String> filterId,
			@QueryParam("sort") List<String> sort,
			@QueryParam("fields[gameCenterEnabledVersions]") List<String> fieldsGameCenterEnabledVersions,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	@Path("/gameCenterEnabledVersions/{id}/relationships/compatibleVersions")
	@GET
	@Produces("application/json")
	GameCenterEnabledVersionCompatibleVersionsLinkagesResponse listGameCenterEnabledVersionCompatbleVersionIDs(
			@PathParam("id") String id, @QueryParam("limit") Integer limit);

	@Path("/gameCenterEnabledVersions/{id}/relationships/compatibleVersions")
	@DELETE
	@Consumes("application/json")
	void removeGameCenterEnabledVersionCompatibleVersions(@PathParam("id") String id,
			GameCenterEnabledVersionCompatibleVersionsLinkagesRequest data);

	@Path("/gameCenterEnabledVersions/{id}/relationships/compatibleVersions")
	@PATCH
	@Consumes("application/json")
	void replaceGameCenterEnabledVersionCompatibleVersions(@PathParam("id") String id,
			GameCenterEnabledVersionCompatibleVersionsLinkagesRequest data);

}
