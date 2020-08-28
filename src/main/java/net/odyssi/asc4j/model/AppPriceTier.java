
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AppPriceTier
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "relationships", "links" })
public class AppPriceTier {

	public enum Type {

		appPriceTiers("appPriceTiers");

		private final static Map<String, AppPriceTier.Type> CONSTANTS = new HashMap<String, AppPriceTier.Type>();
		static {
			for (AppPriceTier.Type c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static AppPriceTier.Type fromValue(String value) {
			AppPriceTier.Type constant = CONSTANTS.get(value);
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
	@JsonProperty("relationships")
	private Relationships relationships;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	private AppPriceTier.Type type;

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

	@JsonProperty("relationships")
	public Relationships getRelationships() {
		return this.relationships;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	public AppPriceTier.Type getType() {
		return this.type;
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

	@JsonProperty("relationships")
	public void setRelationships(Relationships relationships) {
		this.relationships = relationships;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	public void setType(AppPriceTier.Type type) {
		this.type = type;
	}

}
