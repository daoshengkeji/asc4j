
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Attributes that describe a resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "firstName", "lastName", "provisioningAllowed", "allAppsVisible", "username", "roles" })
public class UserAttributes {

	@JsonProperty("allAppsVisible")
	@JsonPropertyDescription("A Boolean value that indicates whether a user has access to all apps available to the team.")
	private Boolean allAppsVisible;

	@JsonProperty("firstName")
	@JsonPropertyDescription("The user's first name.")
	private String firstName;

	@JsonProperty("lastName")
	@JsonPropertyDescription("The user's last name.")
	private String lastName;

	@JsonProperty("provisioningAllowed")
	@JsonPropertyDescription("A Boolean value that indicates the user's specified role allows access to the provisioning functionality on the Apple Developer website.")
	private Boolean provisioningAllowed;

	@JsonProperty("roles")
	@JsonPropertyDescription("Assigned user roles that determine the user's access to sections of App Store Connect and tasks they can perform.")
	private List<UserRole> roles = new ArrayList<UserRole>();

	@JsonProperty("username")
	@JsonPropertyDescription("The user's Apple ID.")
	private String username;

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
		UserAttributes other = (UserAttributes) obj;
		if (this.allAppsVisible == null) {
			if (other.allAppsVisible != null) {
				return false;
			}
		} else if (!this.allAppsVisible.equals(other.allAppsVisible)) {
			return false;
		}
		if (this.firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!this.firstName.equals(other.firstName)) {
			return false;
		}
		if (this.lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!this.lastName.equals(other.lastName)) {
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
		if (this.username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!this.username.equals(other.username)) {
			return false;
		}
		return true;
	}

	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Boolean getProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	public List<UserRole> getRoles() {
		return this.roles;
	}

	public String getUsername() {
		return this.username;
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
		result = prime * result + (this.firstName == null ? 0 : this.firstName.hashCode());
		result = prime * result + (this.lastName == null ? 0 : this.lastName.hashCode());
		result = prime * result + (this.provisioningAllowed == null ? 0 : this.provisioningAllowed.hashCode());
		result = prime * result + (this.roles == null ? 0 : this.roles.hashCode());
		result = prime * result + (this.username == null ? 0 : this.username.hashCode());
		return result;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setProvisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAttributes [allAppsVisible=" + this.allAppsVisible + ", firstName=" + this.firstName + ", lastName="
				+ this.lastName + ", provisioningAllowed=" + this.provisioningAllowed + ", roles=" + this.roles
				+ ", username=" + this.username + "]";
	}

}
