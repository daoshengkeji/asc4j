
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

}
