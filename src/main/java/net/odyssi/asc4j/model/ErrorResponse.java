
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Detailed error information returned in the response body whenever an API
 * request is not successful.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "errors" })
public class ErrorResponse {

	@JsonProperty("errors")
	@JsonPropertyDescription("An array of one or more errors.")
	private List<Error> errors = new ArrayList<Error>();

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ErrorResponse other = (ErrorResponse) obj;
		if (this.errors == null) {
			if (other.errors != null) {
				return false;
			}
		} else if (!this.errors.equals(other.errors)) {
			return false;
		}
		return true;
	}

	public List<Error> getErrors() {
		return this.errors;
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
		result = prime * result + (this.errors == null ? 0 : this.errors.hashCode());
		return result;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ErrorResponse [errors=" + this.errors + "]";
	}

}
