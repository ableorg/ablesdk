# Able.Sdk.Api.APIApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIAcquireDocumentVersion**](APIApi.md#apiacquiredocumentversion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**APICompleteDocumentVersion**](APIApi.md#apicompletedocumentversion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**APICreateDocumentVersion**](APIApi.md#apicreatedocumentversion) | **PUT** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.


<a name="apiacquiredocumentversion"></a>
# **APIAcquireDocumentVersion**
> V1AcquiredDocumentVersion APIAcquireDocumentVersion (string extensionId, string workerName, V1AcquireDocumentVersionRequestProperties properties)

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APIAcquireDocumentVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var workerName = workerName_example;  // string | The name of the worker that will process the task.
            var properties = new V1AcquireDocumentVersionRequestProperties(); // V1AcquireDocumentVersionRequestProperties | 

            try
            {
                // Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
                V1AcquiredDocumentVersion result = apiInstance.APIAcquireDocumentVersion(extensionId, workerName, properties);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APIAcquireDocumentVersion: " + e.Message );
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="apicompletedocumentversion"></a>
# **APICompleteDocumentVersion**
> V1CompletedDocumentVersion APICompleteDocumentVersion (string extensionId, string workerName, string documentVersionId, V1CompleteDocumentVersionRequestProperties properties)

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APICompleteDocumentVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var workerName = workerName_example;  // string | The name of the worker that processed the task.
            var documentVersionId = documentVersionId_example;  // string | The ID of the document version that was processed.
            var properties = new V1CompleteDocumentVersionRequestProperties(); // V1CompleteDocumentVersionRequestProperties | 

            try
            {
                // Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
                V1CompletedDocumentVersion result = apiInstance.APICompleteDocumentVersion(extensionId, workerName, documentVersionId, properties);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APICompleteDocumentVersion: " + e.Message );
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
 **documentVersionId** | **string**| The ID of the document version that was processed. | 
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="apicreatedocumentversion"></a>
# **APICreateDocumentVersion**
> V1DocumentVersion APICreateDocumentVersion (string extensionId, InlineObject body)

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Able.Sdk.Api;
using Able.Sdk.Client;
using Able.Sdk.Model;

namespace Example
{
    public class APICreateDocumentVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.ableai.com";
            var apiInstance = new APIApi(config);
            var extensionId = extensionId_example;  // string | The unique ID of the extension.
            var body = new InlineObject(); // InlineObject | 

            try
            {
                // Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.
                V1DocumentVersion result = apiInstance.APICreateDocumentVersion(extensionId, body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling APIApi.APICreateDocumentVersion: " + e.Message );
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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

