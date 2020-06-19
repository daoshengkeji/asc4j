
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.Date;
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
@JsonPropertyOrder({ "email", "firstName", "lastName", "roles", "expirationDate", "provisioningAllowed",
		"allAppsVisible" })
public class UserInvitationAttributes {

	@JsonProperty("allAppsVisible")
	@JsonPropertyDescription("A Boolean value that indicates whether a user has access to all apps available to the team.")
	private Boolean allAppsVisible;

	@JsonProperty("email")
	@JsonPropertyDescription("The email address of a pending user invitation. The email address must be valid to activate the account. It can be any email address, not necessarily one associated with an Apple ID.")
	private String email;

	@JsonProperty("expirationDate")
	@JsonPropertyDescription("The expiration date of the pending invitation.")
	private Date expirationDate;

	@JsonProperty("firstName")
	@JsonPropertyDescription("The first name of the user with the pending user invitation.")
	private String firstName;

	@JsonProperty("lastName")
	@JsonPropertyDescription("The last name of the user with the pending user invitation.")
	private String lastName;

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
		UserInvitationAttributes other = (UserInvitationAttributes) obj;
		if (this.allAppsVisible == null) {
			if (other.allAppsVisible != null) {
				return false;
			}
		} else if (!this.allAppsVisible.equals(other.allAppsVisible)) {
			return false;
		}
		if (this.email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!this.email.equals(other.email)) {
			return false;
		}
		if (this.expirationDate == null) {
			if (other.expirationDate != null) {
				return false;
			}
		} else if (!this.expirationDate.equals(other.expirationDate)) {
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
		return true;
	}

	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	public String getEmail() {
		return this.email;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
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
		result = prime * result + (this.email == null ? 0 : this.email.hashCode());
		result = prime * result + (this.expirationDate == null ? 0 : this.expirationDate.hashCode());
		result = prime * result + (this.firstName == null ? 0 : this.firstName.hashCode());
		result = prime * result + (this.lastName == null ? 0 : this.lastName.hashCode());
		result = prime * result + (this.provisioningAllowed == null ? 0 : this.provisioningAllowed.hashCode());
		result = prime * result + (this.roles == null ? 0 : this.roles.hashCode());
		return result;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInvitationAttributes [allAppsVisible=" + this.allAppsVisible + ", email=" + this.email
				+ ", expirationDate=" + this.expirationDate + ", firstName=" + this.firstName + ", lastName="
				+ this.lastName + ", provisioningAllowed=" + this.provisioningAllowed + ", roles=" + this.roles + "]";
	}

}
