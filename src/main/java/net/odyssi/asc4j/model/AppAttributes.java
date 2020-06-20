
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Attributes that describe a resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "bundleId", "name", "primaryLocale", "sku" })
public class AppAttributes implements AttributesObject {

	@JsonProperty("bundleId")
	@JsonPropertyDescription("The bundle ID for your app. This ID must match the one you use in Xcode. The bundle ID cannot be changed after you upload your first build.")
	private String bundleId;

	@JsonProperty("name")
	@JsonPropertyDescription("The name of your app as it will appear in the App Store. The maximum length is 30 characters.")
	private String name;

	@JsonProperty("primaryLocale")
	@JsonPropertyDescription("The primary locale for your app. If localized app information isn\u2019t available in an App Store territory, the information from your primary language is used instead.")
	private String primaryLocale;

	@JsonProperty("sku")
	@JsonPropertyDescription("A unique ID for your app that is not visible on the App Store.")
	private String sku;

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
		AppAttributes other = (AppAttributes) obj;
		if (this.bundleId == null) {
			if (other.bundleId != null) {
				return false;
			}
		} else if (!this.bundleId.equals(other.bundleId)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.primaryLocale == null) {
			if (other.primaryLocale != null) {
				return false;
			}
		} else if (!this.primaryLocale.equals(other.primaryLocale)) {
			return false;
		}
		if (this.sku == null) {
			if (other.sku != null) {
				return false;
			}
		} else if (!this.sku.equals(other.sku)) {
			return false;
		}
		return true;
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public String getName() {
		return this.name;
	}

	public String getPrimaryLocale() {
		return this.primaryLocale;
	}

	public String getSku() {
		return this.sku;
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
		result = prime * result + (this.bundleId == null ? 0 : this.bundleId.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.primaryLocale == null ? 0 : this.primaryLocale.hashCode());
		result = prime * result + (this.sku == null ? 0 : this.sku.hashCode());
		return result;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrimaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppAttributes [bundleId=" + this.bundleId + ", name=" + this.name + ", primaryLocale="
				+ this.primaryLocale + ", sku=" + this.sku + "]";
	}

}
