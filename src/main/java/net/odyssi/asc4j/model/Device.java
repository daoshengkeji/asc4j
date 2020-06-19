
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The data structure that represents the resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Device extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private DeviceAttributes attributes;

	public DeviceAttributes getAttributes() {
		return this.attributes;
	}

	public void setAttributes(DeviceAttributes attributes) {
		this.attributes = attributes;
	}

}
