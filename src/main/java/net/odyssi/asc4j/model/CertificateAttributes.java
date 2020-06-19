
package net.odyssi.asc4j.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "certificateContent", "displayName", "expirationDate", "name", "platform", "serialNumber",
		"certificateType" })
public class CertificateAttributes {

	@JsonProperty("certificateContent")
	@JsonPropertyDescription("")
	private String certificateContent;

	@JsonProperty("certificateType")
	@JsonPropertyDescription("Literal values representing types of signing certificates.")
	private CertificateType certificateType;

	@JsonProperty("displayName")
	@JsonPropertyDescription("")
	private String displayName;

	@JsonProperty("expirationDate")
	@JsonPropertyDescription("")
	private Date expirationDate;

	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	@JsonProperty("platform")
	@JsonPropertyDescription("Strings that represent the operating system intended for the bundle.")
	private BundleIdPlatform platform;

	@JsonProperty("serialNumber")
	@JsonPropertyDescription("")
	private String serialNumber;

	public String getCertificateContent() {
		return this.certificateContent;
	}

	public CertificateType getCertificateType() {
		return this.certificateType;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public String getName() {
		return this.name;
	}

	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setCertificateContent(String certificateContent) {
		this.certificateContent = certificateContent;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certificateContent == null) ? 0 : certificateContent.hashCode());
		result = prime * result + ((certificateType == null) ? 0 : certificateType.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CertificateAttributes other = (CertificateAttributes) obj;
		if (certificateContent == null) {
			if (other.certificateContent != null)
				return false;
		} else if (!certificateContent.equals(other.certificateContent))
			return false;
		if (certificateType != other.certificateType)
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (platform != other.platform)
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}

}
