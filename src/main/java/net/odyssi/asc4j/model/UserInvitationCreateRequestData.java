
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
		UserInvitationCreateRequestData other = (UserInvitationCreateRequestData) obj;
		if (this.attributes == null) {
			if (other.attributes != null) {
				return false;
			}
		} else if (!this.attributes.equals(other.attributes)) {
			return false;
		}
		if (this.relationships == null) {
			if (other.relationships != null) {
				return false;
			}
		} else if (!this.relationships.equals(other.relationships)) {
			return false;
		}
		if (this.type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!this.type.equals(other.type)) {
			return false;
		}
		return true;
	}

	public UserInvitationCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	public UserInvitationCreateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	public String getType() {
		return this.type;
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
		result = prime * result + (this.attributes == null ? 0 : this.attributes.hashCode());
		result = prime * result + (this.relationships == null ? 0 : this.relationships.hashCode());
		result = prime * result + (this.type == null ? 0 : this.type.hashCode());
		return result;
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInvitationCreateRequestData [attributes=" + this.attributes + ", relationships="
				+ this.relationships + ", type=" + this.type + "]";
	}

}
