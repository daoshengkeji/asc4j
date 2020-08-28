
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AppStoreVersionState {

	DEVELOPER_REJECTED("DEVELOPER_REJECTED"), DEVELOPER_REMOVED_FROM_SALE("DEVELOPER_REMOVED_FROM_SALE"),
	IN_REVIEW("IN_REVIEW"), INVALID_BINARY("INVALID_BINARY"), METADATA_REJECTED("METADATA_REJECTED"),
	PENDING_APPLE_RELEASE("PENDING_APPLE_RELEASE"), PENDING_CONTRACT("PENDING_CONTRACT"),
	PENDING_DEVELOPER_RELEASE("PENDING_DEVELOPER_RELEASE"), PREORDER_READY_FOR_SALE("PREORDER_READY_FOR_SALE"),
	PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"), PROCESSING_FOR_APP_STORE("PROCESSING_FOR_APP_STORE"),
	READY_FOR_SALE("READY_FOR_SALE"), REJECTED("REJECTED"), REMOVED_FROM_SALE("REMOVED_FROM_SALE"),
	REPLACED_WITH_NEW_VERSION("REPLACED_WITH_NEW_VERSION"),
	WAITING_FOR_EXPORT_COMPLIANCE("WAITING_FOR_EXPORT_COMPLIANCE"), WAITING_FOR_REVIEW("WAITING_FOR_REVIEW");

	private final static Map<String, AppStoreVersionState> CONSTANTS = new HashMap<String, AppStoreVersionState>();
	static {
		for (AppStoreVersionState c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static AppStoreVersionState fromValue(String value) {
		AppStoreVersionState constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private AppStoreVersionState(String value) {
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
