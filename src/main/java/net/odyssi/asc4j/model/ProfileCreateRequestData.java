
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attributes", "relationships", "type" })
public class ProfileCreateRequestData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private ProfileAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("")
	private ProfileRelationships relationships;

	@JsonProperty("type")
	@JsonPropertyDescription("Value: profiles")
	private String type;

	public ProfileAttributes getAttributes() {
		return this.attributes;
	}

	public ProfileRelationships getRelationships() {
		return this.relationships;
	}

	public String getType() {
		return this.type;
	}

	public void setAttributes(ProfileAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(ProfileRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(String type) {
		this.type = type;
	}

}
