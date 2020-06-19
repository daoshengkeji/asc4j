
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

	public List<BundleId> getData() {
		return this.data;
	}

	public List<Object> getIncluded() {
		return this.included;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((included == null) ? 0 : included.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BundleIdsResponse other = (BundleIdsResponse) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (included == null) {
			if (other.included != null)
				return false;
		} else if (!included.equals(other.included))
			return false;
		return true;
	}
}
