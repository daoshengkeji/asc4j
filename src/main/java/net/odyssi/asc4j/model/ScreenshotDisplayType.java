
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ScreenshotDisplayType {

	APP_APPLE_TV("APP_APPLE_TV"), APP_DESKTOP("APP_DESKTOP"), APP_IPAD_105("APP_IPAD_105"), APP_IPAD_97("APP_IPAD_97"),
	APP_IPAD_PRO_129("APP_IPAD_PRO_129"), APP_IPAD_PRO_3GEN_11("APP_IPAD_PRO_3GEN_11"),
	APP_IPAD_PRO_3GEN_129("APP_IPAD_PRO_3GEN_129"), APP_IPHONE_35("APP_IPHONE_35"), APP_IPHONE_40("APP_IPHONE_40"),
	APP_IPHONE_47("APP_IPHONE_47"), APP_IPHONE_55("APP_IPHONE_55"), APP_IPHONE_58("APP_IPHONE_58"),
	APP_IPHONE_65("APP_IPHONE_65"), APP_WATCH_SERIES_3("APP_WATCH_SERIES_3"), APP_WATCH_SERIES_4("APP_WATCH_SERIES_4"),
	IMESSAGE_APP_IPAD_105("IMESSAGE_APP_IPAD_105"), IMESSAGE_APP_IPAD_97("IMESSAGE_APP_IPAD_97"),
	IMESSAGE_APP_IPAD_PRO_129("IMESSAGE_APP_IPAD_PRO_129"),
	IMESSAGE_APP_IPAD_PRO_3GEN_11("IMESSAGE_APP_IPAD_PRO_3GEN_11"),
	IMESSAGE_APP_IPAD_PRO_3GEN_129("IMESSAGE_APP_IPAD_PRO_3GEN_129"), IMESSAGE_APP_IPHONE_40("IMESSAGE_APP_IPHONE_40"),
	IMESSAGE_APP_IPHONE_47("IMESSAGE_APP_IPHONE_47"), IMESSAGE_APP_IPHONE_55("IMESSAGE_APP_IPHONE_55"),
	IMESSAGE_APP_IPHONE_58("IMESSAGE_APP_IPHONE_58"), IMESSAGE_APP_IPHONE_65("IMESSAGE_APP_IPHONE_65");

	private final static Map<String, ScreenshotDisplayType> CONSTANTS = new HashMap<String, ScreenshotDisplayType>();
	static {
		for (ScreenshotDisplayType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static ScreenshotDisplayType fromValue(String value) {
		ScreenshotDisplayType constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private ScreenshotDisplayType(String value) {
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
