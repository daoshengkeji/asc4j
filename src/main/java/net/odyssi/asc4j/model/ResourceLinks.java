
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Self-links to requested resources.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self" })
public class ResourceLinks {

	@JsonProperty("self")
	@JsonPropertyDescription("The link to the resource.")
	private String self;

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
		ResourceLinks other = (ResourceLinks) obj;
		if (this.self == null) {
			if (other.self != null) {
				return false;
			}
		} else if (!this.self.equals(other.self)) {
			return false;
		}
		return true;
	}

	public String getSelf() {
		return this.self;
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
		result = prime * result + (this.self == null ? 0 : this.self.hashCode());
		return result;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResourceLinks [self=" + this.self + "]";
	}

}
