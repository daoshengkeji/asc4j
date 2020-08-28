
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AppEncryptionDeclarationState {

	APPROVED("APPROVED"), EXPIRED("EXPIRED"), IN_REVIEW("IN_REVIEW"), INVALID("INVALID"), REJECTED("REJECTED");

	private final static Map<String, AppEncryptionDeclarationState> CONSTANTS = new HashMap<String, AppEncryptionDeclarationState>();
	static {
		for (AppEncryptionDeclarationState c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static AppEncryptionDeclarationState fromValue(String value) {
		AppEncryptionDeclarationState constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private AppEncryptionDeclarationState(String value) {
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
