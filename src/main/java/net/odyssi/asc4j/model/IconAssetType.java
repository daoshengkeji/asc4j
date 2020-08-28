
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IconAssetType {

	APP_STORE("APP_STORE"), MESSAGES_APP_STORE("MESSAGES_APP_STORE"), TV_OS_HOME_SCREEN("TV_OS_HOME_SCREEN"),
	TV_OS_TOP_SHELF("TV_OS_TOP_SHELF"), WATCH_APP_STORE("WATCH_APP_STORE");

	private final static Map<String, IconAssetType> CONSTANTS = new HashMap<String, IconAssetType>();
	static {
		for (IconAssetType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static IconAssetType fromValue(String value) {
		IconAssetType constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private IconAssetType(String value) {
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
