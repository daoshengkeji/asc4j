
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "errors", "warnings", "state" })
public class AppMediaAssetState {

	public enum State {

		AWAITING_UPLOAD("AWAITING_UPLOAD"), COMPLETE("COMPLETE"), FAILED("FAILED"), UPLOAD_COMPLETE("UPLOAD_COMPLETE");

		private final static Map<String, AppMediaAssetState.State> CONSTANTS = new HashMap<String, AppMediaAssetState.State>();
		static {
			for (AppMediaAssetState.State c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static AppMediaAssetState.State fromValue(String value) {
			AppMediaAssetState.State constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private State(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		@JsonValue
		public String value() {
			return this.value;
		}

	}

	@JsonProperty("errors")
	private List<net.odyssi.asc4j.model.AppMediaStateError> errors = new ArrayList<net.odyssi.asc4j.model.AppMediaStateError>();
	@JsonProperty("state")
	private AppMediaAssetState.State state;

	@JsonProperty("warnings")
	private List<net.odyssi.asc4j.model.AppMediaStateError> warnings = new ArrayList<net.odyssi.asc4j.model.AppMediaStateError>();

	@JsonProperty("errors")
	public List<net.odyssi.asc4j.model.AppMediaStateError> getErrors() {
		return this.errors;
	}

	@JsonProperty("state")
	public AppMediaAssetState.State getState() {
		return this.state;
	}

	@JsonProperty("warnings")
	public List<net.odyssi.asc4j.model.AppMediaStateError> getWarnings() {
		return this.warnings;
	}

	@JsonProperty("errors")
	public void setErrors(List<net.odyssi.asc4j.model.AppMediaStateError> errors) {
		this.errors = errors;
	}

	@JsonProperty("state")
	public void setState(AppMediaAssetState.State state) {
		this.state = state;
	}

	@JsonProperty("warnings")
	public void setWarnings(List<net.odyssi.asc4j.model.AppMediaStateError> warnings) {
		this.warnings = warnings;
	}

}
