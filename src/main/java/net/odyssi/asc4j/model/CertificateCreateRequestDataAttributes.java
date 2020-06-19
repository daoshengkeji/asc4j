
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "certificateType", "csrContent" })
public class CertificateCreateRequestDataAttributes {

	@JsonProperty("certificateType")
	@JsonPropertyDescription("Literal values representing types of signing certificates.")
	private CertificateType certificateType;

	@JsonProperty("csrContent")
	@JsonPropertyDescription("")
	private String csrContent;

	public CertificateType getCertificateType() {
		return this.certificateType;
	}

	public String getCsrContent() {
		return this.csrContent;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
	}

}
