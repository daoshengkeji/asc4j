
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BetaAppReviewSubmissionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class BetaAppReviewSubmissionResponse {

	/**
	 * BetaAppReviewSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private BetaAppReviewSubmission data;
	@JsonProperty("included")
	private List<Build> included = new ArrayList<Build>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * BetaAppReviewSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public BetaAppReviewSubmission getData() {
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
	public DocumentLinks getLinks() {
		return this.links;
	}

	/**
	 * BetaAppReviewSubmission
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(BetaAppReviewSubmission data) {
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
	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
