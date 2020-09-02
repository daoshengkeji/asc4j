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
 * BetaGroupUpdateRequestDataAttributes
 */
@JsonPropertyOrder({ BetaGroupUpdateRequestDataAttributes.JSON_PROPERTY_NAME,
		BetaGroupUpdateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_ENABLED,
		BetaGroupUpdateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED,
		BetaGroupUpdateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_LIMIT,
		BetaGroupUpdateRequestDataAttributes.JSON_PROPERTY_FEEDBACK_ENABLED })

public class BetaGroupUpdateRequestDataAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -9062152948593346305L;

	public static final String JSON_PROPERTY_FEEDBACK_ENABLED = "feedbackEnabled";

	public static final String JSON_PROPERTY_NAME = "name";
	public static final String JSON_PROPERTY_PUBLIC_LINK_ENABLED = "publicLinkEnabled";

	public static final String JSON_PROPERTY_PUBLIC_LINK_LIMIT = "publicLinkLimit";
	public static final String JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED = "publicLinkLimitEnabled";

	private Boolean feedbackEnabled;

	private String name;
	private Boolean publicLinkEnabled;

	private Integer publicLinkLimit;
	private Boolean publicLinkLimitEnabled;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BetaGroupUpdateRequestDataAttributes betaGroupUpdateRequestDataAttributes = (BetaGroupUpdateRequestDataAttributes) o;
		return Objects.equals(this.name, betaGroupUpdateRequestDataAttributes.name)
				&& Objects.equals(this.publicLinkEnabled, betaGroupUpdateRequestDataAttributes.publicLinkEnabled)
				&& Objects.equals(this.publicLinkLimitEnabled,
						betaGroupUpdateRequestDataAttributes.publicLinkLimitEnabled)
				&& Objects.equals(this.publicLinkLimit, betaGroupUpdateRequestDataAttributes.publicLinkLimit)
				&& Objects.equals(this.feedbackEnabled, betaGroupUpdateRequestDataAttributes.feedbackEnabled);
	}

	public BetaGroupUpdateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {

		this.feedbackEnabled = feedbackEnabled;
		return this;
	}

	/**
	 * Get feedbackEnabled
	 *
	 * @return feedbackEnabled
	 **/

	@JsonProperty(JSON_PROPERTY_FEEDBACK_ENABLED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getFeedbackEnabled() {
		return this.feedbackEnabled;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/

	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getName() {
		return this.name;
	}

	/**
	 * Get publicLinkEnabled
	 *
	 * @return publicLinkEnabled
	 **/

	@JsonProperty(JSON_PROPERTY_PUBLIC_LINK_ENABLED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getPublicLinkEnabled() {
		return this.publicLinkEnabled;
	}

	/**
	 * Get publicLinkLimit
	 *
	 * @return publicLinkLimit
	 **/

	@JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getPublicLinkLimit() {
		return this.publicLinkLimit;
	}

	/**
	 * Get publicLinkLimitEnabled
	 *
	 * @return publicLinkLimitEnabled
	 **/

	@JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getPublicLinkLimitEnabled() {
		return this.publicLinkLimitEnabled;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.publicLinkEnabled, this.publicLinkLimitEnabled, this.publicLinkLimit,
				this.feedbackEnabled);
	}

	public BetaGroupUpdateRequestDataAttributes name(String name) {

		this.name = name;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {

		this.publicLinkEnabled = publicLinkEnabled;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {

		this.publicLinkLimit = publicLinkLimit;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {

		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
		return this;
	}

	public void setFeedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPublicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
	}

	public void setPublicLinkLimit(Integer publicLinkLimit) {
		this.publicLinkLimit = publicLinkLimit;
	}

	public void setPublicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
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
		sb.append("class BetaGroupUpdateRequestDataAttributes {\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    publicLinkEnabled: ").append(toIndentedString(this.publicLinkEnabled)).append("\n");
		sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(this.publicLinkLimitEnabled)).append("\n");
		sb.append("    publicLinkLimit: ").append(toIndentedString(this.publicLinkLimit)).append("\n");
		sb.append("    feedbackEnabled: ").append(toIndentedString(this.feedbackEnabled)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
