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
 * BetaGroupBuildsLinkagesRequest
 */
@JsonPropertyOrder({ BetaGroupBuildsLinkagesRequest.JSON_PROPERTY_DATA })

public class BetaGroupBuildsLinkagesRequest implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -8955873094486230538L;

	public static final String JSON_PROPERTY_DATA = "data";

	private List<AppStoreVersionRelationshipsBuildData> data = new ArrayList<>();

	public BetaGroupBuildsLinkagesRequest addDataItem(AppStoreVersionRelationshipsBuildData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaGroupBuildsLinkagesRequest data(List<AppStoreVersionRelationshipsBuildData> data) {

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
		BetaGroupBuildsLinkagesRequest betaGroupBuildsLinkagesRequest = (BetaGroupBuildsLinkagesRequest) o;
		return Objects.equals(this.data, betaGroupBuildsLinkagesRequest.data);
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

	public List<AppStoreVersionRelationshipsBuildData> getData() {
		return this.data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.data);
	}

	public void setData(List<AppStoreVersionRelationshipsBuildData> data) {
		this.data = data;
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
		sb.append("class BetaGroupBuildsLinkagesRequest {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
