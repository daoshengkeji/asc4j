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
 * Gets or Sets Platform
 */
public enum Platform {

	IOS("IOS"),

	MAC_OS("MAC_OS"),

	TV_OS("TV_OS");

	@JsonCreator
	public static Platform fromValue(String value) {
		for (Platform b : Platform.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	Platform(String value) {
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
