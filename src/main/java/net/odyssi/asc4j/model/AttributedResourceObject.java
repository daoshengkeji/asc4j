/**
 *
 */
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * The abstract base class for {@link ResourceObject}s that have attributes and
 * relationships
 *
 */
public abstract class AttributedResourceObject<T extends AttributesObject, R extends RelationshipObject>
		extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private T attributes = null;

	@JsonProperty("relationships")
	@JsonPropertyDescription("")
	private R relationships = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("rawtypes")
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
		AttributedResourceObject other = (AttributedResourceObject) obj;
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

	public T getAttributes() {
		return this.attributes;
	}

	public R getRelationships() {
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

	public void setAttributes(T attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(R relationships) {
		this.relationships = relationships;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AttributedResourceObject [attributes=" + this.attributes + ", relationships=" + this.relationships
				+ "]";
	}
}
