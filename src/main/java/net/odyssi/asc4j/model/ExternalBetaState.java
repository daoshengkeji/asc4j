
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ExternalBetaState {

	BETA_APPROVED("BETA_APPROVED"), BETA_REJECTED("BETA_REJECTED"), EXPIRED("EXPIRED"),
	IN_BETA_REVIEW("IN_BETA_REVIEW"), IN_BETA_TESTING("IN_BETA_TESTING"),
	IN_EXPORT_COMPLIANCE_REVIEW("IN_EXPORT_COMPLIANCE_REVIEW"), MISSING_EXPORT_COMPLIANCE("MISSING_EXPORT_COMPLIANCE"),
	PROCESSING("PROCESSING"), PROCESSING_EXCEPTION("PROCESSING_EXCEPTION"),
	READY_FOR_BETA_SUBMISSION("READY_FOR_BETA_SUBMISSION"), READY_FOR_BETA_TESTING("READY_FOR_BETA_TESTING"),
	WAITING_FOR_BETA_REVIEW("WAITING_FOR_BETA_REVIEW");

	private final static Map<String, ExternalBetaState> CONSTANTS = new HashMap<String, ExternalBetaState>();
	static {
		for (ExternalBetaState c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static ExternalBetaState fromValue(String value) {
		ExternalBetaState constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private ExternalBetaState(String value) {
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
