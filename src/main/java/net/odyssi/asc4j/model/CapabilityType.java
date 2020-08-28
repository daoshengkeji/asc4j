
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CapabilityType {

	ACCESS_WIFI_INFORMATION("ACCESS_WIFI_INFORMATION"), APP_GROUPS("APP_GROUPS"), APPLE_ID_AUTH("APPLE_ID_AUTH"),
	APPLE_PAY("APPLE_PAY"), ASSOCIATED_DOMAINS("ASSOCIATED_DOMAINS"),
	AUTOFILL_CREDENTIAL_PROVIDER("AUTOFILL_CREDENTIAL_PROVIDER"), CLASSKIT("CLASSKIT"),
	COREMEDIA_HLS_LOW_LATENCY("COREMEDIA_HLS_LOW_LATENCY"), DATA_PROTECTION("DATA_PROTECTION"),
	GAME_CENTER("GAME_CENTER"), HEALTHKIT("HEALTHKIT"), HOMEKIT("HOMEKIT"), HOT_SPOT("HOT_SPOT"), ICLOUD("ICLOUD"),
	IN_APP_PURCHASE("IN_APP_PURCHASE"), INTER_APP_AUDIO("INTER_APP_AUDIO"), MAPS("MAPS"), MULTIPATH("MULTIPATH"),
	NETWORK_CUSTOM_PROTOCOL("NETWORK_CUSTOM_PROTOCOL"), NETWORK_EXTENSIONS("NETWORK_EXTENSIONS"),
	NFC_TAG_READING("NFC_TAG_READING"), PERSONAL_VPN("PERSONAL_VPN"), PUSH_NOTIFICATIONS("PUSH_NOTIFICATIONS"),
	SIRIKIT("SIRIKIT"), SYSTEM_EXTENSION_INSTALL("SYSTEM_EXTENSION_INSTALL"), USER_MANAGEMENT("USER_MANAGEMENT"),
	WALLET("WALLET"), WIRELESS_ACCESSORY_CONFIGURATION("WIRELESS_ACCESSORY_CONFIGURATION");

	private final static Map<String, CapabilityType> CONSTANTS = new HashMap<String, CapabilityType>();
	static {
		for (CapabilityType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static CapabilityType fromValue(String value) {
		CapabilityType constant = CONSTANTS.get(value);
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
