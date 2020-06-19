
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class UserUpdateRequestData extends ResourceObjectData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private UserUpdateRequestDataAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("The types and IDs of the related data to update.")
	private UserUpdateRequestDataRelationships relationships;

	public UserUpdateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	public UserUpdateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(UserUpdateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserUpdateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	// TODO attrs/relationships

}
