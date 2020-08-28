
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "meta", "data" })
public class GameCenterEnabledVersions {

	@JsonProperty("data")
	private List<Datum__9> data = new ArrayList<Datum__9>();
	@JsonProperty("links")
	private Links links;
	@JsonProperty("meta")
	private PagingInformation meta;

	@JsonProperty("data")
	public List<Datum__9> getData() {
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
	public void setData(List<Datum__9> data) {
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
