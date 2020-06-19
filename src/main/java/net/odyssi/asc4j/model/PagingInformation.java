
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Paging information for data responses.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "paging" })
public class PagingInformation {

	@JsonProperty("paging")
	@JsonPropertyDescription("Paging details such as the total number of resources and the per-page limit.")
	private Paging paging;

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
		PagingInformation other = (PagingInformation) obj;
		if (this.paging == null) {
			if (other.paging != null) {
				return false;
			}
		} else if (!this.paging.equals(other.paging)) {
			return false;
		}
		return true;
	}

	public Paging getPaging() {
		return this.paging;
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
		result = prime * result + (this.paging == null ? 0 : this.paging.hashCode());
		return result;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PagingInformation [paging=" + this.paging + "]";
	}

}
