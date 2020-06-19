
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The details about one error that is returned when an API request is not
 * successful.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "status", "id", "title", "detail", "source" })
public class Error {

	// FIXME Look at source again

	@JsonProperty("code")
	@JsonPropertyDescription("A machine-readable code indicating the type of error. The code is a hierarchical value with levels of specificity separated by the '.' character. This value is parseable for programmatic error handling in code.")
	private String code;

	@JsonProperty("detail")
	@JsonPropertyDescription("A detailed explanation of the error. Do not use this field for programmatic error handling.")
	private String detail;

	@JsonProperty("id")
	@JsonPropertyDescription("The unique ID of a specific instance of an error, request, and response. Use this ID when providing feedback to or debugging issues with Apple.")
	private String id;

	@JsonProperty("source")
	@JsonPropertyDescription("One of two possible types of values: source.parameter, provided when a query parameter produced the error, or source.JsonPointer, provided when a problem with the entity produced the error.")
	private Object source;

	@JsonProperty("status")
	@JsonPropertyDescription("The HTTP status code of the error. This status code usually matches the response's status code; however, if the request produces multiple errors, these two codes may differ.")
	private String status;

	@JsonProperty("title")
	@JsonPropertyDescription("A summary of the error. Do not use this field for programmatic error handling.")
	private String title;

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
		Error other = (Error) obj;
		if (this.code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!this.code.equals(other.code)) {
			return false;
		}
		if (this.detail == null) {
			if (other.detail != null) {
				return false;
			}
		} else if (!this.detail.equals(other.detail)) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.source == null) {
			if (other.source != null) {
				return false;
			}
		} else if (!this.source.equals(other.source)) {
			return false;
		}
		if (this.status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!this.status.equals(other.status)) {
			return false;
		}
		if (this.title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!this.title.equals(other.title)) {
			return false;
		}
		return true;
	}

	public String getCode() {
		return this.code;
	}

	public String getDetail() {
		return this.detail;
	}

	public String getId() {
		return this.id;
	}

	public Object getSource() {
		return this.source;
	}

	public String getStatus() {
		return this.status;
	}

	public String getTitle() {
		return this.title;
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
		result = prime * result + (this.code == null ? 0 : this.code.hashCode());
		result = prime * result + (this.detail == null ? 0 : this.detail.hashCode());
		result = prime * result + (this.id == null ? 0 : this.id.hashCode());
		result = prime * result + (this.source == null ? 0 : this.source.hashCode());
		result = prime * result + (this.status == null ? 0 : this.status.hashCode());
		result = prime * result + (this.title == null ? 0 : this.title.hashCode());
		return result;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Error [code=" + this.code + ", detail=" + this.detail + ", id=" + this.id + ", source=" + this.source
				+ ", status=" + this.status + ", title=" + this.title + "]";
	}

}
