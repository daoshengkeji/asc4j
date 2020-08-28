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

import net.odyssi.asc4j.model.AppResponse;
import net.odyssi.asc4j.model.BetaLicenseAgreementResponse;
import net.odyssi.asc4j.model.BetaLicenseAgreementUpdateRequest;
import net.odyssi.asc4j.model.BetaLicenseAgreementsResponse;

/**
 * @author sdnakhla
 *
 */
public interface BetaLicenseAgreementsResource {

	/**
	 * Find and list beta license agreements for all apps.
	 */
	@Path("/betaLicenseAgreements")
	@GET
	@Produces("application/json")
	BetaLicenseAgreementsResponse listBetaLicenseAgreements(@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Update the text for your beta license agreement.
	 */
	@Path("/betaLicenseAgreements/{id}")
	@PATCH
	@Produces("application/json")
	@Consumes("application/json")
	BetaLicenseAgreementResponse modifyBetaLicenseAgreement(@PathParam("id") String id,
			BetaLicenseAgreementUpdateRequest data);

	/**
	 * Get the app information for a specific beta license agreement.
	 */
	@Path("/betaLicenseAgreements/{id}/app")
	@GET
	@Produces("application/json")
	AppResponse readBetaLicenseAgreementAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Get a specific beta license agreement.
	 */
	@Path("/betaLicenseAgreements/{id}")
	@GET
	@Produces("application/json")
	BetaLicenseAgreementResponse readBetaLicenseAgreementInformation(@PathParam("id") String id,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

}
