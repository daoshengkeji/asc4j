
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BuildBetaDetailResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class BuildBetaDetailResponse {

	/**
	 * BuildBetaDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private BuildBetaDetail data;
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
	 * BuildBetaDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public BuildBetaDetail getData() {
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
	 * BuildBetaDetail
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(BuildBetaDetail data) {
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
