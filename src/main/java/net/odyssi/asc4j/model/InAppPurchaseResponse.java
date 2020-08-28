
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * InAppPurchaseResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class InAppPurchaseResponse {

	/**
	 * InAppPurchase
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private InAppPurchase data;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * InAppPurchase
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public InAppPurchase getData() {
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
	 * InAppPurchase
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(InAppPurchase data) {
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
