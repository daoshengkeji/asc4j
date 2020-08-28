
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "description" })
public class AppMediaStateError {

	@JsonProperty("code")
	private String code;
	@JsonProperty("description")
	private String description;

	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

}
