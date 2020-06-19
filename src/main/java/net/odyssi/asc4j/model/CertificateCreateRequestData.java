
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "attributes" })
public class CertificateCreateRequestData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private CertificateCreateRequestDataAttributes attributes;

	@JsonProperty("type")
	@JsonPropertyDescription("Value: certificates")
	private String type;

	public CertificateCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	public String getType() {
		return this.type;
	}

	public void setAttributes(CertificateCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setType(String type) {
		this.type = type;
	}

}
