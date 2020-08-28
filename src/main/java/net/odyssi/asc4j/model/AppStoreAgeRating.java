
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AppStoreAgeRating {

	FOUR_PLUS("FOUR_PLUS"), NINE_PLUS("NINE_PLUS"), SEVENTEEN_PLUS("SEVENTEEN_PLUS"), TWELVE_PLUS("TWELVE_PLUS");

	private final static Map<String, AppStoreAgeRating> CONSTANTS = new HashMap<String, AppStoreAgeRating>();
	static {
		for (AppStoreAgeRating c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static AppStoreAgeRating fromValue(String value) {
		AppStoreAgeRating constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private AppStoreAgeRating(String value) {
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
