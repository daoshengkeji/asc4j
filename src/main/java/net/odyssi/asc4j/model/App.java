
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
public class App extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private AppAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("")
	private AppRelationships relationships;

	public AppAttributes getAttributes() {
		return this.attributes;
	}

	public AppRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(AppAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(AppRelationships relationships) {
		this.relationships = relationships;
	}

	// TODO attrs/relationships

}
