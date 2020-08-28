
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "total", "limit" })
public class Paging {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("limit")
	private Integer limit;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("total")
	private Integer total;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("limit")
	public Integer getLimit() {
		return this.limit;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("total")
	public Integer getTotal() {
		return this.total;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("limit")
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

}
