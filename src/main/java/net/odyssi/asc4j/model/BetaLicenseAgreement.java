
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BetaLicenseAgreement
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "attributes", "relationships", "links" })
public class BetaLicenseAgreement {

	public enum Type {

		betaLicenseAgreements("betaLicenseAgreements");

		private final static Map<String, BetaLicenseAgreement.Type> CONSTANTS = new HashMap<String, BetaLicenseAgreement.Type>();
		static {
			for (BetaLicenseAgreement.Type c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static BetaLicenseAgreement.Type fromValue(String value) {
			BetaLicenseAgreement.Type constant = CONSTANTS.get(value);
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
	@JsonProperty("relationships")
	private Relationships relationships;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	private BetaLicenseAgreement.Type type;

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
	public BetaLicenseAgreement.Type getType() {
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
	public void setType(BetaLicenseAgreement.Type type) {
		this.type = type;
	}

}
