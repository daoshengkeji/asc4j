/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.IdfaDeclarationCreateRequest;
import net.odyssi.asc4j.model.IdfaDeclarationResponse;
import net.odyssi.asc4j.model.IdfaDeclarationUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface AdvertisingIdentifierDeclarationsResource {

	/**
	 * Declare the IDFA usage for an App Store version.
	 */
	@Path("/idfaDeclarations")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	IdfaDeclarationResponse createIDFADeclaration(IdfaDeclarationCreateRequest data);

	/**
	 * Delete the IDFA declaration that is associated with a version.
	 */
	@Path("/idfaDeclarations/{id}")
	@DELETE
	void deleteIDFADeclaration(@PathParam("id") String id);

	/**
	 * Update your declared IDFA usage.
	 */
	@Path("/idfaDeclarations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	IdfaDeclarationResponse modifyIDFADeclaration(@PathParam("id") String id, IdfaDeclarationUpdateRequest data);

}
