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
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BuildAttributes
 */
@JsonPropertyOrder({ BuildAttributes.JSON_PROPERTY_VERSION, BuildAttributes.JSON_PROPERTY_UPLOADED_DATE,
		BuildAttributes.JSON_PROPERTY_EXPIRATION_DATE, BuildAttributes.JSON_PROPERTY_EXPIRED,
		BuildAttributes.JSON_PROPERTY_MIN_OS_VERSION, BuildAttributes.JSON_PROPERTY_ICON_ASSET_TOKEN,
		BuildAttributes.JSON_PROPERTY_PROCESSING_STATE, BuildAttributes.JSON_PROPERTY_USES_NON_EXEMPT_ENCRYPTION })

public class BuildAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 9042953660754044205L;

	/**
	 * Gets or Sets processingState
	 */
	public enum ProcessingStateEnum {
		FAILED("FAILED"),

		INVALID("INVALID"),

		PROCESSING("PROCESSING"),

		VALID("VALID");

		@JsonCreator
		public static ProcessingStateEnum fromValue(String value) {
			for (ProcessingStateEnum b : ProcessingStateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProcessingStateEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return this.value;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}
	}

	public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
	public static final String JSON_PROPERTY_EXPIRED = "expired";

	public static final String JSON_PROPERTY_ICON_ASSET_TOKEN = "iconAssetToken";
	public static final String JSON_PROPERTY_MIN_OS_VERSION = "minOsVersion";

	public static final String JSON_PROPERTY_PROCESSING_STATE = "processingState";
	public static final String JSON_PROPERTY_UPLOADED_DATE = "uploadedDate";

	public static final String JSON_PROPERTY_USES_NON_EXEMPT_ENCRYPTION = "usesNonExemptEncryption";
	public static final String JSON_PROPERTY_VERSION = "version";

	private OffsetDateTime expirationDate;

	private Boolean expired;
	private ImageAsset iconAssetToken;

	private String minOsVersion;

	private ProcessingStateEnum processingState;
	private OffsetDateTime uploadedDate;

	private Boolean usesNonExemptEncryption;
	private String version;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BuildAttributes buildAttributes = (BuildAttributes) o;
		return Objects.equals(this.version, buildAttributes.version)
				&& Objects.equals(this.uploadedDate, buildAttributes.uploadedDate)
				&& Objects.equals(this.expirationDate, buildAttributes.expirationDate)
				&& Objects.equals(this.expired, buildAttributes.expired)
				&& Objects.equals(this.minOsVersion, buildAttributes.minOsVersion)
				&& Objects.equals(this.iconAssetToken, buildAttributes.iconAssetToken)
				&& Objects.equals(this.processingState, buildAttributes.processingState)
				&& Objects.equals(this.usesNonExemptEncryption, buildAttributes.usesNonExemptEncryption);
	}

	public BuildAttributes expirationDate(OffsetDateTime expirationDate) {

		this.expirationDate = expirationDate;
		return this;
	}

	public BuildAttributes expired(Boolean expired) {

		this.expired = expired;
		return this;
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
	 * Get iconAssetToken
	 *
	 * @return iconAssetToken
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_ICON_ASSET_TOKEN)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public ImageAsset getIconAssetToken() {
		return this.iconAssetToken;
	}

	/**
	 * Get minOsVersion
	 *
	 * @return minOsVersion
	 **/

	@JsonProperty(JSON_PROPERTY_MIN_OS_VERSION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getMinOsVersion() {
		return this.minOsVersion;
	}

	/**
	 * Get processingState
	 *
	 * @return processingState
	 **/

	@JsonProperty(JSON_PROPERTY_PROCESSING_STATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public ProcessingStateEnum getProcessingState() {
		return this.processingState;
	}

	/**
	 * Get uploadedDate
	 *
	 * @return uploadedDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_UPLOADED_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getUploadedDate() {
		return this.uploadedDate;
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

	/**
	 * Get version
	 *
	 * @return version
	 **/

	@JsonProperty(JSON_PROPERTY_VERSION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getVersion() {
		return this.version;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.version, this.uploadedDate, this.expirationDate, this.expired, this.minOsVersion,
				this.iconAssetToken, this.processingState, this.usesNonExemptEncryption);
	}

	public BuildAttributes iconAssetToken(ImageAsset iconAssetToken) {

		this.iconAssetToken = iconAssetToken;
		return this;
	}

	public BuildAttributes minOsVersion(String minOsVersion) {

		this.minOsVersion = minOsVersion;
		return this;
	}

	public BuildAttributes processingState(ProcessingStateEnum processingState) {

		this.processingState = processingState;
		return this;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public void setIconAssetToken(ImageAsset iconAssetToken) {
		this.iconAssetToken = iconAssetToken;
	}

	public void setMinOsVersion(String minOsVersion) {
		this.minOsVersion = minOsVersion;
	}

	public void setProcessingState(ProcessingStateEnum processingState) {
		this.processingState = processingState;
	}

	public void setUploadedDate(OffsetDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
	}

	public void setVersion(String version) {
		this.version = version;
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
		sb.append("class BuildAttributes {\n");
		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    uploadedDate: ").append(toIndentedString(this.uploadedDate)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
		sb.append("    expired: ").append(toIndentedString(this.expired)).append("\n");
		sb.append("    minOsVersion: ").append(toIndentedString(this.minOsVersion)).append("\n");
		sb.append("    iconAssetToken: ").append(toIndentedString(this.iconAssetToken)).append("\n");
		sb.append("    processingState: ").append(toIndentedString(this.processingState)).append("\n");
		sb.append("    usesNonExemptEncryption: ").append(toIndentedString(this.usesNonExemptEncryption)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BuildAttributes uploadedDate(OffsetDateTime uploadedDate) {

		this.uploadedDate = uploadedDate;
		return this;
	}

	public BuildAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {

		this.usesNonExemptEncryption = usesNonExemptEncryption;
		return this;
	}

	public BuildAttributes version(String version) {

		this.version = version;
		return this;
	}

}
