
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Platform {

	IOS("IOS"), MAC_OS("MAC_OS"), TV_OS("TV_OS");

	private final static Map<String, Platform> CONSTANTS = new HashMap<String, Platform>();
	static {
		for (Platform c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static Platform fromValue(String value) {
		Platform constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private Platform(String value) {
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
