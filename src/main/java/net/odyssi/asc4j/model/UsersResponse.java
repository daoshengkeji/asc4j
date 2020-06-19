
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

	@JsonProperty("included")
	@JsonPropertyDescription("")
	private List<App> included;

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<User> user;

	public List<App> getIncluded() {
		return this.included;
	}

	public List<User> getUser() {
		return this.user;
	}

	public void setIncluded(List<App> included) {
		this.included = included;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}
