
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "related", "self" })
public class ResourceObjectLinks {

	@JsonProperty("related")
	@JsonPropertyDescription("")
	private String related;

	@JsonProperty("self")
	@JsonPropertyDescription("")
	private String self;

	public String getRelated() {
		return this.related;
	}

	public String getSelf() {
		return this.self;
	}

	public void setRelated(String related) {
		this.related = related;
	}

	public void setSelf(String self) {
		this.self = self;
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
		result = prime * result + ((related == null) ? 0 : related.hashCode());
		result = prime * result + ((self == null) ? 0 : self.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResourceObjectLinks other = (ResourceObjectLinks) obj;
		if (related == null) {
			if (other.related != null)
				return false;
		} else if (!related.equals(other.related))
			return false;
		if (self == null) {
			if (other.self != null)
				return false;
		} else if (!self.equals(other.self))
			return false;
		return true;
	}

}
