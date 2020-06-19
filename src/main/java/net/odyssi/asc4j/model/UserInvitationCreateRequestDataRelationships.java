
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class UserInvitationCreateRequestDataRelationships {

	@JsonProperty("visibleApps")
	@JsonPropertyDescription("")
	private UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps;

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
		UserInvitationCreateRequestDataRelationships other = (UserInvitationCreateRequestDataRelationships) obj;
		if (this.visibleApps == null) {
			if (other.visibleApps != null) {
				return false;
			}
		} else if (!this.visibleApps.equals(other.visibleApps)) {
			return false;
		}
		return true;
	}

	public UserInvitationCreateRequestDataRelationshipsVisibleApps getVisibleApps() {
		return this.visibleApps;
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
		result = prime * result + (this.visibleApps == null ? 0 : this.visibleApps.hashCode());
		return result;
	}

	public void setVisibleApps(UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInvitationCreateRequestDataRelationships [visibleApps=" + this.visibleApps + "]";
	}

}
