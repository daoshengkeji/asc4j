
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
		PagedDocumentLinks other = (PagedDocumentLinks) obj;
		if (this.first == null) {
			if (other.first != null) {
				return false;
			}
		} else if (!this.first.equals(other.first)) {
			return false;
		}
		if (this.next == null) {
			if (other.next != null) {
				return false;
			}
		} else if (!this.next.equals(other.next)) {
			return false;
		}
		if (this.related == null) {
			if (other.related != null) {
				return false;
			}
		} else if (!this.related.equals(other.related)) {
			return false;
		}
		if (this.self == null) {
			if (other.self != null) {
				return false;
			}
		} else if (!this.self.equals(other.self)) {
			return false;
		}
		return true;
	}

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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.first == null ? 0 : this.first.hashCode());
		result = prime * result + (this.next == null ? 0 : this.next.hashCode());
		result = prime * result + (this.related == null ? 0 : this.related.hashCode());
		result = prime * result + (this.self == null ? 0 : this.self.hashCode());
		return result;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PagedDocumentLinks [first=" + this.first + ", next=" + this.next + ", related=" + this.related
				+ ", self=" + this.self + "]";
	}

}
