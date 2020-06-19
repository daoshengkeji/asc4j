
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A request containing a single resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class BundleIdUpdateRequest {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private BundleIdUpdateRequestData data;

	public BundleIdUpdateRequestData getData() {
		return this.data;
	}

	public void setData(BundleIdUpdateRequestData data) {
		this.data = data;
	}

}
