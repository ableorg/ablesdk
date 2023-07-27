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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Direction of data transfer.   - TO_ABLE: Data is transfered from an external source to Able.  - TO_EXTERNAL: Data is transfered from Able to an external source.
 */
@JsonAdapter(V1DataTransferDirectionV1.Adapter.class)
public enum V1DataTransferDirectionV1 {
  
  DATA_TRANSFER_DIRECTION_UNSPECIFIED("DATA_TRANSFER_DIRECTION_UNSPECIFIED"),
  
  TO_ABLE("TO_ABLE"),
  
  TO_EXTERNAL("TO_EXTERNAL");

  private String value;

  V1DataTransferDirectionV1(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V1DataTransferDirectionV1 fromValue(String value) {
    for (V1DataTransferDirectionV1 b : V1DataTransferDirectionV1.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<V1DataTransferDirectionV1> {
    @Override
    public void write(final JsonWriter jsonWriter, final V1DataTransferDirectionV1 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public V1DataTransferDirectionV1 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return V1DataTransferDirectionV1.fromValue(value);
    }
  }
}

