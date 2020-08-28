
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppPriceTierResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class AppPriceTierResponse {

	/**
	 * AppPriceTier
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppPriceTier data;
	@JsonProperty("included")
	private List<AppPricePoint> included = new ArrayList<AppPricePoint>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppPriceTier
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppPriceTier getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<AppPricePoint> getIncluded() {
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
	 * AppPriceTier
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppPriceTier data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<AppPricePoint> included) {
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
