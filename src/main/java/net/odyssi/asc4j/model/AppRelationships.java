
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Navigational links to related data and included resource types and IDs.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "betaLicenseAgreement", "preReleaseVersions", "betaAppLocalizations", "betaGroups", "betaTesters",
		"builds", "betaAppReviewDetail" })
public class AppRelationships {

	@JsonProperty("betaAppLocalizations")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppPagedRelationshipsType betaAppLocalizations;

	@JsonProperty("betaAppReviewDetail")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppRelationshipsType betaAppReviewDetail;

	@JsonProperty("betaGroups")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppPagedRelationshipsType betaGroups;

	@JsonProperty("betaLicenseAgreement")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppRelationshipsType betaLicenseAgreement;

	@JsonProperty("betaTesters")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppPagedRelationshipsType betaTesters;

	@JsonProperty("builds")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppPagedRelationshipsType builds;

	@JsonProperty("preReleaseVersions")
	@JsonPropertyDescription("")
	private net.odyssi.asc4j.model.AppPagedRelationshipsType preReleaseVersions;

	public net.odyssi.asc4j.model.AppPagedRelationshipsType getBetaAppLocalizations() {
		return this.betaAppLocalizations;
	}

	public net.odyssi.asc4j.model.AppRelationshipsType getBetaAppReviewDetail() {
		return this.betaAppReviewDetail;
	}

	public net.odyssi.asc4j.model.AppPagedRelationshipsType getBetaGroups() {
		return this.betaGroups;
	}

	public net.odyssi.asc4j.model.AppRelationshipsType getBetaLicenseAgreement() {
		return this.betaLicenseAgreement;
	}

	public net.odyssi.asc4j.model.AppPagedRelationshipsType getBetaTesters() {
		return this.betaTesters;
	}

	public net.odyssi.asc4j.model.AppPagedRelationshipsType getBuilds() {
		return this.builds;
	}

	public net.odyssi.asc4j.model.AppPagedRelationshipsType getPreReleaseVersions() {
		return this.preReleaseVersions;
	}

	public void setBetaAppLocalizations(net.odyssi.asc4j.model.AppPagedRelationshipsType betaAppLocalizations) {
		this.betaAppLocalizations = betaAppLocalizations;
	}

	public void setBetaAppReviewDetail(net.odyssi.asc4j.model.AppRelationshipsType betaAppReviewDetail) {
		this.betaAppReviewDetail = betaAppReviewDetail;
	}

	public void setBetaGroups(net.odyssi.asc4j.model.AppPagedRelationshipsType betaGroups) {
		this.betaGroups = betaGroups;
	}

	public void setBetaLicenseAgreement(net.odyssi.asc4j.model.AppRelationshipsType betaLicenseAgreement) {
		this.betaLicenseAgreement = betaLicenseAgreement;
	}

	public void setBetaTesters(net.odyssi.asc4j.model.AppPagedRelationshipsType betaTesters) {
		this.betaTesters = betaTesters;
	}

	public void setBuilds(net.odyssi.asc4j.model.AppPagedRelationshipsType builds) {
		this.builds = builds;
	}

	public void setPreReleaseVersions(net.odyssi.asc4j.model.AppPagedRelationshipsType preReleaseVersions) {
		this.preReleaseVersions = preReleaseVersions;
	}

}
