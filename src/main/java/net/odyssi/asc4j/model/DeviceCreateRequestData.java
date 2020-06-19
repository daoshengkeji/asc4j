
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attributes", "type" })
public class DeviceCreateRequestData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private DeviceAttributes attributes;

	@JsonProperty("type")
	@JsonPropertyDescription("Value: devices")
	private String type;

	public DeviceAttributes getAttributes() {
		return this.attributes;
	}

	public String getType() {
		return this.type;
	}

	public void setAttributes(DeviceAttributes attributes) {
		this.attributes = attributes;
	}

	public void setType(String type) {
		this.type = type;
	}

}
