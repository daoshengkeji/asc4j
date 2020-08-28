
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum KidsAgeBand {

	FIVE_AND_UNDER("FIVE_AND_UNDER"), NINE_TO_ELEVEN("NINE_TO_ELEVEN"), SIX_TO_EIGHT("SIX_TO_EIGHT");

	private final static Map<String, KidsAgeBand> CONSTANTS = new HashMap<String, KidsAgeBand>();
	static {
		for (KidsAgeBand c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static KidsAgeBand fromValue(String value) {
		KidsAgeBand constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private KidsAgeBand(String value) {
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
