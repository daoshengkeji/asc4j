
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeviceClass {

	APPLE_TV("APPLE_TV"), APPLE_WATCH("APPLE_WATCH"), IPAD("IPAD"), IPHONE("IPHONE"), IPOD("IPOD"), MAC("MAC");

	private final static Map<String, DeviceClass> CONSTANTS = new HashMap<String, DeviceClass>();
	static {
		for (DeviceClass c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static DeviceClass fromValue(String value) {
		DeviceClass constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private DeviceClass(String value) {
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
