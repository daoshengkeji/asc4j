
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

}
