/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.AppEncryptionDeclarationResponse;
import net.odyssi.asc4j.model.AppEncryptionDeclarationsResponse;
import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BuildAppEncryptionDeclarationLinkageRequest;

/**
 * @author sdnakhla
 *
 */
public interface AppEncryptionDeclarationsResource {

	/**
	 * Assign an app encryption declaration to a build.
	 */
	@Path("/builds/{id}/relationships/appEncryptionDeclaration")
	@PATCH
	@Consumes("application/json")
	void assignBuildAppEncryptionDeclaration(@PathParam("id") String id,
			BuildAppEncryptionDeclarationLinkageRequest data);

	/**
	 * Find and list all available app encryption declarations.
	 */
	@Path("/appEncryptionDeclarations")
	@GET
	@Produces("application/json")
	AppEncryptionDeclarationsResponse listAppEncryptionDeclarations(
			@QueryParam("filter[platform]") List<String> filterPlatform,
			@QueryParam("filter[app]") List<String> filterApp, @QueryParam("filter[builds]") List<String> filterBuilds,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get information about a specific app encryption declaration.
	 */
	@Path("/appEncryptionDeclarations/{id}")
	@GET
	@Produces("application/json")
	AppEncryptionDeclarationResponse readAppEncryptionDeclaration(@PathParam("id") String id,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get the app information from a specific app encryption declaration.
	 */
	@Path("/appEncryptionDeclarations/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readAppEncryptionDeclarationAppInfo(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

}
