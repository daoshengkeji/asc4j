
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "bundleId" })
public class BundleIdCapabilityRelationships {

	@JsonProperty("bundleId")
	@JsonPropertyDescription("")
	private BundleId bundleId;

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
		BundleIdCapabilityRelationships other = (BundleIdCapabilityRelationships) obj;
		if (this.bundleId == null) {
			if (other.bundleId != null) {
				return false;
			}
		} else if (!this.bundleId.equals(other.bundleId)) {
			return false;
		}
		return true;
	}

	public BundleId getBundleId() {
		return this.bundleId;
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
		result = prime * result + (this.bundleId == null ? 0 : this.bundleId.hashCode());
		return result;
	}

	public void setBundleId(BundleId bundleId) {
		this.bundleId = bundleId;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdCapabilityRelationships [bundleId=" + this.bundleId + "]";
	}

}
