
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
public class UserInvitation extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private UserInvitationAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("Navigational links to related data and included resource types and IDs.")
	private UserInvitationRelationships relationships;

	public UserInvitationAttributes getAttributes() {
		return this.attributes;
	}

	public UserInvitationRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(UserInvitationAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserInvitationRelationships relationships) {
		this.relationships = relationships;
	}

}
