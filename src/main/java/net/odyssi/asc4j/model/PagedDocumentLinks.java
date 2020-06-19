
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Links related to the response document, including paging links.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "first", "next", "self", "related" })
public class PagedDocumentLinks {

	@JsonProperty("first")
	@JsonPropertyDescription("The link to the first page of documents.")
	private String first;

	@JsonProperty("next")
	@JsonPropertyDescription("The link to the next page of documents.")
	private String next;

	@JsonProperty("related")
	@JsonPropertyDescription("")
	private String related;

	@JsonProperty("self")
	@JsonPropertyDescription("The link that produced the current document.")
	private String self;

	public String getFirst() {
		return this.first;
	}

	public String getNext() {
		return this.next;
	}

	public String getRelated() {
		return this.related;
	}

	public String getSelf() {
		return this.self;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setNext(String next) {
		this.next = next;
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
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
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
		PagedDocumentLinks other = (PagedDocumentLinks) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
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
