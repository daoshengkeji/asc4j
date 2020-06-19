
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BundleIdPlatform {

	IOS("IOS"), MAC_OS("MAC_OS");

	private final static Map<String, BundleIdPlatform> CONSTANTS = new HashMap<String, BundleIdPlatform>();
	static {
		for (BundleIdPlatform c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static BundleIdPlatform fromValue(String value) {
		BundleIdPlatform constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private BundleIdPlatform(String value) {
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
