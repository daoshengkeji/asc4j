
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
@JsonPropertyOrder({

})
public class UserInvitationCreateRequest {

	@JsonProperty("data")
	@JsonPropertyDescription("The resource data")
	private UserInvitationCreateRequestData data;

	public UserInvitationCreateRequestData getData() {
		return this.data;
	}

	public void setData(UserInvitationCreateRequestData data) {
		this.data = data;
	}

}
