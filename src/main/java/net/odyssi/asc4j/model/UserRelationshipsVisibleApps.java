
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
@JsonPropertyOrder({ "meta", "data", "links" })
public class UserRelationshipsVisibleApps {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private List<ResourceObjectData> data = new ArrayList<ResourceObjectData>();

	@JsonProperty("links")
	@JsonPropertyDescription("")
	private ResourceObjectLinks links;

	@JsonProperty("meta")
	@JsonPropertyDescription("Paging information for data responses.")
	private PagingInformation meta;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserRelationshipsVisibleApps other = (UserRelationshipsVisibleApps) obj;
		if (this.data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!this.data.equals(other.data)) {
			return false;
		}
		if (this.links == null) {
			if (other.links != null) {
				return false;
			}
		} else if (!this.links.equals(other.links)) {
			return false;
		}
		if (this.meta == null) {
			if (other.meta != null) {
				return false;
			}
		} else if (!this.meta.equals(other.meta)) {
			return false;
		}
		return true;
	}

	public List<ResourceObjectData> getData() {
		return this.data;
	}

	public ResourceObjectLinks getLinks() {
		return this.links;
	}

	public PagingInformation getMeta() {
		return this.meta;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.data == null ? 0 : this.data.hashCode());
		result = prime * result + (this.links == null ? 0 : this.links.hashCode());
		result = prime * result + (this.meta == null ? 0 : this.meta.hashCode());
		return result;
	}

	public void setData(List<ResourceObjectData> data) {
		this.data = data;
	}

	public void setLinks(ResourceObjectLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRelationshipsVisibleApps [data=" + this.data + ", links=" + this.links + ", meta=" + this.meta
				+ "]";
	}

}
