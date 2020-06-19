
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class UserUpdateRequestDataRelationshipsVisibleApps {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<ResourceObjectData> data = new ArrayList<ResourceObjectData>();

	public List<ResourceObjectData> getData() {
		return this.data;
	}

	public void setData(List<ResourceObjectData> data) {
		this.data = data;
	}

}
