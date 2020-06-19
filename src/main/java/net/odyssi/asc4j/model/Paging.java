
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Paging other = (Paging) obj;
		if (this.limit == null) {
			if (other.limit != null) {
				return false;
			}
		} else if (!this.limit.equals(other.limit)) {
			return false;
		}
		if (this.total == null) {
			if (other.total != null) {
				return false;
			}
		} else if (!this.total.equals(other.total)) {
			return false;
		}
		return true;
	}

	public Integer getLimit() {
		return this.limit;
	}

	public Integer getTotal() {
		return this.total;
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
		result = prime * result + (this.limit == null ? 0 : this.limit.hashCode());
		result = prime * result + (this.total == null ? 0 : this.total.hashCode());
		return result;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paging [limit=" + this.limit + ", total=" + this.total + "]";
	}

}
