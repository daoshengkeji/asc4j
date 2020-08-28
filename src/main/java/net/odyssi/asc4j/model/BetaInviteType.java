
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BetaInviteType {

	EMAIL("EMAIL"), PUBLIC_LINK("PUBLIC_LINK");

	private final static Map<String, BetaInviteType> CONSTANTS = new HashMap<String, BetaInviteType>();
	static {
		for (BetaInviteType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static BetaInviteType fromValue(String value) {
		BetaInviteType constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private BetaInviteType(String value) {
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
