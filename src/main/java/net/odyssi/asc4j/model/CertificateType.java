
package net.odyssi.asc4j.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CertificateType {

	DEVELOPER_ID_APPLICATION("DEVELOPER_ID_APPLICATION"), DEVELOPER_ID_KEXT("DEVELOPER_ID_KEXT"),
	IOS_DEVELOPMENT("IOS_DEVELOPMENT"), IOS_DISTRIBUTION("IOS_DISTRIBUTION"),
	MAC_APP_DEVELOPMENT("MAC_APP_DEVELOPMENT"), MAC_APP_DISTRIBUTION("MAC_APP_DISTRIBUTION"),
	MAC_INSTALLER_DISTRIBUTION("MAC_INSTALLER_DISTRIBUTION");

	private final static Map<String, CertificateType> CONSTANTS = new HashMap<String, CertificateType>();
	static {
		for (CertificateType c : values()) {
			CONSTANTS.put(c.value, c);
		}
	}

	@JsonCreator
	public static CertificateType fromValue(String value) {
		CertificateType constant = CONSTANTS.get(value);
		if (constant == null) {
			throw new IllegalArgumentException(value);
		} else {
			return constant;
		}
	}

	private final String value;

	private CertificateType(String value) {
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
