
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "key", "name", "description", "enabledByDefault", "visible", "allowedInstances", "minInstances",
		"options" })
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

		APPLE_ID_AUTH_APP_CONSENT("APPLE_ID_AUTH_APP_CONSENT"),
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
	private CapabilitySetting.AllowedInstances allowedInstances;
	@JsonProperty("description")
	private String description;
	@JsonProperty("enabledByDefault")
	private Boolean enabledByDefault;
	@JsonProperty("key")
	private CapabilitySetting.Key key;
	@JsonProperty("minInstances")
	private Integer minInstances;
	@JsonProperty("name")
	private String name;

	@JsonProperty("options")
	private List<CapabilityOption> options = new ArrayList<CapabilityOption>();

	@JsonProperty("visible")
	private Boolean visible;

	@JsonProperty("allowedInstances")
	public CapabilitySetting.AllowedInstances getAllowedInstances() {
		return this.allowedInstances;
	}

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	@JsonProperty("enabledByDefault")
	public Boolean getEnabledByDefault() {
		return this.enabledByDefault;
	}

	@JsonProperty("key")
	public CapabilitySetting.Key getKey() {
		return this.key;
	}

	@JsonProperty("minInstances")
	public Integer getMinInstances() {
		return this.minInstances;
	}

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	@JsonProperty("options")
	public List<CapabilityOption> getOptions() {
		return this.options;
	}

	@JsonProperty("visible")
	public Boolean getVisible() {
		return this.visible;
	}

	@JsonProperty("allowedInstances")
	public void setAllowedInstances(CapabilitySetting.AllowedInstances allowedInstances) {
		this.allowedInstances = allowedInstances;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("enabledByDefault")
	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	@JsonProperty("key")
	public void setKey(CapabilitySetting.Key key) {
		this.key = key;
	}

	@JsonProperty("minInstances")
	public void setMinInstances(Integer minInstances) {
		this.minInstances = minInstances;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("options")
	public void setOptions(List<CapabilityOption> options) {
		this.options = options;
	}

	@JsonProperty("visible")
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

}
