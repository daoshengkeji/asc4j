
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DiagnosticLog
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "links" })
public class DiagnosticLog {

	public enum Type {

		diagnosticLogs("diagnosticLogs");

		private final static Map<String, DiagnosticLog.Type> CONSTANTS = new HashMap<String, DiagnosticLog.Type>();
		static {
			for (DiagnosticLog.Type c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static DiagnosticLog.Type fromValue(String value) {
			DiagnosticLog.Type constant = CONSTANTS.get(value);
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

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	private DiagnosticLog.Type type;

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
	public DiagnosticLog.Type getType() {
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

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("type")
	public void setType(DiagnosticLog.Type type) {
		this.type = type;
	}

}
