
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class BetaTesters {

	@JsonProperty("data")
	private List<Datum__1> data = new ArrayList<Datum__1>();

	@JsonProperty("data")
	public List<Datum__1> getData() {
		return this.data;
	}

	@JsonProperty("data")
	public void setData(List<Datum__1> data) {
		this.data = data;
	}

}
