
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppScreenshotSetResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class AppScreenshotSetResponse {

	/**
	 * AppScreenshotSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppScreenshotSet data;
	@JsonProperty("included")
	private List<AppScreenshot> included = new ArrayList<AppScreenshot>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppScreenshotSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppScreenshotSet getData() {
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
	public DocumentLinks getLinks() {
		return this.links;
	}

	/**
	 * AppScreenshotSet
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppScreenshotSet data) {
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
	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
