
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

}
