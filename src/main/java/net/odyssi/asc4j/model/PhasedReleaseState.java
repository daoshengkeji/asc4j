
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PhasedReleaseState {

	ACTIVE("ACTIVE"), COMPLETE("COMPLETE"), INACTIVE("INACTIVE"), PAUSED("PAUSED");

	private final static Map<String, PhasedReleaseState> CONSTANTS = new HashMap<String, PhasedReleaseState>();
	static {
		for (PhasedReleaseState c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static PhasedReleaseState fromValue(String value) {
		PhasedReleaseState constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private PhasedReleaseState(String value) {
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
