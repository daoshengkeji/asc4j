
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "allAppsVisible", "provisioningAllowed", "roles" })
public class UserUpdateRequestDataAttributes {

	@JsonProperty("allAppsVisible")
	@JsonPropertyDescription("Assigned user roles that determine the user's access to sections of App Store Connect and tasks they can perform.")
	private Boolean allAppsVisible;

	@JsonProperty("provisioningAllowed")
	@JsonPropertyDescription("A Boolean value that indicates the user's specified role allows access to the provisioning functionality on the Apple Developer website.")
	private Boolean provisioningAllowed;

	@JsonProperty("roles")
	@JsonPropertyDescription("Assigned user roles that determine the user's access to sections of App Store Connect and tasks they can perform.")
	private List<UserRole> roles = new ArrayList<UserRole>();

	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	public Boolean getProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	public List<UserRole> getRoles() {
		return this.roles;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setProvisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allAppsVisible == null) ? 0 : allAppsVisible.hashCode());
		result = prime * result + ((provisioningAllowed == null) ? 0 : provisioningAllowed.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserUpdateRequestDataAttributes other = (UserUpdateRequestDataAttributes) obj;
		if (allAppsVisible == null) {
			if (other.allAppsVisible != null)
				return false;
		} else if (!allAppsVisible.equals(other.allAppsVisible))
			return false;
		if (provisioningAllowed == null) {
			if (other.provisioningAllowed != null)
				return false;
		} else if (!provisioningAllowed.equals(other.provisioningAllowed))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

}
