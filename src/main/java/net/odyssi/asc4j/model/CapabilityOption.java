
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "key", "name", "description", "enabledByDefault", "enabled", "supportsWildcard" })
public class CapabilityOption {

	public enum Key {

		COMPLETE_PROTECTION("COMPLETE_PROTECTION"), PRIMARY_APP_CONSENT("PRIMARY_APP_CONSENT"),
		PROTECTED_UNLESS_OPEN("PROTECTED_UNLESS_OPEN"),
		PROTECTED_UNTIL_FIRST_USER_AUTH("PROTECTED_UNTIL_FIRST_USER_AUTH"), XCODE_5("XCODE_5"), XCODE_6("XCODE_6");

		private final static Map<String, CapabilityOption.Key> CONSTANTS = new HashMap<String, CapabilityOption.Key>();
		static {
			for (CapabilityOption.Key c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static CapabilityOption.Key fromValue(String value) {
			CapabilityOption.Key constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private Key(String value) {
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

	@JsonProperty("description")
	private String description;
	@JsonProperty("enabled")
	private Boolean enabled;
	@JsonProperty("enabledByDefault")
	private Boolean enabledByDefault;
	@JsonProperty("key")
	private CapabilityOption.Key key;
	@JsonProperty("name")
	private String name;

	@JsonProperty("supportsWildcard")
	private Boolean supportsWildcard;

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	@JsonProperty("enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	@JsonProperty("enabledByDefault")
	public Boolean getEnabledByDefault() {
		return this.enabledByDefault;
	}

	@JsonProperty("key")
	public CapabilityOption.Key getKey() {
		return this.key;
	}

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	@JsonProperty("supportsWildcard")
	public Boolean getSupportsWildcard() {
		return this.supportsWildcard;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("enabled")
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@JsonProperty("enabledByDefault")
	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	@JsonProperty("key")
	public void setKey(CapabilityOption.Key key) {
		this.key = key;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("supportsWildcard")
	public void setSupportsWildcard(Boolean supportsWildcard) {
		this.supportsWildcard = supportsWildcard;
	}

}
