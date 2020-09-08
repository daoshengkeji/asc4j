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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppEncryptionDeclarationsResponse
 */
@JsonPropertyOrder({ AppEncryptionDeclarationsResponse.JSON_PROPERTY_DATA,
		AppEncryptionDeclarationsResponse.JSON_PROPERTY_INCLUDED, AppEncryptionDeclarationsResponse.JSON_PROPERTY_LINKS,
		AppEncryptionDeclarationsResponse.JSON_PROPERTY_META })

public class AppEncryptionDeclarationsResponse implements Serializable {

	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_INCLUDED = "included";

	public static final String JSON_PROPERTY_LINKS = "links";
	public static final String JSON_PROPERTY_META = "meta";

	private static final long serialVersionUID = 2349955647214004359L;

	private List<AppEncryptionDeclaration> data = new ArrayList<>();
	private List<App> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public AppEncryptionDeclarationsResponse addDataItem(AppEncryptionDeclaration dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppEncryptionDeclarationsResponse addIncludedItem(App includedItem) {
		if (this.included == null) {
			this.included = new ArrayList<>();
		}
		this.included.add(includedItem);
		return this;
	}

	public AppEncryptionDeclarationsResponse data(List<AppEncryptionDeclaration> data) {
		this.data = data;
		return this;
	}

	/*
	 *
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppEncryptionDeclarationsResponse appEncryptionDeclarationsResponse = (AppEncryptionDeclarationsResponse) o;
		return Objects.equals(this.data, appEncryptionDeclarationsResponse.data)
				&& Objects.equals(this.included, appEncryptionDeclarationsResponse.included)
				&& Objects.equals(this.links, appEncryptionDeclarationsResponse.links)
				&& Objects.equals(this.meta, appEncryptionDeclarationsResponse.meta);
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public List<AppEncryptionDeclaration> getData() {
		return this.data;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_INCLUDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public List<App> getIncluded() {
		return this.included;
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public PagedDocumentLinks getLinks() {
		return this.links;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_META)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public PagingInformation getMeta() {
		return this.meta;
	}

	/*
	 *
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.data, this.included, this.links, this.meta);
	}

	public AppEncryptionDeclarationsResponse included(List<App> included) {
		this.included = included;
		return this;
	}

	public AppEncryptionDeclarationsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public AppEncryptionDeclarationsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppEncryptionDeclaration> data) {
		this.data = data;
	}

	public void setIncluded(List<App> included) {
		this.included = included;
	}

	public void setLinks(PagedDocumentLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	/*
	 *
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEncryptionDeclarationsResponse {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}