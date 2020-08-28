
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class PrimarySubcategoryOne {

	@JsonProperty("data")
	private Data__2 data;

	@JsonProperty("data")
	public Data__2 getData() {
		return this.data;
	}

	@JsonProperty("data")
	public void setData(Data__2 data) {
		this.data = data;
	}

}
