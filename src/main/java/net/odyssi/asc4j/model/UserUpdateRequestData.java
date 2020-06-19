
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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserUpdateRequestData other = (UserUpdateRequestData) obj;
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
		return true;
	}

	public UserUpdateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	public UserUpdateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.attributes == null ? 0 : this.attributes.hashCode());
		result = prime * result + (this.relationships == null ? 0 : this.relationships.hashCode());
		return result;
	}

	public void setAttributes(UserUpdateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserUpdateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserUpdateRequestData [attributes=" + this.attributes + ", relationships=" + this.relationships + "]";
	}

	// TODO attrs/relationships

}
