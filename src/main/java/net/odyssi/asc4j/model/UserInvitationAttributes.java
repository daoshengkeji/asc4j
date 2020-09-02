/*
 * App Store Connect API
 * Automate the tasks you perform on the Apple Developer website and in App Store Connect.  The App Store Connect API is a REST API that enables the automation of actions you take in App Store Connect.  Calls to the API require JSON Web Tokens (JWT) for authorization; you obtain keys to create the tokens from your organization’s App Store Connect account.
 *
 * The version of the OpenAPI document: 1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserInvitationAttributes
 */
@JsonPropertyOrder({ UserInvitationAttributes.JSON_PROPERTY_EMAIL, UserInvitationAttributes.JSON_PROPERTY_FIRST_NAME,
		UserInvitationAttributes.JSON_PROPERTY_LAST_NAME, UserInvitationAttributes.JSON_PROPERTY_EXPIRATION_DATE,
		UserInvitationAttributes.JSON_PROPERTY_ROLES, UserInvitationAttributes.JSON_PROPERTY_ALL_APPS_VISIBLE,
		UserInvitationAttributes.JSON_PROPERTY_PROVISIONING_ALLOWED })

public class UserInvitationAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -5851291013171284947L;

	public static final String JSON_PROPERTY_ALL_APPS_VISIBLE = "allAppsVisible";

	public static final String JSON_PROPERTY_EMAIL = "email";
	public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	public static final String JSON_PROPERTY_LAST_NAME = "lastName";

	public static final String JSON_PROPERTY_PROVISIONING_ALLOWED = "provisioningAllowed";
	public static final String JSON_PROPERTY_ROLES = "roles";

	private Boolean allAppsVisible;

	private String email;
	private OffsetDateTime expirationDate;

	private String firstName;
	private String lastName;

	private Boolean provisioningAllowed;
	private List<UserRole> roles = null;

	public UserInvitationAttributes addRolesItem(UserRole rolesItem) {
		if (this.roles == null) {
			this.roles = new ArrayList<>();
		}
		this.roles.add(rolesItem);
		return this;
	}

	public UserInvitationAttributes allAppsVisible(Boolean allAppsVisible) {

		this.allAppsVisible = allAppsVisible;
		return this;
	}

	public UserInvitationAttributes email(String email) {

		this.email = email;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserInvitationAttributes userInvitationAttributes = (UserInvitationAttributes) o;
		return Objects.equals(this.email, userInvitationAttributes.email)
				&& Objects.equals(this.firstName, userInvitationAttributes.firstName)
				&& Objects.equals(this.lastName, userInvitationAttributes.lastName)
				&& Objects.equals(this.expirationDate, userInvitationAttributes.expirationDate)
				&& Objects.equals(this.roles, userInvitationAttributes.roles)
				&& Objects.equals(this.allAppsVisible, userInvitationAttributes.allAppsVisible)
				&& Objects.equals(this.provisioningAllowed, userInvitationAttributes.provisioningAllowed);
	}

	public UserInvitationAttributes expirationDate(OffsetDateTime expirationDate) {

		this.expirationDate = expirationDate;
		return this;
	}

	public UserInvitationAttributes firstName(String firstName) {

		this.firstName = firstName;
		return this;
	}

	/**
	 * Get allAppsVisible
	 *
	 * @return allAppsVisible
	 **/

	@JsonProperty(JSON_PROPERTY_ALL_APPS_VISIBLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getAllAppsVisible() {
		return this.allAppsVisible;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/

	@JsonProperty(JSON_PROPERTY_EMAIL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getEmail() {
		return this.email;
	}

	/**
	 * Get expirationDate
	 *
	 * @return expirationDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getExpirationDate() {
		return this.expirationDate;
	}

	/**
	 * Get firstName
	 *
	 * @return firstName
	 **/

	@JsonProperty(JSON_PROPERTY_FIRST_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Get lastName
	 *
	 * @return lastName
	 **/

	@JsonProperty(JSON_PROPERTY_LAST_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Get provisioningAllowed
	 *
	 * @return provisioningAllowed
	 **/

	@JsonProperty(JSON_PROPERTY_PROVISIONING_ALLOWED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	/**
	 * Get roles
	 *
	 * @return roles
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_ROLES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<UserRole> getRoles() {
		return this.roles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.email, this.firstName, this.lastName, this.expirationDate, this.roles,
				this.allAppsVisible, this.provisioningAllowed);
	}

	public UserInvitationAttributes lastName(String lastName) {

		this.lastName = lastName;
		return this;
	}

	public UserInvitationAttributes provisioningAllowed(Boolean provisioningAllowed) {

		this.provisioningAllowed = provisioningAllowed;
		return this;
	}

	public UserInvitationAttributes roles(List<UserRole> roles) {

		this.roles = roles;
		return this;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
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

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserInvitationAttributes {\n");
		sb.append("    email: ").append(toIndentedString(this.email)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(this.firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(this.lastName)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
		sb.append("    roles: ").append(toIndentedString(this.roles)).append("\n");
		sb.append("    allAppsVisible: ").append(toIndentedString(this.allAppsVisible)).append("\n");
		sb.append("    provisioningAllowed: ").append(toIndentedString(this.provisioningAllowed)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
