
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paging other = (Paging) obj;
		if (limit == null) {
			if (other.limit != null)
				return false;
		} else if (!limit.equals(other.limit))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

}
