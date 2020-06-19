
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
public class UsersResponse extends BaseServiceResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<User> data;

	@JsonProperty("included")
	@JsonPropertyDescription("")
	private List<App> included;

	public List<User> getData() {
		return this.data;
	}

	public List<App> getIncluded() {
		return this.included;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public void setIncluded(List<App> included) {
		this.included = included;
	}

}
