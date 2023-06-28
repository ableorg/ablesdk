# Able.Sdk.Api.APIApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIAcquireDocumentContentV1**](APIApi.md#apiacquiredocumentcontentv1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**APICompleteDocumentContentV1**](APIApi.md#apicompletedocumentcontentv1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**APICreateDocumentContentV1**](APIApi.md#apicreatedocumentcontentv1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.


<a name="apiacquiredocumentcontentv1"></a>
# **APIAcquireDocumentContentV1**
> V1AcquiredDocumentContentV1 APIAcquireDocumentContentV1 (string extensionId, string workerName, V1AcquireDocumentContentRequestV1Body body)

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APIAcquireDocumentContentV1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var workerName = workerName_example;  // string | The name of the worker that will process the task.
            var body = new V1AcquireDocumentContentRequestV1Body(); // V1AcquireDocumentContentRequestV1Body | 

            try
            {
                // Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
                V1AcquiredDocumentContentV1 result = apiInstance.APIAcquireDocumentContentV1(extensionId, workerName, body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APIAcquireDocumentContentV1: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **string**| The unique ID of the extension. | 
 **workerName** | **string**| The name of the worker that will process the task. | 
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="apicompletedocumentcontentv1"></a>
# **APICompleteDocumentContentV1**
> V1CompletedDocumentContentV1 APICompleteDocumentContentV1 (string extensionId, string workerName, string documentContentId, V1CompleteDocumentContentRequestV1Body body)

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APICompleteDocumentContentV1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var workerName = workerName_example;  // string | The name of the worker that processed the task.
            var documentContentId = documentContentId_example;  // string | The ID of the document content that was processed.
            var body = new V1CompleteDocumentContentRequestV1Body(); // V1CompleteDocumentContentRequestV1Body | 

            try
            {
                // Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
                V1CompletedDocumentContentV1 result = apiInstance.APICompleteDocumentContentV1(extensionId, workerName, documentContentId, body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APICompleteDocumentContentV1: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **string**| The unique ID of the extension. | 
 **workerName** | **string**| The name of the worker that processed the task. | 
 **documentContentId** | **string**| The ID of the document content that was processed. | 
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="apicreatedocumentcontentv1"></a>
# **APICreateDocumentContentV1**
> V1DocumentContent APICreateDocumentContentV1 (string extensionId, V1CreateDocumentContentRequestV1Body body)

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APICreateDocumentContentV1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var body = new V1CreateDocumentContentRequestV1Body(); // V1CreateDocumentContentRequestV1Body | 

            try
            {
                // Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
                V1DocumentContent result = apiInstance.APICreateDocumentContentV1(extensionId, body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APICreateDocumentContentV1: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **string**| The unique ID of the extension. | 
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

