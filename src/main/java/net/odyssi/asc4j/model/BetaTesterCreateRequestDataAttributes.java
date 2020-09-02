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
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BetaTesterCreateRequestDataAttributes
 */
@JsonPropertyOrder({ BetaTesterCreateRequestDataAttributes.JSON_PROPERTY_FIRST_NAME,
		BetaTesterCreateRequestDataAttributes.JSON_PROPERTY_LAST_NAME,
		BetaTesterCreateRequestDataAttributes.JSON_PROPERTY_EMAIL })

public class BetaTesterCreateRequestDataAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 650919808128089708L;

	public static final String JSON_PROPERTY_EMAIL = "email";

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	public static final String JSON_PROPERTY_LAST_NAME = "lastName";

	private String email;

	private String firstName;
	private String lastName;

	public BetaTesterCreateRequestDataAttributes email(String email) {

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
		BetaTesterCreateRequestDataAttributes betaTesterCreateRequestDataAttributes = (BetaTesterCreateRequestDataAttributes) o;
		return Objects.equals(this.firstName, betaTesterCreateRequestDataAttributes.firstName)
				&& Objects.equals(this.lastName, betaTesterCreateRequestDataAttributes.lastName)
				&& Objects.equals(this.email, betaTesterCreateRequestDataAttributes.email);
	}

	public BetaTesterCreateRequestDataAttributes firstName(String firstName) {

		this.firstName = firstName;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	@NotNull

	@JsonProperty(JSON_PROPERTY_EMAIL)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public String getEmail() {
		return this.email;
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

	@Override
	public int hashCode() {
		return Objects.hash(this.firstName, this.lastName, this.email);
	}

	public BetaTesterCreateRequestDataAttributes lastName(String lastName) {

		this.lastName = lastName;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		sb.append("class BetaTesterCreateRequestDataAttributes {\n");
		sb.append("    firstName: ").append(toIndentedString(this.firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(this.lastName)).append("\n");
		sb.append("    email: ").append(toIndentedString(this.email)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
