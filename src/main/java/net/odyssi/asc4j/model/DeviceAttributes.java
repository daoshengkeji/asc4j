
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

}
