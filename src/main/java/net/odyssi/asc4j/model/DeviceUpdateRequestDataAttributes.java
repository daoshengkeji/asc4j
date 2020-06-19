
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "status" })
public class DeviceUpdateRequestDataAttributes {

	public enum Status {

		DISABLED("DISABLED"), ENABLED("ENABLED");

		private final static Map<String, DeviceUpdateRequestDataAttributes.Status> CONSTANTS = new HashMap<String, DeviceUpdateRequestDataAttributes.Status>();
		static {
			for (DeviceUpdateRequestDataAttributes.Status c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static DeviceUpdateRequestDataAttributes.Status fromValue(String value) {
			DeviceUpdateRequestDataAttributes.Status constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private Status(String value) {
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
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	/**
	 *
	 */
	@JsonProperty("status")
	@JsonPropertyDescription("")
	private DeviceUpdateRequestDataAttributes.Status status;

}
