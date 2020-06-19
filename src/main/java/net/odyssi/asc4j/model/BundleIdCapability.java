
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
		BundleIdCapability other = (BundleIdCapability) obj;
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

	public BundleIdCapability getAttributes() {
		return this.attributes;
	}

	public BundleIdCapabilityRelationships getRelationships() {
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
		int result = 1;
		result = prime * result + (this.attributes == null ? 0 : this.attributes.hashCode());
		result = prime * result + (this.relationships == null ? 0 : this.relationships.hashCode());
		return result;
	}

	public void setAttributes(BundleIdCapability attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(BundleIdCapabilityRelationships relationships) {
		this.relationships = relationships;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdCapability [attributes=" + this.attributes + ", relationships=" + this.relationships + "]";
	}

	// TODO attrs/relationships
}
