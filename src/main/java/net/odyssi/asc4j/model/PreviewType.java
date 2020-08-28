
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PreviewType {

	APPLE_TV("APPLE_TV"), DESKTOP("DESKTOP"), IPAD_105("IPAD_105"), IPAD_97("IPAD_97"), IPAD_PRO_129("IPAD_PRO_129"),
	IPAD_PRO_3GEN_11("IPAD_PRO_3GEN_11"), IPAD_PRO_3GEN_129("IPAD_PRO_3GEN_129"), IPHONE_35("IPHONE_35"),
	IPHONE_40("IPHONE_40"), IPHONE_47("IPHONE_47"), IPHONE_55("IPHONE_55"), IPHONE_58("IPHONE_58"),
	IPHONE_65("IPHONE_65"), WATCH_SERIES_3("WATCH_SERIES_3"), WATCH_SERIES_4("WATCH_SERIES_4");

	private final static Map<String, PreviewType> CONSTANTS = new HashMap<String, PreviewType>();
	static {
		for (PreviewType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static PreviewType fromValue(String value) {
		PreviewType constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private PreviewType(String value) {
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
