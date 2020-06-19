
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
public class BundleIdRelationships {

	@JsonProperty("bundleIdCapabilities")
	@JsonPropertyDescription("")
	private BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities;

	@JsonProperty("profiles")
	@JsonPropertyDescription("")
	private BundleIdRelationshipsProfiles profiles;

	public BundleIdRelationshipsBundleIdCapabilities getBundleIdCapabilities() {
		return this.bundleIdCapabilities;
	}

	public BundleIdRelationshipsProfiles getProfiles() {
		return this.profiles;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bundleIdCapabilities == null) ? 0 : bundleIdCapabilities.hashCode());
		result = prime * result + ((profiles == null) ? 0 : profiles.hashCode());
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
		BundleIdRelationships other = (BundleIdRelationships) obj;
		if (bundleIdCapabilities == null) {
			if (other.bundleIdCapabilities != null)
				return false;
		} else if (!bundleIdCapabilities.equals(other.bundleIdCapabilities))
			return false;
		if (profiles == null) {
			if (other.profiles != null)
				return false;
		} else if (!profiles.equals(other.profiles))
			return false;
		return true;
	}

}
