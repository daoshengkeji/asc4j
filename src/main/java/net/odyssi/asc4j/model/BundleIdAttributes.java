
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "identifier", "name", "platform", "seedId" })
public class BundleIdAttributes {

	@JsonProperty("identifier")
	@JsonPropertyDescription("")
	private String identifier;

	@JsonProperty("name")
	@JsonPropertyDescription("")
	private String name;

	@JsonProperty("platform")
	@JsonPropertyDescription("Strings that represent the operating system intended for the bundle.")
	private BundleIdPlatform platform;

	@JsonProperty("seedId")
	@JsonPropertyDescription("")
	private String seedId;

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
		BundleIdAttributes other = (BundleIdAttributes) obj;
		if (this.identifier == null) {
			if (other.identifier != null) {
				return false;
			}
		} else if (!this.identifier.equals(other.identifier)) {
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
		if (this.seedId == null) {
			if (other.seedId != null) {
				return false;
			}
		} else if (!this.seedId.equals(other.seedId)) {
			return false;
		}
		return true;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public String getName() {
		return this.name;
	}

	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	public String getSeedId() {
		return this.seedId;
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
		result = prime * result + (this.identifier == null ? 0 : this.identifier.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.platform == null ? 0 : this.platform.hashCode());
		result = prime * result + (this.seedId == null ? 0 : this.seedId.hashCode());
		return result;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setSeedId(String seedId) {
		this.seedId = seedId;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdAttributes [identifier=" + this.identifier + ", name=" + this.name + ", platform="
				+ this.platform + ", seedId=" + this.seedId + "]";
	}

}
