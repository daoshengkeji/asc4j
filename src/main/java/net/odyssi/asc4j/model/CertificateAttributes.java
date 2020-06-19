
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CertificateAttributes other = (CertificateAttributes) obj;
		if (this.certificateContent == null) {
			if (other.certificateContent != null) {
				return false;
			}
		} else if (!this.certificateContent.equals(other.certificateContent)) {
			return false;
		}
		if (this.certificateType != other.certificateType) {
			return false;
		}
		if (this.displayName == null) {
			if (other.displayName != null) {
				return false;
			}
		} else if (!this.displayName.equals(other.displayName)) {
			return false;
		}
		if (this.expirationDate == null) {
			if (other.expirationDate != null) {
				return false;
			}
		} else if (!this.expirationDate.equals(other.expirationDate)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.platform != other.platform) {
			return false;
		}
		if (this.serialNumber == null) {
			if (other.serialNumber != null) {
				return false;
			}
		} else if (!this.serialNumber.equals(other.serialNumber)) {
			return false;
		}
		return true;
	}

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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.certificateContent == null ? 0 : this.certificateContent.hashCode());
		result = prime * result + (this.certificateType == null ? 0 : this.certificateType.hashCode());
		result = prime * result + (this.displayName == null ? 0 : this.displayName.hashCode());
		result = prime * result + (this.expirationDate == null ? 0 : this.expirationDate.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.platform == null ? 0 : this.platform.hashCode());
		result = prime * result + (this.serialNumber == null ? 0 : this.serialNumber.hashCode());
		return result;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CertificateAttributes [certificateContent=" + this.certificateContent + ", certificateType="
				+ this.certificateType + ", displayName=" + this.displayName + ", expirationDate=" + this.expirationDate
				+ ", name=" + this.name + ", platform=" + this.platform + ", serialNumber=" + this.serialNumber + "]";
	}

}
