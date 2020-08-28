
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppEncryptionDeclarationsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links", "meta" })
public class AppEncryptionDeclarationsResponse {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<AppEncryptionDeclaration> data = new ArrayList<AppEncryptionDeclaration>();
	@JsonProperty("included")
	private List<App> included = new ArrayList<App>();
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
	public List<AppEncryptionDeclaration> getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<App> getIncluded() {
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
	public void setData(List<AppEncryptionDeclaration> data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<App> included) {
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
