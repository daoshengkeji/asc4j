
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "data" })
public class PreOrder {

	@JsonProperty("data")
	private Data__3 data;
	@JsonProperty("links")
	private Links__9 links;

	@JsonProperty("data")
	public Data__3 getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__9 getLinks() {
		return this.links;
	}

	@JsonProperty("data")
	public void setData(Data__3 data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__9 links) {
		this.links = links;
	}

}
