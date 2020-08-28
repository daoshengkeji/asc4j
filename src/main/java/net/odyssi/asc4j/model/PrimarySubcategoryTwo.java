
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class PrimarySubcategoryTwo {

	@JsonProperty("data")
	private Data__3 data;

	@JsonProperty("data")
	public Data__3 getData() {
		return this.data;
	}

	@JsonProperty("data")
	public void setData(Data__3 data) {
		this.data = data;
	}

}
