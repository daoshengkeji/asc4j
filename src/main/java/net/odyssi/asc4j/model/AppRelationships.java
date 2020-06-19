
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betaAppLocalizations == null) ? 0 : betaAppLocalizations.hashCode());
		result = prime * result + ((betaAppReviewDetail == null) ? 0 : betaAppReviewDetail.hashCode());
		result = prime * result + ((betaGroups == null) ? 0 : betaGroups.hashCode());
		result = prime * result + ((betaLicenseAgreement == null) ? 0 : betaLicenseAgreement.hashCode());
		result = prime * result + ((betaTesters == null) ? 0 : betaTesters.hashCode());
		result = prime * result + ((builds == null) ? 0 : builds.hashCode());
		result = prime * result + ((preReleaseVersions == null) ? 0 : preReleaseVersions.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppRelationships other = (AppRelationships) obj;
		if (betaAppLocalizations == null) {
			if (other.betaAppLocalizations != null)
				return false;
		} else if (!betaAppLocalizations.equals(other.betaAppLocalizations))
			return false;
		if (betaAppReviewDetail == null) {
			if (other.betaAppReviewDetail != null)
				return false;
		} else if (!betaAppReviewDetail.equals(other.betaAppReviewDetail))
			return false;
		if (betaGroups == null) {
			if (other.betaGroups != null)
				return false;
		} else if (!betaGroups.equals(other.betaGroups))
			return false;
		if (betaLicenseAgreement == null) {
			if (other.betaLicenseAgreement != null)
				return false;
		} else if (!betaLicenseAgreement.equals(other.betaLicenseAgreement))
			return false;
		if (betaTesters == null) {
			if (other.betaTesters != null)
				return false;
		} else if (!betaTesters.equals(other.betaTesters))
			return false;
		if (builds == null) {
			if (other.builds != null)
				return false;
		} else if (!builds.equals(other.builds))
			return false;
		if (preReleaseVersions == null) {
			if (other.preReleaseVersions != null)
				return false;
		} else if (!preReleaseVersions.equals(other.preReleaseVersions))
			return false;
		return true;
	}

}
