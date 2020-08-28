
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppScreenshotSetsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links", "meta" })
public class AppScreenshotSetsResponse {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<AppScreenshotSet> data = new ArrayList<AppScreenshotSet>();
	@JsonProperty("included")
	private List<AppScreenshot> included = new ArrayList<AppScreenshot>();
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
	public List<AppScreenshotSet> getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<AppScreenshot> getIncluded() {
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
	public void setData(List<AppScreenshotSet> data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<AppScreenshot> included) {
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
