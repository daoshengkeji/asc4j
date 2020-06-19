
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class AppPagedRelationshipsType extends AppRelationshipsType {

	@JsonProperty("meta")
	@JsonPropertyDescription("")
	private PagingInformation meta;

	public PagingInformation getMeta() {
		return this.meta;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

}
