/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230717220244
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

/**
 * Represents a document content created for processing.
 */
@ApiModel(description = "Represents a document content created for processing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V1DocumentContent {
  public static final String SERIALIZED_NAME_EXTERNAL_PRIMARY_KEY = "externalPrimaryKey";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PRIMARY_KEY)
  private String externalPrimaryKey;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<V1Attribute> attributes = null;


  public V1DocumentContent externalPrimaryKey(String externalPrimaryKey) {
    
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


  public V1DocumentContent attributes(List<V1Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public V1DocumentContent addAttributesItem(V1Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<V1Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes associated with the document.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes associated with the document.")

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
    V1DocumentContent v1DocumentContent = (V1DocumentContent) o;
    return Objects.equals(this.externalPrimaryKey, v1DocumentContent.externalPrimaryKey) &&
        Objects.equals(this.attributes, v1DocumentContent.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalPrimaryKey, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DocumentContent {\n");
    sb.append("    externalPrimaryKey: ").append(toIndentedString(externalPrimaryKey)).append("\n");
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

