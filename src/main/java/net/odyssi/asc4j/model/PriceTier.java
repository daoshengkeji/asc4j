
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "data" })
public class PriceTier {

	@JsonProperty("data")
	private Data__1 data;
	@JsonProperty("links")
	private Links__1 links;

	@JsonProperty("data")
	public Data__1 getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__1 getLinks() {
		return this.links;
	}

	@JsonProperty("data")
	public void setData(Data__1 data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__1 links) {
		this.links = links;
	}

}
