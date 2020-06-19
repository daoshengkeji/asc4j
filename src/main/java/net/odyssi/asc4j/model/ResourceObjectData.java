
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "type" })
public class ResourceObjectData {

	@JsonProperty("id")
	@JsonPropertyDescription("The opaque resource ID that uniquely identifies the resource.")
	private String id;

	@JsonProperty("type")
	@JsonPropertyDescription("The resource type.")
	private String type;

	public String getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

}
