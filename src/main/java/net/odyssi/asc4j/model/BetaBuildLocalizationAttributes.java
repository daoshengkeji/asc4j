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
 * BetaBuildLocalizationAttributes
 */
@JsonPropertyOrder({ BetaBuildLocalizationAttributes.JSON_PROPERTY_WHATS_NEW,
		BetaBuildLocalizationAttributes.JSON_PROPERTY_LOCALE })

public class BetaBuildLocalizationAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -6477401735267798615L;

	public static final String JSON_PROPERTY_LOCALE = "locale";

	public static final String JSON_PROPERTY_WHATS_NEW = "whatsNew";

	private String locale;
	private String whatsNew;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BetaBuildLocalizationAttributes betaBuildLocalizationAttributes = (BetaBuildLocalizationAttributes) o;
		return Objects.equals(this.whatsNew, betaBuildLocalizationAttributes.whatsNew)
				&& Objects.equals(this.locale, betaBuildLocalizationAttributes.locale);
	}

	/**
	 * Get locale
	 *
	 * @return locale
	 **/

	@JsonProperty(JSON_PROPERTY_LOCALE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getLocale() {
		return this.locale;
	}

	/**
	 * Get whatsNew
	 *
	 * @return whatsNew
	 **/

	@JsonProperty(JSON_PROPERTY_WHATS_NEW)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getWhatsNew() {
		return this.whatsNew;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.whatsNew, this.locale);
	}

	public BetaBuildLocalizationAttributes locale(String locale) {

		this.locale = locale;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
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
		sb.append("class BetaBuildLocalizationAttributes {\n");
		sb.append("    whatsNew: ").append(toIndentedString(this.whatsNew)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BetaBuildLocalizationAttributes whatsNew(String whatsNew) {

		this.whatsNew = whatsNew;
		return this;
	}

}
