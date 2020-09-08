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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BuildUpdateRequestDataAttributes
 */
@JsonPropertyOrder({ BuildUpdateRequestDataAttributes.JSON_PROPERTY_EXPIRED,
		BuildUpdateRequestDataAttributes.JSON_PROPERTY_USES_NON_EXEMPT_ENCRYPTION })

public class BuildUpdateRequestDataAttributes implements Serializable {
	public static final String JSON_PROPERTY_EXPIRED = "expired";

	public static final String JSON_PROPERTY_USES_NON_EXEMPT_ENCRYPTION = "usesNonExemptEncryption";

	/**
	 *
	 */
	private static final long serialVersionUID = 1716528553250412540L;

	private Boolean expired;
	private Boolean usesNonExemptEncryption;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BuildUpdateRequestDataAttributes buildUpdateRequestDataAttributes = (BuildUpdateRequestDataAttributes) o;
		return Objects.equals(this.expired, buildUpdateRequestDataAttributes.expired) && Objects
				.equals(this.usesNonExemptEncryption, buildUpdateRequestDataAttributes.usesNonExemptEncryption);
	}

	public BuildUpdateRequestDataAttributes expired(Boolean expired) {

		this.expired = expired;
		return this;
	}

	/**
	 * Get expired
	 *
	 * @return expired
	 **/

	@JsonProperty(JSON_PROPERTY_EXPIRED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getExpired() {
		return this.expired;
	}

	/**
	 * Get usesNonExemptEncryption
	 *
	 * @return usesNonExemptEncryption
	 **/

	@JsonProperty(JSON_PROPERTY_USES_NON_EXEMPT_ENCRYPTION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getUsesNonExemptEncryption() {
		return this.usesNonExemptEncryption;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.expired, this.usesNonExemptEncryption);
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
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
		sb.append("class BuildUpdateRequestDataAttributes {\n");
		sb.append("    expired: ").append(toIndentedString(this.expired)).append("\n");
		sb.append("    usesNonExemptEncryption: ").append(toIndentedString(this.usesNonExemptEncryption)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BuildUpdateRequestDataAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {

		this.usesNonExemptEncryption = usesNonExemptEncryption;
		return this;
	}

}