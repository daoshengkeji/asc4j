
package net.odyssi.asc4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a list of resources.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class DevicesResponse extends BaseServiceResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<Device> data;

	public List<Device> getData() {
		return this.data;
	}

	public void setData(List<Device> data) {
		this.data = data;
	}

}
