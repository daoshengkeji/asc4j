
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
public class AppAttributes {

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

}
