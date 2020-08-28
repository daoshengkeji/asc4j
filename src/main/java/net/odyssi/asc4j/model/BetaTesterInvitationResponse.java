
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BetaTesterInvitationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class BetaTesterInvitationResponse {

	/**
	 * BetaTesterInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private BetaTesterInvitation data;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * BetaTesterInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public BetaTesterInvitation getData() {
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
	 * BetaTesterInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(BetaTesterInvitation data) {
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
