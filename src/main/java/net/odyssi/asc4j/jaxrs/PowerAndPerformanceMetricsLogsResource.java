/**
 *
 */
package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import net.odyssi.asc4j.model.DiagnosticLogsResponse;
import net.odyssi.asc4j.model.DiagnosticSignaturesResponse;
import net.odyssi.asc4j.model.PerfPowerMetricsResponse;

/**
 * @author sdnakhla
 *
 */
public interface PowerAndPerformanceMetricsLogsResource {

	/**
	 * Get the anonymized backtrace logs associated with a specific diagnostic
	 * signature.
	 */
	@Path("/diagnosticSignatures/{id}/logs")
	@GET
	@Produces("application/json")
	DiagnosticLogsResponse downloadDiagnosticSignatureLogs(@PathParam("id") String id,
			@QueryParam("limit") Integer limit);

	/**
	 * Get the performance and power metrics data for the most recent versions of an
	 * app.
	 */
	@Path("/apps/{id}/perfPowerMetrics")
	@GET
	@Produces("application/json")
	PerfPowerMetricsResponse getAppPowerAndPerformanceMetrics(@PathParam("id") String id,
			@QueryParam("filter[deviceType]") List<String> filterDeviceType,
			@QueryParam("filter[metricType]") List<String> filterMetricType,
			@QueryParam("filter[platform]") List<String> filterPlatform);

	/**
	 * Get the performance and power metrics data for a specific build.
	 */
	@Path("/builds/{id}/perfPowerMetrics")
	@GET
	@Produces("application/json")
	PerfPowerMetricsResponse getBuildPowerAndPerformanceMetrics(@PathParam("id") String id,
			@QueryParam("filter[deviceType]") List<String> filterDeviceType,
			@QueryParam("filter[metricType]") List<String> filterMetricType,
			@QueryParam("filter[platform]") List<String> filterPlatform);

	/**
	 * List the aggregate backtrace signatures captured for a specific build.
	 */
	@Path("/builds/{id}/diagnosticSignatures")
	@GET
	@Produces("application/json")
	DiagnosticSignaturesResponse listBuildDiagnosticSignatures(@PathParam("id") String id,
			@QueryParam("filter[diagnosticType]") List<String> filterDiagnosticType,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("limit") Integer limit);

}
