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
 * V1CreateDocumentContentRequestV1Body
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V1CreateDocumentContentRequestV1Body {
  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<V1Document> documents = null;


  public V1CreateDocumentContentRequestV1Body documents(List<V1Document> documents) {
    
    this.documents = documents;
    return this;
  }

  public V1CreateDocumentContentRequestV1Body addDocumentsItem(V1Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<V1Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * A list of documents to be added to the DocumentContent.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of documents to be added to the DocumentContent.")

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
    V1CreateDocumentContentRequestV1Body v1CreateDocumentContentRequestV1Body = (V1CreateDocumentContentRequestV1Body) o;
    return Objects.equals(this.documents, v1CreateDocumentContentRequestV1Body.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CreateDocumentContentRequestV1Body {\n");
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

