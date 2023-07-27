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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AcquireDocumentContentRequestV1Body
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V1AcquireDocumentContentRequestV1Body {
  public static final String SERIALIZED_NAME_EXPECTED_EXECUTION_DURATION = "expectedExecutionDuration";
  @SerializedName(SERIALIZED_NAME_EXPECTED_EXECUTION_DURATION)
  private String expectedExecutionDuration;


  public V1AcquireDocumentContentRequestV1Body expectedExecutionDuration(String expectedExecutionDuration) {
    
    this.expectedExecutionDuration = expectedExecutionDuration;
    return this;
  }

   /**
   * The expected amount of time for task execution.
   * @return expectedExecutionDuration
  **/
  @ApiModelProperty(required = true, value = "The expected amount of time for task execution.")

  public String getExpectedExecutionDuration() {
    return expectedExecutionDuration;
  }


  public void setExpectedExecutionDuration(String expectedExecutionDuration) {
    this.expectedExecutionDuration = expectedExecutionDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AcquireDocumentContentRequestV1Body v1AcquireDocumentContentRequestV1Body = (V1AcquireDocumentContentRequestV1Body) o;
    return Objects.equals(this.expectedExecutionDuration, v1AcquireDocumentContentRequestV1Body.expectedExecutionDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedExecutionDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AcquireDocumentContentRequestV1Body {\n");
    sb.append("    expectedExecutionDuration: ").append(toIndentedString(expectedExecutionDuration)).append("\n");
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

