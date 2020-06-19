
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
public class UserUpdateRequest {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private UserUpdateRequestData data;

	public UserUpdateRequestData getData() {
		return this.data;
	}

	public void setData(UserUpdateRequestData data) {
		this.data = data;
	}

}