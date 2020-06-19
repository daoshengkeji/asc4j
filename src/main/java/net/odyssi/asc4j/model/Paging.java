
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Paging details such as the total number of resources and the per-page limit.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "total", "limit" })
public class Paging {

	@JsonProperty("limit")
	@JsonPropertyDescription("The maximum number of resources to return per page, from 0 to 200.")
	private Integer limit;

	@JsonProperty("total")
	@JsonPropertyDescription("The total number of resources matching your request.")
	private Integer total;

	public Integer getLimit() {
		return this.limit;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
