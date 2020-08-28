
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "meta", "data" })
public class BetaAppLocalizations {

	@JsonProperty("data")
	private List<Datum__3> data = new ArrayList<Datum__3>();
	@JsonProperty("links")
	private Links__3 links;
	@JsonProperty("meta")
	private PagingInformation meta;

	@JsonProperty("data")
	public List<Datum__3> getData() {
		return this.data;
	}

	@JsonProperty("links")
	public Links__3 getLinks() {
		return this.links;
	}

	@JsonProperty("meta")
	public PagingInformation getMeta() {
		return this.meta;
	}

	@JsonProperty("data")
	public void setData(List<Datum__3> data) {
		this.data = data;
	}

	@JsonProperty("links")
	public void setLinks(Links__3 links) {
		this.links = links;
	}

	@JsonProperty("meta")
	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

}
