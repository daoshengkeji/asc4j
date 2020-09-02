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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ProfileRelationshipsCertificates
 */
@JsonPropertyOrder({ ProfileRelationshipsCertificates.JSON_PROPERTY_LINKS,
		ProfileRelationshipsCertificates.JSON_PROPERTY_META, ProfileRelationshipsCertificates.JSON_PROPERTY_DATA })

public class ProfileRelationshipsCertificates implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -4065286325828675374L;

	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_LINKS = "links";
	public static final String JSON_PROPERTY_META = "meta";

	private List<ProfileRelationshipsCertificatesData> data = null;

	private AppCategoryRelationshipsSubcategoriesLinks links;
	private PagingInformation meta;

	public ProfileRelationshipsCertificates addDataItem(ProfileRelationshipsCertificatesData dataItem) {
		if (this.data == null) {
			this.data = new ArrayList<>();
		}
		this.data.add(dataItem);
		return this;
	}

	public ProfileRelationshipsCertificates data(List<ProfileRelationshipsCertificatesData> data) {

		this.data = data;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProfileRelationshipsCertificates profileRelationshipsCertificates = (ProfileRelationshipsCertificates) o;
		return Objects.equals(this.links, profileRelationshipsCertificates.links)
				&& Objects.equals(this.meta, profileRelationshipsCertificates.meta)
				&& Objects.equals(this.data, profileRelationshipsCertificates.data);
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<ProfileRelationshipsCertificatesData> getData() {
		return this.data;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppCategoryRelationshipsSubcategoriesLinks getLinks() {
		return this.links;
	}

	/**
	 * Get meta
	 *
	 * @return meta
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_META)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public PagingInformation getMeta() {
		return this.meta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.links, this.meta, this.data);
	}

	public ProfileRelationshipsCertificates links(AppCategoryRelationshipsSubcategoriesLinks links) {

		this.links = links;
		return this;
	}

	public ProfileRelationshipsCertificates meta(PagingInformation meta) {

		this.meta = meta;
		return this;
	}

	public void setData(List<ProfileRelationshipsCertificatesData> data) {
		this.data = data;
	}

	public void setLinks(AppCategoryRelationshipsSubcategoriesLinks links) {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileRelationshipsCertificates {\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
