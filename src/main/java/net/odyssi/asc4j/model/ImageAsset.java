
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "templateUrl", "width", "height" })
public class ImageAsset {

	@JsonProperty("height")
	private Integer height;
	@JsonProperty("templateUrl")
	private String templateUrl;
	@JsonProperty("width")
	private Integer width;

	@JsonProperty("height")
	public Integer getHeight() {
		return this.height;
	}

	@JsonProperty("templateUrl")
	public String getTemplateUrl() {
		return this.templateUrl;
	}

	@JsonProperty("width")
	public Integer getWidth() {
		return this.width;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	@JsonProperty("templateUrl")
	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}

}
