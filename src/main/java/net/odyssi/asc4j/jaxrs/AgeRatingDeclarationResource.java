/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.odyssi.asc4j.model.AgeRatingDeclarationResponse;
import net.odyssi.asc4j.model.AgeRatingDeclarationUpdateRequest;

/**
 * @author sdnakhla
 *
 */
public interface AgeRatingDeclarationResource {

	/**
	 * Provide age-related information so the App Store can determine the age rating
	 * for your app.
	 */
	@Path("/ageRatingDeclarations/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	AgeRatingDeclarationResponse modifyAgeRatingDeclaration(@PathParam("id") String id,
			AgeRatingDeclarationUpdateRequest data);

}
