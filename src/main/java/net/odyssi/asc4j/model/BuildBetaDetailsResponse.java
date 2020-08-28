
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BuildBetaDetailsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links", "meta" })
public class BuildBetaDetailsResponse {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<BuildBetaDetail> data = new ArrayList<BuildBetaDetail>();
	@JsonProperty("included")
	private List<Build> included = new ArrayList<Build>();
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
	public List<BuildBetaDetail> getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<Build> getIncluded() {
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
	public void setData(List<BuildBetaDetail> data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<Build> included) {
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
