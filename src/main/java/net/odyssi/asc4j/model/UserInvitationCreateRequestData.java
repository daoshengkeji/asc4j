
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "attributes", "relationships" })
public class UserInvitationCreateRequestData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("Attributes that describe a resource.")
	private UserInvitationCreateRequestDataAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("")
	private UserInvitationCreateRequestDataRelationships relationships;

	@JsonProperty("type")
	@JsonPropertyDescription("The resource type.\nValue: userInvitations")
	private String type;

	public UserInvitationCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	public UserInvitationCreateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	public String getType() {
		return this.type;
	}

	public void setAttributes(UserInvitationCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserInvitationCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(String type) {
		this.type = type;
	}

}
