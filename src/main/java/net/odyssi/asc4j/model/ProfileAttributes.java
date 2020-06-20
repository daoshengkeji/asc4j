
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
public class ProfileAttributes implements AttributesObject {

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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProfileAttributes other = (ProfileAttributes) obj;
		if (this.createdDate == null) {
			if (other.createdDate != null) {
				return false;
			}
		} else if (!this.createdDate.equals(other.createdDate)) {
			return false;
		}
		if (this.expirationDate == null) {
			if (other.expirationDate != null) {
				return false;
			}
		} else if (!this.expirationDate.equals(other.expirationDate)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.platform != other.platform) {
			return false;
		}
		if (this.profileContent == null) {
			if (other.profileContent != null) {
				return false;
			}
		} else if (!this.profileContent.equals(other.profileContent)) {
			return false;
		}
		if (this.profileState != other.profileState) {
			return false;
		}
		if (this.profileType != other.profileType) {
			return false;
		}
		if (this.uuid == null) {
			if (other.uuid != null) {
				return false;
			}
		} else if (!this.uuid.equals(other.uuid)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.createdDate == null ? 0 : this.createdDate.hashCode());
		result = prime * result + (this.expirationDate == null ? 0 : this.expirationDate.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.platform == null ? 0 : this.platform.hashCode());
		result = prime * result + (this.profileContent == null ? 0 : this.profileContent.hashCode());
		result = prime * result + (this.profileState == null ? 0 : this.profileState.hashCode());
		result = prime * result + (this.profileType == null ? 0 : this.profileType.hashCode());
		result = prime * result + (this.uuid == null ? 0 : this.uuid.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfileAttributes [createdDate=" + this.createdDate + ", expirationDate=" + this.expirationDate
				+ ", name=" + this.name + ", platform=" + this.platform + ", profileContent=" + this.profileContent
				+ ", profileState=" + this.profileState + ", profileType=" + this.profileType + ", uuid=" + this.uuid
				+ "]";
	}

}
