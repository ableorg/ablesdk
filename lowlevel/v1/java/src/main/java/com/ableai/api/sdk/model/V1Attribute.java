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
import com.ableai.api.sdk.model.V1AttributeTypeV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents an attribute of document content.
 */
@ApiModel(description = "Represents an attribute of document content.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V1Attribute {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private V1AttributeTypeV1 type = V1AttributeTypeV1.ATTRIBUTE_TYPE_UNSPECIFIED;


  public V1Attribute key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the attribute.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the attribute.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1Attribute value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the attribute.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the attribute.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public V1Attribute type(V1AttributeTypeV1 type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public V1AttributeTypeV1 getType() {
    return type;
  }


  public void setType(V1AttributeTypeV1 type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Attribute v1Attribute = (V1Attribute) o;
    return Objects.equals(this.key, v1Attribute.key) &&
        Objects.equals(this.value, v1Attribute.value) &&
        Objects.equals(this.type, v1Attribute.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Attribute {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

