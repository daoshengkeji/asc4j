
package net.odyssi.asc4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a list of resources.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class BundleIdsResponse extends BaseServiceResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The resource data")
	private List<BundleId> data;

	@JsonProperty("included")
	@JsonPropertyDescription("The requested relationship data.\n" + "Possible types: Profile, BundleIdCapability")
	private List<Object> included;

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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BundleIdsResponse other = (BundleIdsResponse) obj;
		if (this.data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!this.data.equals(other.data)) {
			return false;
		}
		if (this.included == null) {
			if (other.included != null) {
				return false;
			}
		} else if (!this.included.equals(other.included)) {
			return false;
		}
		return true;
	}

	public List<BundleId> getData() {
		return this.data;
	}

	public List<Object> getIncluded() {
		return this.included;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.data == null ? 0 : this.data.hashCode());
		result = prime * result + (this.included == null ? 0 : this.included.hashCode());
		return result;
	}

	public void setData(List<BundleId> data) {
		this.data = data;
	}

	public void setIncluded(List<Object> included) {
		this.included = included;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdsResponse [data=" + this.data + ", included=" + this.included + "]";
	}
}
