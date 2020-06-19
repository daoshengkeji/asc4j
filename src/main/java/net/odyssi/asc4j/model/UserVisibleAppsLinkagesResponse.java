
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a list of related resource IDs.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "meta", "data" })
public class UserVisibleAppsLinkagesResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private ResourceObjectData data;

	@JsonProperty("links")
	@JsonPropertyDescription("Links related to the response document, including paging links.")
	private PagedDocumentLinks links;

	@JsonProperty("meta")
	@JsonPropertyDescription("Paging information for data responses.")
	private PagingInformation meta;

	public ResourceObjectData getData() {
		return this.data;
	}

	public PagedDocumentLinks getLinks() {
		return this.links;
	}

	public PagingInformation getMeta() {
		return this.meta;
	}

	public void setData(ResourceObjectData data) {
		this.data = data;
	}

	public void setLinks(PagedDocumentLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
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
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVisibleAppsLinkagesResponse other = (UserVisibleAppsLinkagesResponse) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		return true;
	}

}
