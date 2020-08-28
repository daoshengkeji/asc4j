
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BetaReviewState {

	APPROVED("APPROVED"), IN_REVIEW("IN_REVIEW"), REJECTED("REJECTED"), WAITING_FOR_REVIEW("WAITING_FOR_REVIEW");

	private final static Map<String, BetaReviewState> CONSTANTS = new HashMap<String, BetaReviewState>();
	static {
		for (BetaReviewState c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static BetaReviewState fromValue(String value) {
		BetaReviewState constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private BetaReviewState(String value) {
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
