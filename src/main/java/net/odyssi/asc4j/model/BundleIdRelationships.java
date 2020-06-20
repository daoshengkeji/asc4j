
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "profiles", "bundleIdCapabilities" })
public class BundleIdRelationships implements RelationshipObject {

	@JsonProperty("bundleIdCapabilities")
	@JsonPropertyDescription("")
	private BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities;

	@JsonProperty("profiles")
	@JsonPropertyDescription("")
	private BundleIdRelationshipsProfiles profiles;

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
		BundleIdRelationships other = (BundleIdRelationships) obj;
		if (this.bundleIdCapabilities == null) {
			if (other.bundleIdCapabilities != null) {
				return false;
			}
		} else if (!this.bundleIdCapabilities.equals(other.bundleIdCapabilities)) {
			return false;
		}
		if (this.profiles == null) {
			if (other.profiles != null) {
				return false;
			}
		} else if (!this.profiles.equals(other.profiles)) {
			return false;
		}
		return true;
	}

	public BundleIdRelationshipsBundleIdCapabilities getBundleIdCapabilities() {
		return this.bundleIdCapabilities;
	}

	public BundleIdRelationshipsProfiles getProfiles() {
		return this.profiles;
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
		result = prime * result + (this.bundleIdCapabilities == null ? 0 : this.bundleIdCapabilities.hashCode());
		result = prime * result + (this.profiles == null ? 0 : this.profiles.hashCode());
		return result;
	}

	public void setBundleIdCapabilities(BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities) {
		this.bundleIdCapabilities = bundleIdCapabilities;
	}

	public void setProfiles(BundleIdRelationshipsProfiles profiles) {
		this.profiles = profiles;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdRelationships [bundleIdCapabilities=" + this.bundleIdCapabilities + ", profiles="
				+ this.profiles + "]";
	}

}
