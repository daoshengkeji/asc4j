
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "data" })
public class AppStoreReviewDetail {

	@JsonProperty("data")
	private Data__5 data;
	@JsonProperty("links")
	private Links__6 links;

	@JsonProperty("data")
	public Data__5 getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__6 getLinks() {
		return this.links;
	}

	@JsonProperty("data")
	public void setData(Data__5 data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__6 links) {
		this.links = links;
	}

}
