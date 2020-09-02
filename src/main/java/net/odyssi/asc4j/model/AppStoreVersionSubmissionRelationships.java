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

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionSubmissionRelationships
 */
@JsonPropertyOrder({ AppStoreVersionSubmissionRelationships.JSON_PROPERTY_APP_STORE_VERSION })

public class AppStoreVersionSubmissionRelationships implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 4203621739595867156L;

	public static final String JSON_PROPERTY_APP_STORE_VERSION = "appStoreVersion";

	private AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion;

	public AppStoreVersionSubmissionRelationships appStoreVersion(
			AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {

		this.appStoreVersion = appStoreVersion;
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
		AppStoreVersionSubmissionRelationships appStoreVersionSubmissionRelationships = (AppStoreVersionSubmissionRelationships) o;
		return Objects.equals(this.appStoreVersion, appStoreVersionSubmissionRelationships.appStoreVersion);
	}

	/**
	 * Get appStoreVersion
	 *
	 * @return appStoreVersion
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_VERSION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreReviewDetailRelationshipsAppStoreVersion getAppStoreVersion() {
		return this.appStoreVersion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.appStoreVersion);
	}

	public void setAppStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
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
		sb.append("class AppStoreVersionSubmissionRelationships {\n");
		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
