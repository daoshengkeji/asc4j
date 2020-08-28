
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class BetaTesterBetaGroupsLinkagesRequest {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private List<Datum> data = new ArrayList<Datum>();

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public List<Datum> getData() {
		return this.data;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(List<Datum> data) {
		this.data = data;
	}

}
