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
 * AppPreviewSet
 */
@JsonPropertyOrder({ AppPreviewSet.JSON_PROPERTY_TYPE, AppPreviewSet.JSON_PROPERTY_ID,
		AppPreviewSet.JSON_PROPERTY_ATTRIBUTES, AppPreviewSet.JSON_PROPERTY_RELATIONSHIPS,
		AppPreviewSet.JSON_PROPERTY_LINKS })
public class AppPreviewSet implements Serializable, AppStoreVersionLocalizationResponseIncludedOneOf,
		AppStoreVersionLocalizationsResponseIncludedOneOf {

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		APPPREVIEWSETS("appPreviewSets");

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

	public static final String JSON_PROPERTY_LINKS = "links";
	public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";

	public static final String JSON_PROPERTY_TYPE = "type";
	private static final long serialVersionUID = 8331473436831343439L;

	private AppPreviewSetAttributes attributes;

	private String id;
	private ResourceLinks links;

	private AppPreviewSetRelationships relationships;
	private TypeEnum type;

	public AppPreviewSet attributes(AppPreviewSetAttributes attributes) {
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
		AppPreviewSet appPreviewSet = (AppPreviewSet) o;
		return Objects.equals(this.type, appPreviewSet.type) && Objects.equals(this.id, appPreviewSet.id)
				&& Objects.equals(this.attributes, appPreviewSet.attributes)
				&& Objects.equals(this.relationships, appPreviewSet.relationships)
				&& Objects.equals(this.links, appPreviewSet.links);
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public AppPreviewSetAttributes getAttributes() {
		return this.attributes;
	}

	@NotNull
	@JsonProperty(JSON_PROPERTY_ID)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public String getId() {
		return this.id;
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public ResourceLinks getLinks() {
		return this.links;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public AppPreviewSetRelationships getRelationships() {
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
		return Objects.hash(this.type, this.id, this.attributes, this.relationships, this.links);
	}

	public AppPreviewSet id(String id) {
		this.id = id;
		return this;
	}

	public AppPreviewSet links(ResourceLinks links) {
		this.links = links;
		return this;
	}

	public AppPreviewSet relationships(AppPreviewSetRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(AppPreviewSetAttributes attributes) {
		this.attributes = attributes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLinks(ResourceLinks links) {
		this.links = links;
	}

	public void setRelationships(AppPreviewSetRelationships relationships) {
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
		sb.append("class AppPreviewSet {\n");
		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreviewSet type(TypeEnum type) {
		this.type = type;
		return this;
	}

}