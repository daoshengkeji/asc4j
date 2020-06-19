
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRole {

	ACCESS_TO_REPORTS("ACCESS_TO_REPORTS"), ACCOUNT_HOLDER("ACCOUNT_HOLDER"), ADMIN("ADMIN"),
	APP_MANAGER("APP_MANAGER"), CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"), DEVELOPER("DEVELOPER"), FINANCE("FINANCE"),
	MARKETING("MARKETING"), READ_ONLY("READ_ONLY"), SALES("SALES"), TECHNICAL("TECHNICAL");

	private final static Map<String, UserRole> CONSTANTS = new HashMap<String, UserRole>();
	static {
		for (UserRole c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static UserRole fromValue(String value) {
		UserRole constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private UserRole(String value) {
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
