
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PreReleaseVersionsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links", "meta" })
public class PreReleaseVersionsResponse {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<PreReleaseVersion> data = new ArrayList<PreReleaseVersion>();
	@JsonProperty("included")
	private List<Object> included = new ArrayList<Object>();
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
	public List<PreReleaseVersion> getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<Object> getIncluded() {
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
	public void setData(List<PreReleaseVersion> data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<Object> included) {
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
