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
@Path("/salesReports")
public interface SalesReportsResource {

	/**
	 * Download sales and trends reports filtered by your specified criteria.
	 */
	@GET
	@Produces({ "application/a-gzip" })
	public Response getSalesAndTrendsReports(@QueryParam("filter[reportDate]") String filterReportDate,
			@QueryParam("filter[reportType]") List<String> filterReportType,
			@QueryParam("filter[vendorNumber]") List<String> filterVendorNumber,
			@QueryParam("filter[frequency]") List<String> filterFrequency,
			@QueryParam("filter[reportSubType]") List<String> filterReportSubType,
			@QueryParam("filter[version]") List<String> filterVersion);
}
