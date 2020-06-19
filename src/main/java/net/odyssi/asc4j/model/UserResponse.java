
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links", "included" })
public class UserResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The data structure that represents the resource.")
	private User data;

	@JsonProperty("included")
	@JsonPropertyDescription("")
	private List<App> included = new ArrayList<App>();

	@JsonProperty("links")
	@JsonPropertyDescription("Self-links to documents that can contain information for one or more resources.")
	private DocumentLinks links;

	public User getData() {
		return this.data;
	}

	public List<App> getIncluded() {
		return this.included;
	}

	public DocumentLinks getLinks() {
		return this.links;
	}

	public void setData(User data) {
		this.data = data;
	}

	public void setIncluded(List<App> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}