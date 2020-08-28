
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class SecondaryCategory {

	@JsonProperty("data")
	private Data__4 data;

	@JsonProperty("data")
	public Data__4 getData() {
		return this.data;
	}

	@JsonProperty("data")
	public void setData(Data__4 data) {
		this.data = data;
	}

}
