
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "visibleApps" })
public class UserRelationships {

	@JsonProperty("visibleApps")
	@JsonPropertyDescription("")
	private UserRelationshipsVisibleApps visibleApps;

	public UserRelationshipsVisibleApps getVisibleApps() {
		return this.visibleApps;
	}

	public void setVisibleApps(UserRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
	}

}
