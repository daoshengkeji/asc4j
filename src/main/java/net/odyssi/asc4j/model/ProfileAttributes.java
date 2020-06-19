
package net.odyssi.asc4j.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "platform", "profileContent", "uuid", "createdDate", "profileState", "profileType",
		"expirationDate" })
public class ProfileAttributes {

	public enum ProfileState {

		ACTIVE("ACTIVE"), INVALID("INVALID");

		private final static Map<String, ProfileAttributes.ProfileState> CONSTANTS = new HashMap<String, ProfileAttributes.ProfileState>();
		static {
			for (ProfileAttributes.ProfileState c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static ProfileAttributes.ProfileState fromValue(String value) {
			ProfileAttributes.ProfileState constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private ProfileState(String value) {
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

	public enum ProfileType {

		IOS_APP_ADHOC("IOS_APP_ADHOC"), IOS_APP_DEVELOPMENT("IOS_APP_DEVELOPMENT"), IOS_APP_INHOUSE("IOS_APP_INHOUSE"),
		IOS_APP_STORE("IOS_APP_STORE"), MAC_APP_DEVELOPMENT("MAC_APP_DEVELOPMENT"), MAC_APP_DIRECT("MAC_APP_DIRECT"),
		MAC_APP_STORE("MAC_APP_STORE"), TVOS_APP_ADHOC("TVOS_APP_ADHOC"), TVOS_APP_DEVELOPMENT("TVOS_APP_DEVELOPMENT"),
		TVOS_APP_INHOUSE("TVOS_APP_INHOUSE"), TVOS_APP_STORE("TVOS_APP_STORE");

		private final static Map<String, ProfileAttributes.ProfileType> CONSTANTS = new HashMap<String, ProfileAttributes.ProfileType>();
		static {
			for (ProfileAttributes.ProfileType c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static ProfileAttributes.ProfileType fromValue(String value) {
			ProfileAttributes.ProfileType constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private ProfileType(String value) {
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

	/**
	 *
	 */
	@JsonProperty("createdDate")
	@JsonPropertyDescription("")
	private Date createdDate;
	/**
	 *
	 */
	@JsonProperty("expirationDate")
	@JsonPropertyDescription("")
	private Date expirationDate;
	/**
	 *
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;
	/**
	 * Strings that represent the operating system intended for the bundle.
	 *
	 */
	@JsonProperty("platform")
	@JsonPropertyDescription("Strings that represent the operating system intended for the bundle.")
	private BundleIdPlatform platform;
	/**
	 *
	 */
	@JsonProperty("profileContent")
	@JsonPropertyDescription("")
	private String profileContent;
	/**
	 *
	 */
	@JsonProperty("profileState")
	@JsonPropertyDescription("")
	private ProfileAttributes.ProfileState profileState;

	/**
	 *
	 */
	@JsonProperty("profileType")
	@JsonPropertyDescription("")
	private ProfileAttributes.ProfileType profileType;

	/**
	 *
	 */
	@JsonProperty("uuid")
	@JsonPropertyDescription("")
	private String uuid;

}
