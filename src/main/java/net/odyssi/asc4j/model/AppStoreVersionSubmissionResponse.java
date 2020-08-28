
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionSubmissionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class AppStoreVersionSubmissionResponse {

	/**
	 * AppStoreVersionSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppStoreVersionSubmission data;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppStoreVersionSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppStoreVersionSubmission getData() {
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
	 * AppStoreVersionSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppStoreVersionSubmission data) {
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
