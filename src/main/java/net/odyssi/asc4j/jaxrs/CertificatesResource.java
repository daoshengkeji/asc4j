package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.CertificateCreateRequest;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/certificates")
public interface CertificatesResource {

	// TODO Produces

	/**
	 * Find and list certificates and download their data.
	 * 
	 * @return The service response
	 */
	@GET
	public Response getCertificates(@QueryParam("fields[certificates]") List<String> fieldsCertificates,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("filter[serialNumber]") List<String> filterSerialNumber, @QueryParam("limit") Integer limit,
			@QueryParam("sort") List<String> sort,
			@QueryParam("filter[certificateType]") List<String> filterCertificateType,
			@QueryParam("filter[displayName]") List<String> filterDisplayName);

	/**
	 * Create a new certificate using a certificate signing request.
	 * 
	 * @return The service response
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response createCertificate(CertificateCreateRequest data);

	/**
	 * Get information about a certificate and download the certificate data.
	 * 
	 * @return The service response
	 */
	@Path("/{certificateIdentifier}")
	@GET
	public Response getCertificate(@PathParam("certificateIdentifier") String certificateIdentifier,
			@QueryParam("fields[certificates]") List<String> fieldsCertificates);

	/**
	 * Revoke a lost, stolen, compromised, or expiring signing certificate.
	 * 
	 * @return The service response
	 */
	@Path("/{certificateIdentifier}")
	@DELETE
	public Response revokeCertificate(@PathParam("certificateIdentifier") String certificateIdentifier);
}
