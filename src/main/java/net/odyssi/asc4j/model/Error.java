
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "status", "code", "title", "detail", "source" })
public class Error {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("code")
	private String code;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("detail")
	private String detail;
	@JsonProperty("id")
	private String id;
	@JsonProperty("source")
	private Object source;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("status")
	private String status;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("title")
	private String title;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("detail")
	public String getDetail() {
		return this.detail;
	}

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	@JsonProperty("source")
	public Object getSource() {
		return this.source;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("status")
	public String getStatus() {
		return this.status;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("detail")
	public void setDetail(String detail) {
		this.detail = detail;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("source")
	public void setSource(Object source) {
		this.source = source;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

}
