# ApiApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIAcquireDocumentContentV1**](ApiApi.md#aPIAcquireDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**aPICompleteDocumentContentV1**](ApiApi.md#aPICompleteDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**aPICreateDocumentContentV1**](ApiApi.md#aPICreateDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.


<a name="aPIAcquireDocumentContentV1"></a>
# **aPIAcquireDocumentContentV1**
> V1AcquiredDocumentContentV1 aPIAcquireDocumentContentV1(extensionId, workerName, body)

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

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
    V1AcquireDocumentContentRequestV1Body body = new V1AcquireDocumentContentRequestV1Body(); // V1AcquireDocumentContentRequestV1Body | 
    try {
      V1AcquiredDocumentContentV1 result = apiInstance.aPIAcquireDocumentContentV1(extensionId, workerName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPIAcquireDocumentContentV1");
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
 **body** | [**V1AcquireDocumentContentRequestV1Body**](V1AcquireDocumentContentRequestV1Body.md)|  |

### Return type

[**V1AcquiredDocumentContentV1**](V1AcquiredDocumentContentV1.md)

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

<a name="aPICompleteDocumentContentV1"></a>
# **aPICompleteDocumentContentV1**
> V1CompletedDocumentContentV1 aPICompleteDocumentContentV1(extensionId, workerName, documentContentId, body)

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

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
    String documentContentId = "documentContentId_example"; // String | The ID of the document content that was processed.
    V1CompleteDocumentContentRequestV1Body body = new V1CompleteDocumentContentRequestV1Body(); // V1CompleteDocumentContentRequestV1Body | 
    try {
      V1CompletedDocumentContentV1 result = apiInstance.aPICompleteDocumentContentV1(extensionId, workerName, documentContentId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPICompleteDocumentContentV1");
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
 **documentContentId** | **String**| The ID of the document content that was processed. |
 **body** | [**V1CompleteDocumentContentRequestV1Body**](V1CompleteDocumentContentRequestV1Body.md)|  |

### Return type

[**V1CompletedDocumentContentV1**](V1CompletedDocumentContentV1.md)

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

<a name="aPICreateDocumentContentV1"></a>
# **aPICreateDocumentContentV1**
> V1DocumentContent aPICreateDocumentContentV1(extensionId, body)

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

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
    V1CreateDocumentContentRequestV1Body body = new V1CreateDocumentContentRequestV1Body(); // V1CreateDocumentContentRequestV1Body | 
    try {
      V1DocumentContent result = apiInstance.aPICreateDocumentContentV1(extensionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#aPICreateDocumentContentV1");
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
 **body** | [**V1CreateDocumentContentRequestV1Body**](V1CreateDocumentContentRequestV1Body.md)|  |

### Return type

[**V1DocumentContent**](V1DocumentContent.md)

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

