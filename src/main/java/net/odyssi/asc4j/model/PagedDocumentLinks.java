
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

}
