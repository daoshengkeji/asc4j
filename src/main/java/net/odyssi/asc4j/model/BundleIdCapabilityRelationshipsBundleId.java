
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class BundleIdCapabilityRelationshipsBundleId {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private ResourceObjectData data;

	@JsonProperty("links")
	@JsonPropertyDescription("")
	private ResourceObjectLinks links;

	public ResourceObjectData getData() {
		return this.data;
	}

	public ResourceObjectLinks getLinks() {
		return this.links;
	}

	public void setData(ResourceObjectData data) {
		this.data = data;
	}

	public void setLinks(ResourceObjectLinks links) {
		this.links = links;
	}

}
