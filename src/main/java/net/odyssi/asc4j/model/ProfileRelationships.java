
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "certificates", "devices", "bundleId" })
public class ProfileRelationships implements RelationshipObject {

	@JsonProperty("bundleId")
	@JsonPropertyDescription("")
	private ProfileRelationshipsBundleId bundleId;

	@JsonProperty("certificates")
	@JsonPropertyDescription("")
	private ProfileRelationshipsCertificates certificates;

	@JsonProperty("devices")
	@JsonPropertyDescription("")
	private ProfileRelationshipsDevices devices;

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
		ProfileRelationships other = (ProfileRelationships) obj;
		if (this.bundleId == null) {
			if (other.bundleId != null) {
				return false;
			}
		} else if (!this.bundleId.equals(other.bundleId)) {
			return false;
		}
		if (this.certificates == null) {
			if (other.certificates != null) {
				return false;
			}
		} else if (!this.certificates.equals(other.certificates)) {
			return false;
		}
		if (this.devices == null) {
			if (other.devices != null) {
				return false;
			}
		} else if (!this.devices.equals(other.devices)) {
			return false;
		}
		return true;
	}

	public ProfileRelationshipsBundleId getBundleId() {
		return this.bundleId;
	}

	public ProfileRelationshipsCertificates getCertificates() {
		return this.certificates;
	}

	public ProfileRelationshipsDevices getDevices() {
		return this.devices;
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
		result = prime * result + (this.certificates == null ? 0 : this.certificates.hashCode());
		result = prime * result + (this.devices == null ? 0 : this.devices.hashCode());
		return result;
	}

	public void setBundleId(ProfileRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
	}

	public void setCertificates(ProfileRelationshipsCertificates certificates) {
		this.certificates = certificates;
	}

	public void setDevices(ProfileRelationshipsDevices devices) {
		this.devices = devices;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfileRelationships [bundleId=" + this.bundleId + ", certificates=" + this.certificates + ", devices="
				+ this.devices + "]";
	}

}
