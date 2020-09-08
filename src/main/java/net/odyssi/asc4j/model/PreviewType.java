/*
 * App Store Connect API
 * Automate the tasks you perform on the Apple Developer website and in App Store Connect.  The App Store Connect API is a REST API that enables the automation of actions you take in App Store Connect.  Calls to the API require JSON Web Tokens (JWT) for authorization; you obtain keys to create the tokens from your organization’s App Store Connect account.
 *
 * The version of the OpenAPI document: 1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PreviewType
 */
public enum PreviewType {

	APPLE_TV("APPLE_TV"),

	DESKTOP("DESKTOP"),

	IPAD_105("IPAD_105"),

	IPAD_97("IPAD_97"),

	IPAD_PRO_129("IPAD_PRO_129"),

	IPAD_PRO_3GEN_11("IPAD_PRO_3GEN_11"),

	IPAD_PRO_3GEN_129("IPAD_PRO_3GEN_129"),

	IPHONE_35("IPHONE_35"),

	IPHONE_40("IPHONE_40"),

	IPHONE_47("IPHONE_47"),

	IPHONE_55("IPHONE_55"),

	IPHONE_58("IPHONE_58"),

	IPHONE_65("IPHONE_65"),

	WATCH_SERIES_3("WATCH_SERIES_3"),

	WATCH_SERIES_4("WATCH_SERIES_4");

	@JsonCreator
	public static PreviewType fromValue(String value) {
		for (PreviewType b : PreviewType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	PreviewType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
}