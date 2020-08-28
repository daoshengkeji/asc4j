
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * GameCenterEnabledVersionsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links", "meta" })
public class GameCenterEnabledVersionsResponse {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<net.odyssi.asc4j.model.GameCenterEnabledVersion> data = new ArrayList<net.odyssi.asc4j.model.GameCenterEnabledVersion>();
	@JsonProperty("included")
	private List<net.odyssi.asc4j.model.GameCenterEnabledVersion> included = new ArrayList<net.odyssi.asc4j.model.GameCenterEnabledVersion>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private PagedDocumentLinks links;
	@JsonProperty("meta")
	private PagingInformation meta;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public List<net.odyssi.asc4j.model.GameCenterEnabledVersion> getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<net.odyssi.asc4j.model.GameCenterEnabledVersion> getIncluded() {
		return this.included;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public PagedDocumentLinks getLinks() {
		return this.links;
	}

	@JsonProperty("meta")
	public PagingInformation getMeta() {
		return this.meta;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(List<net.odyssi.asc4j.model.GameCenterEnabledVersion> data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<net.odyssi.asc4j.model.GameCenterEnabledVersion> included) {
		this.included = included;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public void setLinks(PagedDocumentLinks links) {
		this.links = links;
	}

	@JsonProperty("meta")
	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

}
