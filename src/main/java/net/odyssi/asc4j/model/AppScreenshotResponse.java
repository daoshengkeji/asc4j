
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppScreenshotResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class AppScreenshotResponse {

	/**
	 * AppScreenshot
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppScreenshot data;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppScreenshot
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppScreenshot getData() {
		return this.data;
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
	 * AppScreenshot
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppScreenshot data) {
		this.data = data;
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
