
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
public class BundleIdsResponse extends BaseServiceResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The resource data")
	private List<BundleId> data;

	@JsonProperty("included")
	@JsonPropertyDescription("The requested relationship data.\n" + "Possible types: Profile, BundleIdCapability")
	private List<Object> included;

	public List<BundleId> getData() {
		return this.data;
	}

	public List<Object> getIncluded() {
		return this.included;
	}

	public void setData(List<BundleId> data) {
		this.data = data;
	}

	public void setIncluded(List<Object> included) {
		this.included = included;
	}
}
