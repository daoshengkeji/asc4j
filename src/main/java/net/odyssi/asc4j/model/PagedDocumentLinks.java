
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "first", "next" })
public class PagedDocumentLinks {

	@JsonProperty("first")
	private String first;
	@JsonProperty("next")
	private String next;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("self")
	private String self;

	@JsonProperty("first")
	public String getFirst() {
		return this.first;
	}

	@JsonProperty("next")
	public String getNext() {
		return this.next;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("self")
	public String getSelf() {
		return this.self;
	}

	@JsonProperty("first")
	public void setFirst(String first) {
		this.first = first;
	}

	@JsonProperty("next")
	public void setNext(String next) {
		this.next = next;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

}
