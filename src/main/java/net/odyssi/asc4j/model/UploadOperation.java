
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "method", "url", "length", "offset", "requestHeaders" })
public class UploadOperation {

	@JsonProperty("length")
	private Integer length;
	@JsonProperty("method")
	private String method;
	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("requestHeaders")
	private List<UploadOperationHeader> requestHeaders = new ArrayList<UploadOperationHeader>();
	@JsonProperty("url")
	private String url;

	@JsonProperty("length")
	public Integer getLength() {
		return this.length;
	}

	@JsonProperty("method")
	public String getMethod() {
		return this.method;
	}

	@JsonProperty("offset")
	public Integer getOffset() {
		return this.offset;
	}

	@JsonProperty("requestHeaders")
	public List<UploadOperationHeader> getRequestHeaders() {
		return this.requestHeaders;
	}

	@JsonProperty("url")
	public String getUrl() {
		return this.url;
	}

	@JsonProperty("length")
	public void setLength(Integer length) {
		this.length = length;
	}

	@JsonProperty("method")
	public void setMethod(String method) {
		this.method = method;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	@JsonProperty("requestHeaders")
	public void setRequestHeaders(List<UploadOperationHeader> requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

}
