# ApiApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIAcquireDocumentVersion**](ApiApi.md#aPIAcquireDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**aPICompleteDocumentVersion**](ApiApi.md#aPICompleteDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**aPICreateDocumentVersion**](ApiApi.md#aPICreateDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.


<a name="aPIAcquireDocumentVersion"></a>
# **aPIAcquireDocumentVersion**
> V1AcquiredDocumentVersion aPIAcquireDocumentVersion(extensionId, workerName, properties)

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example
```java
// Import classes:
import com.ableai.api.ApiClient;
import com.ableai.api.ApiException;
import com.ableai.api.Configuration;
import com.ableai.api.models.*;
import com.ableai.api.sdk.ApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ableai.com");

    ApiApi apiInstance = new ApiApi(defaultClient);
    String extensionId = "extensionId_example"; // String | The unique ID of the extension.
    String workerName = "workerName_example"; // String | The name of the worker that will process the task.
    V1AcquireDocumentVersionRequestProperties properties = new V1AcquireDocumentVersionRequestProperties(); // V1AcquireDocumentVersionRequestProperties | 
    try {
      V1AcquiredDocumentVersion result = apiInstance.aPIAcquireDocumentVersion(extensionId, workerName, properties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPIAcquireDocumentVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **String**| The unique ID of the extension. |
 **workerName** | **String**| The name of the worker that will process the task. |
 **properties** | [**V1AcquireDocumentVersionRequestProperties**](V1AcquireDocumentVersionRequestProperties.md)|  |

### Return type

[**V1AcquiredDocumentVersion**](V1AcquiredDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="aPICompleteDocumentVersion"></a>
# **aPICompleteDocumentVersion**
> V1CompletedDocumentVersion aPICompleteDocumentVersion(extensionId, workerName, documentVersionId, properties)

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example
```java
// Import classes:
import com.ableai.api.ApiClient;
import com.ableai.api.ApiException;
import com.ableai.api.Configuration;
import com.ableai.api.models.*;
import com.ableai.api.sdk.ApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ableai.com");

    ApiApi apiInstance = new ApiApi(defaultClient);
    String extensionId = "extensionId_example"; // String | The unique ID of the extension.
    String workerName = "workerName_example"; // String | The name of the worker that processed the task.
    String documentVersionId = "documentVersionId_example"; // String | The ID of the document version that was processed.
    V1CompleteDocumentVersionRequestProperties properties = new V1CompleteDocumentVersionRequestProperties(); // V1CompleteDocumentVersionRequestProperties | 
    try {
      V1CompletedDocumentVersion result = apiInstance.aPICompleteDocumentVersion(extensionId, workerName, documentVersionId, properties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPICompleteDocumentVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **String**| The unique ID of the extension. |
 **workerName** | **String**| The name of the worker that processed the task. |
 **documentVersionId** | **String**| The ID of the document version that was processed. |
 **properties** | [**V1CompleteDocumentVersionRequestProperties**](V1CompleteDocumentVersionRequestProperties.md)|  |

### Return type

[**V1CompletedDocumentVersion**](V1CompletedDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="aPICreateDocumentVersion"></a>
# **aPICreateDocumentVersion**
> V1DocumentVersion aPICreateDocumentVersion(extensionId, body)

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

### Example
```java
// Import classes:
import com.ableai.api.ApiClient;
import com.ableai.api.ApiException;
import com.ableai.api.Configuration;
import com.ableai.api.models.*;
import com.ableai.api.sdk.ApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ableai.com");

    ApiApi apiInstance = new ApiApi(defaultClient);
    String extensionId = "extensionId_example"; // String | The unique ID of the extension.
    InlineObject body = new InlineObject(); // InlineObject | 
    try {
      V1DocumentVersion result = apiInstance.aPICreateDocumentVersion(extensionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPICreateDocumentVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **String**| The unique ID of the extension. |
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**V1DocumentVersion**](V1DocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

