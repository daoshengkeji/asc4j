
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((detail == null) ? 0 : detail.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Error other = (Error) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (detail == null) {
			if (other.detail != null)
				return false;
		} else if (!detail.equals(other.detail))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
