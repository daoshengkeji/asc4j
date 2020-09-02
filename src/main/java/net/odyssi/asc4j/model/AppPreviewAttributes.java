/*
 * App Store Connect API
 * Automate the tasks you perform on the Apple Developer website and in App Store Connect.  The App Store Connect API is a REST API that enables the automation of actions you take in App Store Connect.  Calls to the API require JSON Web Tokens (JWT) for authorization; you obtain keys to create the tokens from your organization’s App Store Connect account.
 *
 * The version of the OpenAPI document: 1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppPreviewAttributes
 */
@JsonPropertyOrder({ AppPreviewAttributes.JSON_PROPERTY_FILE_SIZE, AppPreviewAttributes.JSON_PROPERTY_FILE_NAME,
		AppPreviewAttributes.JSON_PROPERTY_SOURCE_FILE_CHECKSUM,
		AppPreviewAttributes.JSON_PROPERTY_PREVIEW_FRAME_TIME_CODE, AppPreviewAttributes.JSON_PROPERTY_MIME_TYPE,
		AppPreviewAttributes.JSON_PROPERTY_VIDEO_URL, AppPreviewAttributes.JSON_PROPERTY_PREVIEW_IMAGE,
		AppPreviewAttributes.JSON_PROPERTY_UPLOAD_OPERATIONS, AppPreviewAttributes.JSON_PROPERTY_ASSET_DELIVERY_STATE })
public class AppPreviewAttributes implements Serializable {

	private static final long serialVersionUID = -1922395681603719002L;

	public static final String JSON_PROPERTY_ASSET_DELIVERY_STATE = "assetDeliveryState";

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	public static final String JSON_PROPERTY_PREVIEW_FRAME_TIME_CODE = "previewFrameTimeCode";

	public static final String JSON_PROPERTY_PREVIEW_IMAGE = "previewImage";
	public static final String JSON_PROPERTY_SOURCE_FILE_CHECKSUM = "sourceFileChecksum";

	public static final String JSON_PROPERTY_UPLOAD_OPERATIONS = "uploadOperations";
	public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";

	private AppMediaAssetState assetDeliveryState;

	private String fileName;
	private Integer fileSize;

	private String mimeType;
	private String previewFrameTimeCode;

	private ImageAsset previewImage;
	private String sourceFileChecksum;

	private List<UploadOperation> uploadOperations = null;
	private String videoUrl;

	public AppPreviewAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
		if (this.uploadOperations == null) {
			this.uploadOperations = new ArrayList<>();
		}
		this.uploadOperations.add(uploadOperationsItem);
		return this;
	}

	public AppPreviewAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppPreviewAttributes appPreviewAttributes = (AppPreviewAttributes) o;
		return Objects.equals(this.fileSize, appPreviewAttributes.fileSize)
				&& Objects.equals(this.fileName, appPreviewAttributes.fileName)
				&& Objects.equals(this.sourceFileChecksum, appPreviewAttributes.sourceFileChecksum)
				&& Objects.equals(this.previewFrameTimeCode, appPreviewAttributes.previewFrameTimeCode)
				&& Objects.equals(this.mimeType, appPreviewAttributes.mimeType)
				&& Objects.equals(this.videoUrl, appPreviewAttributes.videoUrl)
				&& Objects.equals(this.previewImage, appPreviewAttributes.previewImage)
				&& Objects.equals(this.uploadOperations, appPreviewAttributes.uploadOperations)
				&& Objects.equals(this.assetDeliveryState, appPreviewAttributes.assetDeliveryState);
	}

	public AppPreviewAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppPreviewAttributes fileSize(Integer fileSize) {

		this.fileSize = fileSize;
		return this;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_ASSET_DELIVERY_STATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public AppMediaAssetState getAssetDeliveryState() {
		return this.assetDeliveryState;
	}

	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getFileName() {
		return this.fileName;
	}

	@JsonProperty(JSON_PROPERTY_FILE_SIZE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public Integer getFileSize() {
		return this.fileSize;
	}

	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getMimeType() {
		return this.mimeType;
	}

	@JsonProperty(JSON_PROPERTY_PREVIEW_FRAME_TIME_CODE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getPreviewFrameTimeCode() {
		return this.previewFrameTimeCode;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_PREVIEW_IMAGE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public ImageAsset getPreviewImage() {
		return this.previewImage;
	}

	@JsonProperty(JSON_PROPERTY_SOURCE_FILE_CHECKSUM)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getSourceFileChecksum() {
		return this.sourceFileChecksum;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_UPLOAD_OPERATIONS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public List<UploadOperation> getUploadOperations() {
		return this.uploadOperations;
	}

	@JsonProperty(JSON_PROPERTY_VIDEO_URL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getVideoUrl() {
		return this.videoUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.fileSize, this.fileName, this.sourceFileChecksum, this.previewFrameTimeCode,
				this.mimeType, this.videoUrl, this.previewImage, this.uploadOperations, this.assetDeliveryState);
	}

	public AppPreviewAttributes mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	public AppPreviewAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public AppPreviewAttributes previewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
		return this;
	}

	public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	public void setPreviewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
	}

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public AppPreviewAttributes sourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
		return this;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewAttributes {\n");
		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(this.mimeType)).append("\n");
		sb.append("    videoUrl: ").append(toIndentedString(this.videoUrl)).append("\n");
		sb.append("    previewImage: ").append(toIndentedString(this.previewImage)).append("\n");
		sb.append("    uploadOperations: ").append(toIndentedString(this.uploadOperations)).append("\n");
		sb.append("    assetDeliveryState: ").append(toIndentedString(this.assetDeliveryState)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreviewAttributes uploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
		return this;
	}

	public AppPreviewAttributes videoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		return this;
	}

}
