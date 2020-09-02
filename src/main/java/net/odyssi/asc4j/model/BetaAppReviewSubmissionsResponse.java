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
 * BetaAppReviewSubmissionsResponse
 */
@JsonPropertyOrder({ BetaAppReviewSubmissionsResponse.JSON_PROPERTY_DATA,
		BetaAppReviewSubmissionsResponse.JSON_PROPERTY_INCLUDED, BetaAppReviewSubmissionsResponse.JSON_PROPERTY_LINKS,
		BetaAppReviewSubmissionsResponse.JSON_PROPERTY_META })

public class BetaAppReviewSubmissionsResponse implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 3772264143475933897L;

	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_INCLUDED = "included";
	public static final String JSON_PROPERTY_LINKS = "links";

	public static final String JSON_PROPERTY_META = "meta";

	private List<BetaAppReviewSubmission> data = new ArrayList<>();
	private List<Build> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public BetaAppReviewSubmissionsResponse addDataItem(BetaAppReviewSubmission dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaAppReviewSubmissionsResponse addIncludedItem(Build includedItem) {
		if (this.included == null) {
			this.included = new ArrayList<>();
		}
		this.included.add(includedItem);
		return this;
	}

	public BetaAppReviewSubmissionsResponse data(List<BetaAppReviewSubmission> data) {

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
		BetaAppReviewSubmissionsResponse betaAppReviewSubmissionsResponse = (BetaAppReviewSubmissionsResponse) o;
		return Objects.equals(this.data, betaAppReviewSubmissionsResponse.data)
				&& Objects.equals(this.included, betaAppReviewSubmissionsResponse.included)
				&& Objects.equals(this.links, betaAppReviewSubmissionsResponse.links)
				&& Objects.equals(this.meta, betaAppReviewSubmissionsResponse.meta);
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@NotNull
	@Valid

	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public List<BetaAppReviewSubmission> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_INCLUDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<Build> getIncluded() {
		return this.included;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@NotNull
	@Valid

	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public PagedDocumentLinks getLinks() {
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
		return Objects.hash(this.data, this.included, this.links, this.meta);
	}

	public BetaAppReviewSubmissionsResponse included(List<Build> included) {

		this.included = included;
		return this;
	}

	public BetaAppReviewSubmissionsResponse links(PagedDocumentLinks links) {

		this.links = links;
		return this;
	}

	public BetaAppReviewSubmissionsResponse meta(PagingInformation meta) {

		this.meta = meta;
		return this;
	}

	public void setData(List<BetaAppReviewSubmission> data) {
		this.data = data;
	}

	public void setIncluded(List<Build> included) {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppReviewSubmissionsResponse {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
