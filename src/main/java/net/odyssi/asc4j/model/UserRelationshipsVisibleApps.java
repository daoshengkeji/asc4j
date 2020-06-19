
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "meta", "data", "links" })
public class UserRelationshipsVisibleApps {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<ResourceObjectData> data = new ArrayList<ResourceObjectData>();

	@JsonProperty("links")
	@JsonPropertyDescription("")
	private ResourceObjectLinks links;

	@JsonProperty("meta")
	@JsonPropertyDescription("Paging information for data responses.")
	private PagingInformation meta;

	public List<ResourceObjectData> getData() {
		return this.data;
	}

	public ResourceObjectLinks getLinks() {
		return this.links;
	}

	public PagingInformation getMeta() {
		return this.meta;
	}

	public void setData(List<ResourceObjectData> data) {
		this.data = data;
	}

	public void setLinks(ResourceObjectLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

}
