
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id" })
public class Datum__9 {

	public enum Type {

		gameCenterEnabledVersions("gameCenterEnabledVersions");

		private final static Map<String, Datum__9.Type> CONSTANTS = new HashMap<String, Datum__9.Type>();
		static {
			for (Datum__9.Type c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static Datum__9.Type fromValue(String value) {
			Datum__9.Type constant = CONSTANTS.get(value);
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
	@JsonProperty("type")
	private Datum__9.Type type;

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
	@JsonProperty("type")
	public Datum__9.Type getType() {
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
	@JsonProperty("type")
	public void setType(Datum__9.Type type) {
		this.type = type;
	}

}
