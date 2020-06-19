
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
		CertificateCreateRequestDataAttributes other = (CertificateCreateRequestDataAttributes) obj;
		if (this.certificateType != other.certificateType) {
			return false;
		}
		if (this.csrContent == null) {
			if (other.csrContent != null) {
				return false;
			}
		} else if (!this.csrContent.equals(other.csrContent)) {
			return false;
		}
		return true;
	}

	public CertificateType getCertificateType() {
		return this.certificateType;
	}

	public String getCsrContent() {
		return this.csrContent;
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
		result = prime * result + (this.certificateType == null ? 0 : this.certificateType.hashCode());
		result = prime * result + (this.csrContent == null ? 0 : this.csrContent.hashCode());
		return result;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CertificateCreateRequestDataAttributes [certificateType=" + this.certificateType + ", csrContent="
				+ this.csrContent + "]";
	}

}
