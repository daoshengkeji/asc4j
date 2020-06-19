
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class UserInvitationCreateRequestDataRelationships {

	@JsonProperty("visibleApps")
	@JsonPropertyDescription("")
	private UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps;

	public UserInvitationCreateRequestDataRelationshipsVisibleApps getVisibleApps() {
		return this.visibleApps;
	}

	public void setVisibleApps(UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
	}

}
