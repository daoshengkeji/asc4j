
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class AppStoreVersion {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private Data__1 data;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public Data__1 getData() {
		return this.data;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(Data__1 data) {
		this.data = data;
	}

}
