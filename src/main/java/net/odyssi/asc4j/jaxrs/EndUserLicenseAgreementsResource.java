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

import net.odyssi.asc4j.model.EndUserLicenseAgreementCreateRequest;
import net.odyssi.asc4j.model.EndUserLicenseAgreementResponse;
import net.odyssi.asc4j.model.EndUserLicenseAgreementUpdateRequest;
import net.odyssi.asc4j.model.TerritoriesResponse;

/**
 * @author sdnakhla
 *
 */
public interface EndUserLicenseAgreementsResource {

	/**
	 * Add a custom end user license agreement (EULA) to an app and configure the
	 * territories to which it applies.
	 */
	@Path("/endUserLicenseAgreements")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	EndUserLicenseAgreementResponse createEndUserLicenseAgreement(EndUserLicenseAgreementCreateRequest data);

	/**
	 * Delete the custom end user license agreement that is associated with an app.
	 */
	@Path("/endUserLicenseAgreements/{id}")
	@DELETE
	void deleteEndUserLicenseAgreement(@PathParam("id") String id);

	/**
	 * List all the App Store territories to which a specific custom app license
	 * agreement applies.
	 */
	@Path("/endUserLicenseAgreements/{id}/territories")
	@GET
	@Produces("application/json")
	TerritoriesResponse listEndUserLicenseAgreementTerritories(@PathParam("id") String id,
			@QueryParam("fields[territories]") List<String> fieldsTerritories, @QueryParam("limit") Integer limit);

	/**
	 * Update the text or territories for your custom end user license agreement.
	 */
	@Path("/endUserLicenseAgreements/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	EndUserLicenseAgreementResponse modifyEndUserLicenseAgreement(@PathParam("id") String id,
			EndUserLicenseAgreementUpdateRequest data);

	/**
	 * Get the custom end user license agreement (EULA) for a specific app and the
	 * territories where the agreement applies.
	 */
	@Path("/apps/{id}/endUserLicenseAgreement")
	@GET
	@Produces("application/json")
	EndUserLicenseAgreementResponse readAppLicenseAgreement(@PathParam("id") String id,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements);

	/**
	 * Get the custom end user license agreement associated with an app, and the
	 * territories it applies to.
	 */
	@Path("/endUserLicenseAgreements/{id}")
	@GET
	@Produces("application/json")
	EndUserLicenseAgreementResponse readEndUserLicenseAgreement(@PathParam("id") String id,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[territories]") List<String> fieldsTerritories,
			@QueryParam("limit[territories]") Integer limitTerritories);

}
