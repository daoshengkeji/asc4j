package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/financeReports")
public interface FinanceReportsResource {

	/**
	 * Download finance reports filtered by your specified criteria.
	 * 
	 * @return The service response
	 */
	@GET
	@Produces({ "application/a-gzip" })
	public Response getFinanceReports(@QueryParam("filter[regionCode]") List<String> filterRegionCode,
			@QueryParam("filter[reportDate]") String filterReportDate,
			@QueryParam("filter[reportType]") List<String> filterReportType,
			@QueryParam("filter[vendorNumber]") List<String> filterVendorNumber);
}
