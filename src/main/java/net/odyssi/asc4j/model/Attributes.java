
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "roles", "allAppsVisible", "provisioningAllowed" })
public class Attributes {

	@JsonProperty("allAppsVisible")
	private Boolean allAppsVisible;
	@JsonProperty("provisioningAllowed")
	private Boolean provisioningAllowed;
	@JsonProperty("roles")
	private List<UserRole> roles = new ArrayList<UserRole>();

	@JsonProperty("allAppsVisible")
	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	@JsonProperty("provisioningAllowed")
	public Boolean getProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	@JsonProperty("roles")
	public List<UserRole> getRoles() {
		return this.roles;
	}

	@JsonProperty("allAppsVisible")
	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	@JsonProperty("provisioningAllowed")
	public void setProvisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
	}

	@JsonProperty("roles")
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

}
