
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BuildIcon
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "attributes", "links" })
public class BuildIcon {

	public enum Type {

		buildIcons("buildIcons");

		private final static Map<String, BuildIcon.Type> CONSTANTS = new HashMap<String, BuildIcon.Type>();
		static {
			for (BuildIcon.Type c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static BuildIcon.Type fromValue(String value) {
			BuildIcon.Type constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private Type(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		@JsonValue
		public String value() {
			return this.value;
		}

	}

	@JsonProperty("attributes")
	private Attributes attributes;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("id")
	private String id;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	private ResourceLinks links;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	private BuildIcon.Type type;

	@JsonProperty("attributes")
	public Attributes getAttributes() {
		return this.attributes;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public ResourceLinks getLinks() {
		return this.links;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	public BuildIcon.Type getType() {
		return this.type;
	}

	@JsonProperty("attributes")
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("links")
	public void setLinks(ResourceLinks links) {
		this.links = links;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	public void setType(BuildIcon.Type type) {
		this.type = type;
	}

}
