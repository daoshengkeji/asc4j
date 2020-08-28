
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "visibleApps" })
public class Relationships {

	@JsonProperty("visibleApps")
	private VisibleApps visibleApps;

	@JsonProperty("visibleApps")
	public VisibleApps getVisibleApps() {
		return this.visibleApps;
	}

	@JsonProperty("visibleApps")
	public void setVisibleApps(VisibleApps visibleApps) {
		this.visibleApps = visibleApps;
	}

}
