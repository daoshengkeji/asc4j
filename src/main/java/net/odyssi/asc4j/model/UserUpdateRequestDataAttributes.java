
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
public class UserUpdateRequestDataAttributes implements AttributesObject {

	@JsonProperty("allAppsVisible")
	@JsonPropertyDescription("Assigned user roles that determine the user's access to sections of App Store Connect and tasks they can perform.")
	private Boolean allAppsVisible;

	@JsonProperty("provisioningAllowed")
	@JsonPropertyDescription("A Boolean value that indicates the user's specified role allows access to the provisioning functionality on the Apple Developer website.")
	private Boolean provisioningAllowed;

	@JsonProperty("roles")
	@JsonPropertyDescription("Assigned user roles that determine the user's access to sections of App Store Connect and tasks they can perform.")
	private List<UserRole> roles = new ArrayList<UserRole>();

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserUpdateRequestDataAttributes other = (UserUpdateRequestDataAttributes) obj;
		if (this.allAppsVisible == null) {
			if (other.allAppsVisible != null) {
				return false;
			}
		} else if (!this.allAppsVisible.equals(other.allAppsVisible)) {
			return false;
		}
		if (this.provisioningAllowed == null) {
			if (other.provisioningAllowed != null) {
				return false;
			}
		} else if (!this.provisioningAllowed.equals(other.provisioningAllowed)) {
			return false;
		}
		if (this.roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!this.roles.equals(other.roles)) {
			return false;
		}
		return true;
	}

	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	public Boolean getProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	public List<UserRole> getRoles() {
		return this.roles;
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
		result = prime * result + (this.allAppsVisible == null ? 0 : this.allAppsVisible.hashCode());
		result = prime * result + (this.provisioningAllowed == null ? 0 : this.provisioningAllowed.hashCode());
		result = prime * result + (this.roles == null ? 0 : this.roles.hashCode());
		return result;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserUpdateRequestDataAttributes [allAppsVisible=" + this.allAppsVisible + ", provisioningAllowed="
				+ this.provisioningAllowed + ", roles=" + this.roles + "]";
	}

}
