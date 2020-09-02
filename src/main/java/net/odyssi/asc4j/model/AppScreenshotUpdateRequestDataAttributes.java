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
 * AppScreenshotUpdateRequestDataAttributes
 */
@JsonPropertyOrder({ AppScreenshotUpdateRequestDataAttributes.JSON_PROPERTY_SOURCE_FILE_CHECKSUM,
		AppScreenshotUpdateRequestDataAttributes.JSON_PROPERTY_UPLOADED })

public class AppScreenshotUpdateRequestDataAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3572073330529904278L;

	public static final String JSON_PROPERTY_SOURCE_FILE_CHECKSUM = "sourceFileChecksum";

	public static final String JSON_PROPERTY_UPLOADED = "uploaded";

	private String sourceFileChecksum;
	private Boolean uploaded;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppScreenshotUpdateRequestDataAttributes appScreenshotUpdateRequestDataAttributes = (AppScreenshotUpdateRequestDataAttributes) o;
		return Objects.equals(this.sourceFileChecksum, appScreenshotUpdateRequestDataAttributes.sourceFileChecksum)
				&& Objects.equals(this.uploaded, appScreenshotUpdateRequestDataAttributes.uploaded);
	}

	/**
	 * Get sourceFileChecksum
	 *
	 * @return sourceFileChecksum
	 **/

	@JsonProperty(JSON_PROPERTY_SOURCE_FILE_CHECKSUM)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getSourceFileChecksum() {
		return this.sourceFileChecksum;
	}

	/**
	 * Get uploaded
	 *
	 * @return uploaded
	 **/

	@JsonProperty(JSON_PROPERTY_UPLOADED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getUploaded() {
		return this.uploaded;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.sourceFileChecksum, this.uploaded);
	}

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	public AppScreenshotUpdateRequestDataAttributes sourceFileChecksum(String sourceFileChecksum) {

		this.sourceFileChecksum = sourceFileChecksum;
		return this;
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
		sb.append("class AppScreenshotUpdateRequestDataAttributes {\n");
		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    uploaded: ").append(toIndentedString(this.uploaded)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppScreenshotUpdateRequestDataAttributes uploaded(Boolean uploaded) {

		this.uploaded = uploaded;
		return this;
	}

}
