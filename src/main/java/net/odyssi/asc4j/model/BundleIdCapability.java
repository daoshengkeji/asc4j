
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The data structure that represents the resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class BundleIdCapability extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private BundleIdCapability attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("Navigational links to related data and included resource types and IDs.")
	private BundleIdCapabilityRelationships relationships;

	public BundleIdCapability getAttributes() {
		return this.attributes;
	}

	public BundleIdCapabilityRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(BundleIdCapability attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(BundleIdCapabilityRelationships relationships) {
		this.relationships = relationships;
	}

	// TODO attrs/relationships
}
