
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

}
