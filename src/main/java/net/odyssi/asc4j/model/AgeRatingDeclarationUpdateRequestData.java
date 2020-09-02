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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AgeRatingDeclarationUpdateRequestData
 */
@JsonPropertyOrder({ AgeRatingDeclarationUpdateRequestData.JSON_PROPERTY_TYPE,
		AgeRatingDeclarationUpdateRequestData.JSON_PROPERTY_ID,
		AgeRatingDeclarationUpdateRequestData.JSON_PROPERTY_ATTRIBUTES })
public class AgeRatingDeclarationUpdateRequestData implements Serializable {

	private static final long serialVersionUID = 6533934864206041533L;

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		AGERATINGDECLARATIONS("ageRatingDeclarations");

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		TypeEnum(String value) {
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

	public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";

	private AgeRatingDeclarationAttributes attributes;

	private String id;
	private TypeEnum type;

	public AgeRatingDeclarationUpdateRequestData attributes(AgeRatingDeclarationAttributes attributes) {
		this.attributes = attributes;
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
		AgeRatingDeclarationUpdateRequestData ageRatingDeclarationUpdateRequestData = (AgeRatingDeclarationUpdateRequestData) o;
		return Objects.equals(this.type, ageRatingDeclarationUpdateRequestData.type)
				&& Objects.equals(this.id, ageRatingDeclarationUpdateRequestData.id)
				&& Objects.equals(this.attributes, ageRatingDeclarationUpdateRequestData.attributes);
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public AgeRatingDeclarationAttributes getAttributes() {
		return this.attributes;
	}

	@NotNull
	@JsonProperty(JSON_PROPERTY_ID)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public String getId() {
		return this.id;
	}

	@NotNull
	@JsonProperty(JSON_PROPERTY_TYPE)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public TypeEnum getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.type, this.id, this.attributes);
	}

	public AgeRatingDeclarationUpdateRequestData id(String id) {

		this.id = id;
		return this;
	}

	public void setAttributes(AgeRatingDeclarationAttributes attributes) {
		this.attributes = attributes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(TypeEnum type) {
		this.type = type;
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
		sb.append("class AgeRatingDeclarationUpdateRequestData {\n");
		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AgeRatingDeclarationUpdateRequestData type(TypeEnum type) {
		this.type = type;
		return this;
	}

}
