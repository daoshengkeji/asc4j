
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
public class BundleId extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private BundleIdAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("Navigational links to related data and included resource types and IDs.")
	private BundleIdRelationships relationships;

	public BundleIdAttributes getAttributes() {
		return this.attributes;
	}

	public BundleIdRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(BundleIdAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(BundleIdRelationships relationships) {
		this.relationships = relationships;
	}

	// TODO attrs/relationships
}
