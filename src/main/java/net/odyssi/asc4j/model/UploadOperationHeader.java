
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "value" })
public class UploadOperationHeader {

	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private String value;

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	@JsonProperty("value")
	public String getValue() {
		return this.value;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

}
