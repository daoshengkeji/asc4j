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
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BetaGroupRelationships
 */
@JsonPropertyOrder({ BetaGroupRelationships.JSON_PROPERTY_APP, BetaGroupRelationships.JSON_PROPERTY_BUILDS,
		BetaGroupRelationships.JSON_PROPERTY_BETA_TESTERS })

public class BetaGroupRelationships implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 3721579902660792865L;

	public static final String JSON_PROPERTY_APP = "app";

	public static final String JSON_PROPERTY_BETA_TESTERS = "betaTesters";
	public static final String JSON_PROPERTY_BUILDS = "builds";

	private AppEncryptionDeclarationRelationshipsApp app;

	private BetaGroupRelationshipsBetaTesters betaTesters;
	private AppRelationshipsBuilds builds;

	public BetaGroupRelationships app(AppEncryptionDeclarationRelationshipsApp app) {

		this.app = app;
		return this;
	}

	public BetaGroupRelationships betaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {

		this.betaTesters = betaTesters;
		return this;
	}

	public BetaGroupRelationships builds(AppRelationshipsBuilds builds) {

		this.builds = builds;
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
		BetaGroupRelationships betaGroupRelationships = (BetaGroupRelationships) o;
		return Objects.equals(this.app, betaGroupRelationships.app)
				&& Objects.equals(this.builds, betaGroupRelationships.builds)
				&& Objects.equals(this.betaTesters, betaGroupRelationships.betaTesters);
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppEncryptionDeclarationRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get betaTesters
	 *
	 * @return betaTesters
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_BETA_TESTERS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public BetaGroupRelationshipsBetaTesters getBetaTesters() {
		return this.betaTesters;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_BUILDS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.app, this.builds, this.betaTesters);
	}

	public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
		this.app = app;
	}

	public void setBetaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {
		this.betaTesters = betaTesters;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
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
		sb.append("class BetaGroupRelationships {\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    betaTesters: ").append(toIndentedString(this.betaTesters)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
