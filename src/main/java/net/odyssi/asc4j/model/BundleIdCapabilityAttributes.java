
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
@JsonPropertyOrder({ "capabilityType", "settings" })
public class BundleIdCapabilityAttributes {

	public enum CapabilityType {

		ACCESS_WIFI_INFORMATION("ACCESS_WIFI_INFORMATION"), APP_GROUPS("APP_GROUPS"), APPLE_PAY("APPLE_PAY"),
		ASSOCIATED_DOMAINS("ASSOCIATED_DOMAINS"), AUTOFILL_CREDENTIAL_PROVIDER("AUTOFILL_CREDENTIAL_PROVIDER"),
		CLASSKIT("CLASSKIT"), DATA_PROTECTION("DATA_PROTECTION"), GAME_CENTER("GAME_CENTER"), HEALTHKIT("HEALTHKIT"),
		HOMEKIT("HOMEKIT"), HOT_SPOT("HOT_SPOT"), ICLOUD("ICLOUD"), IN_APP_PURCHASE("IN_APP_PURCHASE"),
		INTER_APP_AUDIO("INTER_APP_AUDIO"), MAPS("MAPS"), MULTIPATH("MULTIPATH"),
		NETWORK_EXTENSIONS("NETWORK_EXTENSIONS"), NFC_TAG_READING("NFC_TAG_READING"), PERSONAL_VPN("PERSONAL_VPN"),
		PUSH_NOTIFICATIONS("PUSH_NOTIFICATIONS"), SIRIKIT("SIRIKIT"), WALLET("WALLET"),
		WIRELESS_ACCESSORY_CONFIGURATION("WIRELESS_ACCESSORY_CONFIGURATION");

		private final static Map<String, BundleIdCapabilityAttributes.CapabilityType> CONSTANTS = new HashMap<String, BundleIdCapabilityAttributes.CapabilityType>();
		static {
			for (BundleIdCapabilityAttributes.CapabilityType c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static BundleIdCapabilityAttributes.CapabilityType fromValue(String value) {
			BundleIdCapabilityAttributes.CapabilityType constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private CapabilityType(String value) {
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

	@JsonProperty("capabilityType")
	@JsonPropertyDescription("")
	private BundleIdCapabilityAttributes.CapabilityType capabilityType;

	@JsonProperty("settings")
	@JsonPropertyDescription("")
	private List<CapabilitySetting> settings = new ArrayList<CapabilitySetting>();

	public BundleIdCapabilityAttributes.CapabilityType getCapabilityType() {
		return this.capabilityType;
	}

	public List<CapabilitySetting> getSettings() {
		return this.settings;
	}

	public void setCapabilityType(BundleIdCapabilityAttributes.CapabilityType capabilityType) {
		this.capabilityType = capabilityType;
	}

	public void setSettings(List<CapabilitySetting> settings) {
		this.settings = settings;
	}

}
