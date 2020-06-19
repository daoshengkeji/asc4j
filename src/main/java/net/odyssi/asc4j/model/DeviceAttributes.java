
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
@JsonPropertyOrder({ "deviceClass", "model", "name", "platform", "status", "udid", "addedDate" })
public class DeviceAttributes {

	public enum Status {

		DISABLED("DISABLED"), ENABLED("ENABLED");

		private final static Map<String, DeviceAttributes.Status> CONSTANTS = new HashMap<String, DeviceAttributes.Status>();
		static {
			for (DeviceAttributes.Status c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static DeviceAttributes.Status fromValue(String value) {
			DeviceAttributes.Status constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private Status(String value) {
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

	@JsonProperty("addedDate")
	@JsonPropertyDescription("")
	private Date addedDate;

	@JsonProperty("deviceClass")
	@JsonPropertyDescription("")
	private DeviceClass deviceClass;

	@JsonProperty("model")
	@JsonPropertyDescription("")
	private String model;

	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	@JsonProperty("platform")
	@JsonPropertyDescription("Strings that represent the operating system intended for the bundle.")
	private BundleIdPlatform platform;

	@JsonProperty("status")
	@JsonPropertyDescription("")
	private DeviceAttributes.Status status;

	@JsonProperty("udid")
	@JsonPropertyDescription("")
	private String udid;

	public Date getAddedDate() {
		return this.addedDate;
	}

	public DeviceClass getDeviceClass() {
		return this.deviceClass;
	}

	public String getModel() {
		return this.model;
	}

	public String getName() {
		return this.name;
	}

	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	public DeviceAttributes.Status getStatus() {
		return this.status;
	}

	public String getUdid() {
		return this.udid;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public void setDeviceClass(DeviceClass deviceClass) {
		this.deviceClass = deviceClass;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setStatus(DeviceAttributes.Status status) {
		this.status = status;
	}

	public void setUdid(String udid) {
		this.udid = udid;
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
		result = prime * result + ((addedDate == null) ? 0 : addedDate.hashCode());
		result = prime * result + ((deviceClass == null) ? 0 : deviceClass.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((udid == null) ? 0 : udid.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceAttributes other = (DeviceAttributes) obj;
		if (addedDate == null) {
			if (other.addedDate != null)
				return false;
		} else if (!addedDate.equals(other.addedDate))
			return false;
		if (deviceClass != other.deviceClass)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (platform != other.platform)
			return false;
		if (status != other.status)
			return false;
		if (udid == null) {
			if (other.udid != null)
				return false;
		} else if (!udid.equals(other.udid))
			return false;
		return true;
	}

}
