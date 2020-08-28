
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserInvitationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "included", "links" })
public class UserInvitationResponse {

	/**
	 * UserInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private UserInvitation data;
	@JsonProperty("included")
	private List<App> included = new ArrayList<App>();
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private DocumentLinks links;

	/**
	 * UserInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public UserInvitation getData() {
		return this.data;
	}

	@JsonProperty("included")
	public List<App> getIncluded() {
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
	 * UserInvitation
	 * <p>
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(UserInvitation data) {
		this.data = data;
	}

	@JsonProperty("included")
	public void setIncluded(List<App> included) {
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
