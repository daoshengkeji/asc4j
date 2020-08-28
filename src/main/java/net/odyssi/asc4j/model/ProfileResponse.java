
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ProfileResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class ProfileResponse {

	/**
	 * Profile
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private Profile data;
	@JsonProperty("included")
	private List<Object> included = new ArrayList<Object>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * Profile
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public Profile getData() {
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
	public DocumentLinks getLinks() {
		return this.links;
	}

	/**
	 * Profile
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(Profile data) {
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
	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
