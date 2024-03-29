/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ableai.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.ableai.api.sdk.model.V1Attribute;
import com.ableai.api.sdk.model.V1DataTransferDirectionV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a DocumentContent that has been acquired for processing.
 */
@ApiModel(description = "Represents a DocumentContent that has been acquired for processing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V1AcquiredDocumentContentV1 {
  public static final String SERIALIZED_NAME_DOCUMENT_CONTENT_ID = "documentContentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CONTENT_ID)
  private String documentContentId;

  public static final String SERIALIZED_NAME_EXTERNAL_PRIMARY_KEY = "externalPrimaryKey";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PRIMARY_KEY)
  private String externalPrimaryKey;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private V1DataTransferDirectionV1 direction = V1DataTransferDirectionV1.DATA_TRANSFER_DIRECTION_UNSPECIFIED;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "uploadUrl";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public static final String SERIALIZED_NAME_RAW_FILE_URL = "rawFileUrl";
  @SerializedName(SERIALIZED_NAME_RAW_FILE_URL)
  private String rawFileUrl;

  public static final String SERIALIZED_NAME_STANDARDIZED_PDF_URL = "standardizedPdfUrl";
  @SerializedName(SERIALIZED_NAME_STANDARDIZED_PDF_URL)
  private String standardizedPdfUrl;

  public static final String SERIALIZED_NAME_CONTENT_URL = "contentUrl";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private String contentUrl;

  public static final String SERIALIZED_NAME_ACQUIRED_BY = "acquiredBy";
  @SerializedName(SERIALIZED_NAME_ACQUIRED_BY)
  private String acquiredBy;

  public static final String SERIALIZED_NAME_ACQUIRED_TIME = "acquiredTime";
  @SerializedName(SERIALIZED_NAME_ACQUIRED_TIME)
  private OffsetDateTime acquiredTime;

  public static final String SERIALIZED_NAME_NEXT_RETRY_TIME = "nextRetryTime";
  @SerializedName(SERIALIZED_NAME_NEXT_RETRY_TIME)
  private OffsetDateTime nextRetryTime;

  public static final String SERIALIZED_NAME_TASK_TYPE = "taskType";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private String taskType;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<V1Attribute> attributes = null;


  public V1AcquiredDocumentContentV1 documentContentId(String documentContentId) {
    
    this.documentContentId = documentContentId;
    return this;
  }

   /**
   * The ID of the document content.
   * @return documentContentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the document content.")

  public String getDocumentContentId() {
    return documentContentId;
  }


  public void setDocumentContentId(String documentContentId) {
    this.documentContentId = documentContentId;
  }


  public V1AcquiredDocumentContentV1 externalPrimaryKey(String externalPrimaryKey) {
    
    this.externalPrimaryKey = externalPrimaryKey;
    return this;
  }

   /**
   * The primary key of the document in the external system.
   * @return externalPrimaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary key of the document in the external system.")

  public String getExternalPrimaryKey() {
    return externalPrimaryKey;
  }


  public void setExternalPrimaryKey(String externalPrimaryKey) {
    this.externalPrimaryKey = externalPrimaryKey;
  }


  public V1AcquiredDocumentContentV1 direction(V1DataTransferDirectionV1 direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1DataTransferDirectionV1 getDirection() {
    return direction;
  }


  public void setDirection(V1DataTransferDirectionV1 direction) {
    this.direction = direction;
  }


  public V1AcquiredDocumentContentV1 uploadUrl(String uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * The upload URL for the document file in GCS.
   * @return uploadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upload URL for the document file in GCS.")

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  public V1AcquiredDocumentContentV1 rawFileUrl(String rawFileUrl) {
    
    this.rawFileUrl = rawFileUrl;
    return this;
  }

   /**
   * The download URL for the raw document file in GCS.
   * @return rawFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The download URL for the raw document file in GCS.")

  public String getRawFileUrl() {
    return rawFileUrl;
  }


  public void setRawFileUrl(String rawFileUrl) {
    this.rawFileUrl = rawFileUrl;
  }


  public V1AcquiredDocumentContentV1 standardizedPdfUrl(String standardizedPdfUrl) {
    
    this.standardizedPdfUrl = standardizedPdfUrl;
    return this;
  }

   /**
   * The download URL for the standardized PDF file in GCS.
   * @return standardizedPdfUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The download URL for the standardized PDF file in GCS.")

  public String getStandardizedPdfUrl() {
    return standardizedPdfUrl;
  }


  public void setStandardizedPdfUrl(String standardizedPdfUrl) {
    this.standardizedPdfUrl = standardizedPdfUrl;
  }


  public V1AcquiredDocumentContentV1 contentUrl(String contentUrl) {
    
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * The download URL for the content file in GCS.
   * @return contentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The download URL for the content file in GCS.")

  public String getContentUrl() {
    return contentUrl;
  }


  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }


  public V1AcquiredDocumentContentV1 acquiredBy(String acquiredBy) {
    
    this.acquiredBy = acquiredBy;
    return this;
  }

   /**
   * The name of the worker that acquired the document content.
   * @return acquiredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the worker that acquired the document content.")

  public String getAcquiredBy() {
    return acquiredBy;
  }


  public void setAcquiredBy(String acquiredBy) {
    this.acquiredBy = acquiredBy;
  }


  public V1AcquiredDocumentContentV1 acquiredTime(OffsetDateTime acquiredTime) {
    
    this.acquiredTime = acquiredTime;
    return this;
  }

   /**
   * The timestamp when the document content was acquired.
   * @return acquiredTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the document content was acquired.")

  public OffsetDateTime getAcquiredTime() {
    return acquiredTime;
  }


  public void setAcquiredTime(OffsetDateTime acquiredTime) {
    this.acquiredTime = acquiredTime;
  }


  public V1AcquiredDocumentContentV1 nextRetryTime(OffsetDateTime nextRetryTime) {
    
    this.nextRetryTime = nextRetryTime;
    return this;
  }

   /**
   * The expected time of task compleation. If not completed before this time, the task will be retried.
   * @return nextRetryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expected time of task compleation. If not completed before this time, the task will be retried.")

  public OffsetDateTime getNextRetryTime() {
    return nextRetryTime;
  }


  public void setNextRetryTime(OffsetDateTime nextRetryTime) {
    this.nextRetryTime = nextRetryTime;
  }


  public V1AcquiredDocumentContentV1 taskType(String taskType) {
    
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskType() {
    return taskType;
  }


  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }


  public V1AcquiredDocumentContentV1 attributes(List<V1Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public V1AcquiredDocumentContentV1 addAttributesItem(V1Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<V1Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<V1Attribute> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AcquiredDocumentContentV1 v1AcquiredDocumentContentV1 = (V1AcquiredDocumentContentV1) o;
    return Objects.equals(this.documentContentId, v1AcquiredDocumentContentV1.documentContentId) &&
        Objects.equals(this.externalPrimaryKey, v1AcquiredDocumentContentV1.externalPrimaryKey) &&
        Objects.equals(this.direction, v1AcquiredDocumentContentV1.direction) &&
        Objects.equals(this.uploadUrl, v1AcquiredDocumentContentV1.uploadUrl) &&
        Objects.equals(this.rawFileUrl, v1AcquiredDocumentContentV1.rawFileUrl) &&
        Objects.equals(this.standardizedPdfUrl, v1AcquiredDocumentContentV1.standardizedPdfUrl) &&
        Objects.equals(this.contentUrl, v1AcquiredDocumentContentV1.contentUrl) &&
        Objects.equals(this.acquiredBy, v1AcquiredDocumentContentV1.acquiredBy) &&
        Objects.equals(this.acquiredTime, v1AcquiredDocumentContentV1.acquiredTime) &&
        Objects.equals(this.nextRetryTime, v1AcquiredDocumentContentV1.nextRetryTime) &&
        Objects.equals(this.taskType, v1AcquiredDocumentContentV1.taskType) &&
        Objects.equals(this.attributes, v1AcquiredDocumentContentV1.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentContentId, externalPrimaryKey, direction, uploadUrl, rawFileUrl, standardizedPdfUrl, contentUrl, acquiredBy, acquiredTime, nextRetryTime, taskType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AcquiredDocumentContentV1 {\n");
    sb.append("    documentContentId: ").append(toIndentedString(documentContentId)).append("\n");
    sb.append("    externalPrimaryKey: ").append(toIndentedString(externalPrimaryKey)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    rawFileUrl: ").append(toIndentedString(rawFileUrl)).append("\n");
    sb.append("    standardizedPdfUrl: ").append(toIndentedString(standardizedPdfUrl)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    acquiredBy: ").append(toIndentedString(acquiredBy)).append("\n");
    sb.append("    acquiredTime: ").append(toIndentedString(acquiredTime)).append("\n");
    sb.append("    nextRetryTime: ").append(toIndentedString(nextRetryTime)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

