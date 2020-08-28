
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreReviewDetailResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class AppStoreReviewDetailResponse {

	/**
	 * AppStoreReviewDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppStoreReviewDetail data;
	@JsonProperty("included")
	private List<AppStoreReviewAttachment> included = new ArrayList<AppStoreReviewAttachment>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppStoreReviewDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppStoreReviewDetail getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<AppStoreReviewAttachment> getIncluded() {
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
	 * AppStoreReviewDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppStoreReviewDetail data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<AppStoreReviewAttachment> included) {
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
