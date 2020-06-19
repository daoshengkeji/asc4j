
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "visibleApps" })
public class UserInvitationRelationships {

	@JsonProperty("visibleApps")
	@JsonPropertyDescription("")
	private UserInvitationRelationshipsVisibleApps visibleApps;

	public UserInvitationRelationshipsVisibleApps getVisibleApps() {
		return this.visibleApps;
	}

	public void setVisibleApps(UserInvitationRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
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
		result = prime * result + ((visibleApps == null) ? 0 : visibleApps.hashCode());
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
		UserInvitationRelationships other = (UserInvitationRelationships) obj;
		if (visibleApps == null) {
			if (other.visibleApps != null)
				return false;
		} else if (!visibleApps.equals(other.visibleApps))
			return false;
		return true;
	}

}
