
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionPhasedReleaseResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class AppStoreVersionPhasedReleaseResponse {

	/**
	 * AppStoreVersionPhasedRelease
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private AppStoreVersionPhasedRelease data;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * AppStoreVersionPhasedRelease
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public AppStoreVersionPhasedRelease getData() {
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
	 * AppStoreVersionPhasedRelease
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(AppStoreVersionPhasedRelease data) {
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
