
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self" })
public class DocumentLinks {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("self")
	private String self;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("self")
	public String getSelf() {
		return this.self;
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
