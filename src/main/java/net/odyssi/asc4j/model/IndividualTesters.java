
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "meta", "data" })
public class IndividualTesters {

	@JsonProperty("data")
	private List<Datum> data = new ArrayList<Datum>();
	@JsonProperty("links")
	private Links links;
	@JsonProperty("meta")
	private PagingInformation meta;

	@JsonProperty("data")
	public List<Datum> getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links getLinks() {
		return this.links;
	}

	@JsonProperty("meta")
	public PagingInformation getMeta() {
		return this.meta;
	}

	@JsonProperty("data")
	public void setData(List<Datum> data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links links) {
		this.links = links;
	}

	@JsonProperty("meta")
	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

}
