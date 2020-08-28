
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "data" })
public class BetaAppReviewSubmission {

	@JsonProperty("data")
	private Data__2 data;
	@JsonProperty("links")
	private Links__4 links;

	@JsonProperty("data")
	public Data__2 getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__4 getLinks() {
		return this.links;
	}

	@JsonProperty("data")
	public void setData(Data__2 data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__4 links) {
		this.links = links;
	}

}
