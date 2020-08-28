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

import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BuildsResponse;
import net.odyssi.asc4j.model.PreReleaseVersionResponse;
import net.odyssi.asc4j.model.PreReleaseVersionsResponse;

/**
 * @author sdnakhla
 *
 */
public interface PrereleaseVersionsResource {

	/**
	 * Get a list of builds of a specific prerelease version.
	 */
	@Path("/preReleaseVersions/{id}/builds")
	@GET
	@Produces("application/json")
	BuildsResponse listPrereleaseVersionBuilds(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit);

	/**
	 * Get a list of prerelease versions for all apps.
	 */
	@Path("/preReleaseVersions")
	@GET
	@Produces("application/json")
	PreReleaseVersionsResponse listPrereleaseVersions(
			@QueryParam("filter[builds.expired]") List<String> filterBuildsExpired,
			@QueryParam("filter[builds.processingState]") List<String> filterBuildsProcessingState,
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[version]") List<String> filterVersion,
			@QueryParam("filter[app]") List<String> filterApp, @QueryParam("filter[builds]") List<String> filterBuilds,
			@QueryParam("sort") List<String> sort,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit[builds]") Integer limitBuilds);

	/**
	 * Get the app information for a specific prerelease version.
	 */
	@Path("/preReleaseVersions/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readPrereleaseVersionAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get information about a specific prerelease version.
	 */
	@Path("/preReleaseVersions/{id}")
	@GET
	@Produces("application/json")
	PreReleaseVersionResponse readPrereleaseVersionInformation(@PathParam("id") String id,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("include") List<String> include, @QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[apps]") List<String> fieldsApps, @QueryParam("limit[builds]") Integer limitBuilds);

}
