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
 * TerritoryAttributes
 */
@JsonPropertyOrder({ TerritoryAttributes.JSON_PROPERTY_CURRENCY })

public class TerritoryAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -1957128271924401489L;

	public static final String JSON_PROPERTY_CURRENCY = "currency";

	private String currency;

	public TerritoryAttributes currency(String currency) {

		this.currency = currency;
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
		TerritoryAttributes territoryAttributes = (TerritoryAttributes) o;
		return Objects.equals(this.currency, territoryAttributes.currency);
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/

	@JsonProperty(JSON_PROPERTY_CURRENCY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCurrency() {
		return this.currency;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.currency);
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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
		sb.append("class TerritoryAttributes {\n");
		sb.append("    currency: ").append(toIndentedString(this.currency)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
