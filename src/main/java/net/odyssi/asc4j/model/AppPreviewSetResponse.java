
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppPreviewSetResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class AppPreviewSetResponse {

	/**
	 * AppPreviewSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppPreviewSet data;
	@JsonProperty("included")
	private List<AppPreview> included = new ArrayList<AppPreview>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppPreviewSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppPreviewSet getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<AppPreview> getIncluded() {
		return this.included;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public DocumentLinks getLinks() {
		return this.links;
	}

	/**
	 * AppPreviewSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppPreviewSet data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<AppPreview> included) {
		this.included = included;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
