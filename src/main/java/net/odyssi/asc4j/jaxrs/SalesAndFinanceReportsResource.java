/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author sdnakhla
 *
 */
public interface SalesAndFinanceReportsResource {

	/**
	 * Download finance reports filtered by your specified criteria.
	 */
	@Path("/financeReports")
	@GET
	@Produces("gzip")
	String downloadFinanceReports(@QueryParam("filter[regionCode]") List<String> filterRegionCode,
			@QueryParam("filter[reportDate]") List<String> filterReportDate,
			@QueryParam("filter[reportType]") List<String> filterReportType,
			@QueryParam("filter[vendorNumber]") List<String> filterVendorNumber);

	/**
	 * Download sales and trends reports filtered by your specified criteria.
	 */
	@Path("/salesReports")
	@GET
	@Produces("gzip")
	String downloadSalesAndTrendsReports(@QueryParam("filter[frequency]") List<String> filterFrequency,
			@QueryParam("filter[reportDate]") List<String> filterReportDate,
			@QueryParam("filter[reportSubType]") List<String> filterReportSubType,
			@QueryParam("filter[reportType]") List<String> filterReportType,
			@QueryParam("filter[vendorNumber]") List<String> filterVendorNumber,
			@QueryParam("filter[version]") List<String> filterVersion);

}
