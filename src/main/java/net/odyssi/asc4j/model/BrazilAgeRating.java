
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrazilAgeRating {

	EIGHTEEN("EIGHTEEN"), FOURTEEN("FOURTEEN"), L("L"), SIXTEEN("SIXTEEN"), TEN("TEN"), TWELVE("TWELVE");

	private final static Map<String, BrazilAgeRating> CONSTANTS = new HashMap<String, BrazilAgeRating>();
	static {
		for (BrazilAgeRating c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static BrazilAgeRating fromValue(String value) {
		BrazilAgeRating constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private BrazilAgeRating(String value) {
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
