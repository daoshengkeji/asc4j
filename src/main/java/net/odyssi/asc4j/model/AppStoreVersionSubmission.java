
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "data" })
public class AppStoreVersionSubmission {

	@JsonProperty("data")
	private Data__6 data;
	@JsonProperty("links")
	private Links__7 links;

	@JsonProperty("data")
	public Data__6 getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__7 getLinks() {
		return this.links;
	}

	@JsonProperty("data")
	public void setData(Data__6 data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__7 links) {
		this.links = links;
	}

}
