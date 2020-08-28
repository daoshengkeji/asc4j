
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "related" })
public class Links__6 {

	@JsonProperty("related")
	private String related;
	@JsonProperty("self")
	private String self;

	@JsonProperty("related")
	public String getRelated() {
		return this.related;
	}

	@JsonProperty("self")
	public String getSelf() {
		return this.self;
	}

	@JsonProperty("related")
	public void setRelated(String related) {
		this.related = related;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

}
