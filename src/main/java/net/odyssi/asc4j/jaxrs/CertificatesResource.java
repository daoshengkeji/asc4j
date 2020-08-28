/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.CertificateCreateRequest;
import net.odyssi.asc4j.model.CertificateResponse;
import net.odyssi.asc4j.model.CertificatesResponse;

/**
 * @author sdnakhla
 *
 */
public interface CertificatesResource {

	/**
	 * Create a new certificate using a certificate signing request.
	 */
	@Path("/certificates")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	CertificateResponse createCertificate(CertificateCreateRequest data);

	/**
	 * Find and list certificates and download their data.
	 */
	@Path("/certificates")
	@GET
	@Produces("application/json")
	CertificatesResponse listCertificates(@QueryParam("filter[certificateType]") List<String> filterCertificateType,
			@QueryParam("filter[displayName]") List<String> filterDisplayName,
			@QueryParam("filter[serialNumber]") List<String> filterSerialNumber,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates, @QueryParam("limit") Integer limit);

	/**
	 * Get information about a certificate and download the certificate data.
	 */
	@Path("/certificates/{id}")
	@GET
	@Produces("application/json")
	CertificateResponse readCertificate(@PathParam("id") String id,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates);

	/**
	 * Revoke a lost, stolen, compromised, or expiring signing certificate.
	 */
	@Path("/certificates/{id}")
	@DELETE
	void revokeCertificate(@PathParam("id") String id);

}
