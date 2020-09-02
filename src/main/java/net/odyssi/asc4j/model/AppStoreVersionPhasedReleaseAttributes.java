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
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionPhasedReleaseAttributes
 */
@JsonPropertyOrder({ AppStoreVersionPhasedReleaseAttributes.JSON_PROPERTY_PHASED_RELEASE_STATE,
		AppStoreVersionPhasedReleaseAttributes.JSON_PROPERTY_START_DATE,
		AppStoreVersionPhasedReleaseAttributes.JSON_PROPERTY_TOTAL_PAUSE_DURATION,
		AppStoreVersionPhasedReleaseAttributes.JSON_PROPERTY_CURRENT_DAY_NUMBER })

public class AppStoreVersionPhasedReleaseAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -6792222416907078594L;

	public static final String JSON_PROPERTY_CURRENT_DAY_NUMBER = "currentDayNumber";

	public static final String JSON_PROPERTY_PHASED_RELEASE_STATE = "phasedReleaseState";
	public static final String JSON_PROPERTY_START_DATE = "startDate";

	public static final String JSON_PROPERTY_TOTAL_PAUSE_DURATION = "totalPauseDuration";

	private Integer currentDayNumber;
	private PhasedReleaseState phasedReleaseState;

	private OffsetDateTime startDate;
	private Integer totalPauseDuration;

	public AppStoreVersionPhasedReleaseAttributes currentDayNumber(Integer currentDayNumber) {

		this.currentDayNumber = currentDayNumber;
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
		AppStoreVersionPhasedReleaseAttributes appStoreVersionPhasedReleaseAttributes = (AppStoreVersionPhasedReleaseAttributes) o;
		return Objects.equals(this.phasedReleaseState, appStoreVersionPhasedReleaseAttributes.phasedReleaseState)
				&& Objects.equals(this.startDate, appStoreVersionPhasedReleaseAttributes.startDate)
				&& Objects.equals(this.totalPauseDuration, appStoreVersionPhasedReleaseAttributes.totalPauseDuration)
				&& Objects.equals(this.currentDayNumber, appStoreVersionPhasedReleaseAttributes.currentDayNumber);
	}

	/**
	 * Get currentDayNumber
	 *
	 * @return currentDayNumber
	 **/

	@JsonProperty(JSON_PROPERTY_CURRENT_DAY_NUMBER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getCurrentDayNumber() {
		return this.currentDayNumber;
	}

	/**
	 * Get phasedReleaseState
	 *
	 * @return phasedReleaseState
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_PHASED_RELEASE_STATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public PhasedReleaseState getPhasedReleaseState() {
		return this.phasedReleaseState;
	}

	/**
	 * Get startDate
	 *
	 * @return startDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_START_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getStartDate() {
		return this.startDate;
	}

	/**
	 * Get totalPauseDuration
	 *
	 * @return totalPauseDuration
	 **/

	@JsonProperty(JSON_PROPERTY_TOTAL_PAUSE_DURATION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getTotalPauseDuration() {
		return this.totalPauseDuration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.phasedReleaseState, this.startDate, this.totalPauseDuration, this.currentDayNumber);
	}

	public AppStoreVersionPhasedReleaseAttributes phasedReleaseState(PhasedReleaseState phasedReleaseState) {

		this.phasedReleaseState = phasedReleaseState;
		return this;
	}

	public void setCurrentDayNumber(Integer currentDayNumber) {
		this.currentDayNumber = currentDayNumber;
	}

	public void setPhasedReleaseState(PhasedReleaseState phasedReleaseState) {
		this.phasedReleaseState = phasedReleaseState;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public void setTotalPauseDuration(Integer totalPauseDuration) {
		this.totalPauseDuration = totalPauseDuration;
	}

	public AppStoreVersionPhasedReleaseAttributes startDate(OffsetDateTime startDate) {

		this.startDate = startDate;
		return this;
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
		sb.append("class AppStoreVersionPhasedReleaseAttributes {\n");
		sb.append("    phasedReleaseState: ").append(toIndentedString(this.phasedReleaseState)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(this.startDate)).append("\n");
		sb.append("    totalPauseDuration: ").append(toIndentedString(this.totalPauseDuration)).append("\n");
		sb.append("    currentDayNumber: ").append(toIndentedString(this.currentDayNumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionPhasedReleaseAttributes totalPauseDuration(Integer totalPauseDuration) {

		this.totalPauseDuration = totalPauseDuration;
		return this;
	}

}
