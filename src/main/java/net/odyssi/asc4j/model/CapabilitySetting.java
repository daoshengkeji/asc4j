
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "allowedInstances", "description", "enabledByDefault", "key", "name", "visible", "options" })
public class CapabilitySetting {

	public enum AllowedInstances {

		ENTRY("ENTRY"), MULTIPLE("MULTIPLE"), SINGLE("SINGLE");

		private final static Map<String, CapabilitySetting.AllowedInstances> CONSTANTS = new HashMap<String, CapabilitySetting.AllowedInstances>();
		static {
			for (CapabilitySetting.AllowedInstances c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static CapabilitySetting.AllowedInstances fromValue(String value) {
			CapabilitySetting.AllowedInstances constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private AllowedInstances(String value) {
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

	public enum Key {

		DATA_PROTECTION_PERMISSION_LEVEL("DATA_PROTECTION_PERMISSION_LEVEL"), ICLOUD_VERSION("ICLOUD_VERSION");

		private final static Map<String, CapabilitySetting.Key> CONSTANTS = new HashMap<String, CapabilitySetting.Key>();
		static {
			for (CapabilitySetting.Key c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static CapabilitySetting.Key fromValue(String value) {
			CapabilitySetting.Key constant = CONSTANTS.get(value);
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

	@JsonProperty("allowedInstances")
	@JsonPropertyDescription("")
	private CapabilitySetting.AllowedInstances allowedInstances;

	@JsonProperty("description")
	@JsonPropertyDescription("")
	private String description;

	@JsonProperty("enabledByDefault")
	@JsonPropertyDescription("")
	private Boolean enabledByDefault;

	@JsonProperty("key")
	@JsonPropertyDescription("")
	private CapabilitySetting.Key key;

	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	@JsonProperty("options")
	@JsonPropertyDescription("")
	private List<CapabilityOption> options = new ArrayList<CapabilityOption>();

	@JsonProperty("visible")
	@JsonPropertyDescription("")
	private Boolean visible;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CapabilitySetting other = (CapabilitySetting) obj;
		if (this.allowedInstances != other.allowedInstances) {
			return false;
		}
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}
		if (this.enabledByDefault == null) {
			if (other.enabledByDefault != null) {
				return false;
			}
		} else if (!this.enabledByDefault.equals(other.enabledByDefault)) {
			return false;
		}
		if (this.key != other.key) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.options == null) {
			if (other.options != null) {
				return false;
			}
		} else if (!this.options.equals(other.options)) {
			return false;
		}
		if (this.visible == null) {
			if (other.visible != null) {
				return false;
			}
		} else if (!this.visible.equals(other.visible)) {
			return false;
		}
		return true;
	}

	public CapabilitySetting.AllowedInstances getAllowedInstances() {
		return this.allowedInstances;
	}

	public String getDescription() {
		return this.description;
	}

	public Boolean getEnabledByDefault() {
		return this.enabledByDefault;
	}

	public CapabilitySetting.Key getKey() {
		return this.key;
	}

	public String getName() {
		return this.name;
	}

	public List<CapabilityOption> getOptions() {
		return this.options;
	}

	public Boolean getVisible() {
		return this.visible;
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
		result = prime * result + (this.allowedInstances == null ? 0 : this.allowedInstances.hashCode());
		result = prime * result + (this.description == null ? 0 : this.description.hashCode());
		result = prime * result + (this.enabledByDefault == null ? 0 : this.enabledByDefault.hashCode());
		result = prime * result + (this.key == null ? 0 : this.key.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.options == null ? 0 : this.options.hashCode());
		result = prime * result + (this.visible == null ? 0 : this.visible.hashCode());
		return result;
	}

	public void setAllowedInstances(CapabilitySetting.AllowedInstances allowedInstances) {
		this.allowedInstances = allowedInstances;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	public void setKey(CapabilitySetting.Key key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptions(List<CapabilityOption> options) {
		this.options = options;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CapabilitySetting [allowedInstances=" + this.allowedInstances + ", description=" + this.description
				+ ", enabledByDefault=" + this.enabledByDefault + ", key=" + this.key + ", name=" + this.name
				+ ", options=" + this.options + ", visible=" + this.visible + "]";
	}

}
