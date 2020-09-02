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
 * AppPreOrderCreateRequestData
 */
@JsonPropertyOrder({ AppPreOrderCreateRequestData.JSON_PROPERTY_TYPE,
		AppPreOrderCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
		AppPreOrderCreateRequestData.JSON_PROPERTY_RELATIONSHIPS })
public class AppPreOrderCreateRequestData implements Serializable {

	private static final long serialVersionUID = 6107588016075547470L;

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		APPPREORDERS("appPreOrders");

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

	public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
	public static final String JSON_PROPERTY_TYPE = "type";

	private AppPreOrderCreateRequestDataAttributes attributes;

	private AppPreOrderCreateRequestDataRelationships relationships;
	private TypeEnum type;

	public AppPreOrderCreateRequestData attributes(AppPreOrderCreateRequestDataAttributes attributes) {
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
		AppPreOrderCreateRequestData appPreOrderCreateRequestData = (AppPreOrderCreateRequestData) o;
		return Objects.equals(this.type, appPreOrderCreateRequestData.type)
				&& Objects.equals(this.attributes, appPreOrderCreateRequestData.attributes)
				&& Objects.equals(this.relationships, appPreOrderCreateRequestData.relationships);
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public AppPreOrderCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public AppPreOrderCreateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	@NotNull
	@JsonProperty(JSON_PROPERTY_TYPE)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public TypeEnum getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.type, this.attributes, this.relationships);
	}

	public AppPreOrderCreateRequestData relationships(AppPreOrderCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(AppPreOrderCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(AppPreOrderCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
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
		sb.append("class AppPreOrderCreateRequestData {\n");
		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreOrderCreateRequestData type(TypeEnum type) {
		this.type = type;
		return this;
	}

}
