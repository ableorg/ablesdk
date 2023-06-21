/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230621235520
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ableai.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.ableai.api.sdk.model.V1Document;
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
 * Request to create a new DocumentVersion.
 */
@ApiModel(description = "Request to create a new DocumentVersion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject {
  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<V1Document> documents = null;


  public InlineObject documents(List<V1Document> documents) {
    
    this.documents = documents;
    return this;
  }

  public InlineObject addDocumentsItem(V1Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<V1Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * A list of documents to be added to the DocumentVersion.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of documents to be added to the DocumentVersion.")

  public List<V1Document> getDocuments() {
    return documents;
  }


  public void setDocuments(List<V1Document> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.documents, inlineObject.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

