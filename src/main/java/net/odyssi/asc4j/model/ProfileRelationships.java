
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
public class ProfileRelationships {

	@JsonProperty("bundleId")
	@JsonPropertyDescription("")
	private ProfileRelationshipsBundleId bundleId;

	@JsonProperty("certificates")
	@JsonPropertyDescription("")
	private ProfileRelationshipsCertificates certificates;

	@JsonProperty("devices")
	@JsonPropertyDescription("")
	private ProfileRelationshipsDevices devices;

	public ProfileRelationshipsBundleId getBundleId() {
		return this.bundleId;
	}

	public ProfileRelationshipsCertificates getCertificates() {
		return this.certificates;
	}

	public ProfileRelationshipsDevices getDevices() {
		return this.devices;
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

}
