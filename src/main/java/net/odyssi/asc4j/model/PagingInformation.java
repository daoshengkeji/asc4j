
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "paging" })
public class PagingInformation {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("paging")
	private Paging paging;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("paging")
	public Paging getPaging() {
		return this.paging;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("paging")
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}
