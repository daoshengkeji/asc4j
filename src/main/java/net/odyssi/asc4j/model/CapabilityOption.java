
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
@JsonPropertyOrder({ "description", "enabled", "enabledByDefault", "key", "name", "supportsWildcard" })
public class CapabilityOption {

	public enum Key {

		COMPLETE_PROTECTION("COMPLETE_PROTECTION"), PROTECTED_UNLESS_OPEN("PROTECTED_UNLESS_OPEN"),
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
	@JsonPropertyDescription("")
	private String description;

	@JsonProperty("enabled")
	@JsonPropertyDescription("")
	private Boolean enabled;

	@JsonProperty("enabledByDefault")
	@JsonPropertyDescription("")
	private Boolean enabledByDefault;

	@JsonProperty("key")
	@JsonPropertyDescription("")
	private CapabilityOption.Key key;

	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	@JsonProperty("supportsWildcard")
	@JsonPropertyDescription("")
	private Boolean supportsWildcard;

	public String getDescription() {
		return this.description;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public Boolean getEnabledByDefault() {
		return this.enabledByDefault;
	}

	public CapabilityOption.Key getKey() {
		return this.key;
	}

	public String getName() {
		return this.name;
	}

	public Boolean getSupportsWildcard() {
		return this.supportsWildcard;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	public void setKey(CapabilityOption.Key key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSupportsWildcard(Boolean supportsWildcard) {
		this.supportsWildcard = supportsWildcard;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
		result = prime * result + ((enabledByDefault == null) ? 0 : enabledByDefault.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((supportsWildcard == null) ? 0 : supportsWildcard.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapabilityOption other = (CapabilityOption) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (enabled == null) {
			if (other.enabled != null)
				return false;
		} else if (!enabled.equals(other.enabled))
			return false;
		if (enabledByDefault == null) {
			if (other.enabledByDefault != null)
				return false;
		} else if (!enabledByDefault.equals(other.enabledByDefault))
			return false;
		if (key != other.key)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (supportsWildcard == null) {
			if (other.supportsWildcard != null)
				return false;
		} else if (!supportsWildcard.equals(other.supportsWildcard))
			return false;
		return true;
	}

}
