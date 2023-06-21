# \APIApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIAcquireDocumentVersion**](APIApi.md#APIAcquireDocumentVersion) | **Put** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**APICompleteDocumentVersion**](APIApi.md#APICompleteDocumentVersion) | **Put** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**APICreateDocumentVersion**](APIApi.md#APICreateDocumentVersion) | **Put** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.



## APIAcquireDocumentVersion

> V1AcquiredDocumentVersion APIAcquireDocumentVersion(ctx, extensionId, workerName).Properties(properties).Execute()

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    extensionId := "extensionId_example" // string | The unique ID of the extension.
    workerName := "workerName_example" // string | The name of the worker that will process the task.
    properties := *openapiclient.NewV1AcquireDocumentVersionRequestProperties("ExpectedExecutionDuration_example") // V1AcquireDocumentVersionRequestProperties | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.APIApi.APIAcquireDocumentVersion(context.Background(), extensionId, workerName).Properties(properties).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APIAcquireDocumentVersion``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APIAcquireDocumentVersion`: V1AcquiredDocumentVersion
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APIAcquireDocumentVersion`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 
**workerName** | **string** | The name of the worker that will process the task. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPIAcquireDocumentVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **properties** | [**V1AcquireDocumentVersionRequestProperties**](V1AcquireDocumentVersionRequestProperties.md) |  | 

### Return type

[**V1AcquiredDocumentVersion**](v1AcquiredDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## APICompleteDocumentVersion

> V1CompletedDocumentVersion APICompleteDocumentVersion(ctx, extensionId, workerName, documentVersionId).Properties(properties).Execute()

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    extensionId := "extensionId_example" // string | The unique ID of the extension.
    workerName := "workerName_example" // string | The name of the worker that processed the task.
    documentVersionId := "documentVersionId_example" // string | The ID of the document version that was processed.
    properties := *openapiclient.NewV1CompleteDocumentVersionRequestProperties(openapiclient.v1DocumentVersionStatus("DOCUMENT_VERSION_STATUS_UNSPECIFIED")) // V1CompleteDocumentVersionRequestProperties | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.APIApi.APICompleteDocumentVersion(context.Background(), extensionId, workerName, documentVersionId).Properties(properties).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APICompleteDocumentVersion``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APICompleteDocumentVersion`: V1CompletedDocumentVersion
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APICompleteDocumentVersion`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 
**workerName** | **string** | The name of the worker that processed the task. | 
**documentVersionId** | **string** | The ID of the document version that was processed. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPICompleteDocumentVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **properties** | [**V1CompleteDocumentVersionRequestProperties**](V1CompleteDocumentVersionRequestProperties.md) |  | 

### Return type

[**V1CompletedDocumentVersion**](v1CompletedDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## APICreateDocumentVersion

> V1DocumentVersion APICreateDocumentVersion(ctx, extensionId).Body(body).Execute()

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    extensionId := "extensionId_example" // string | The unique ID of the extension.
    body := *openapiclient.NewInlineObject() // InlineObject | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.APIApi.APICreateDocumentVersion(context.Background(), extensionId).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APICreateDocumentVersion``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APICreateDocumentVersion`: V1DocumentVersion
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APICreateDocumentVersion`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPICreateDocumentVersionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **body** | [**InlineObject**](InlineObject.md) |  | 

### Return type

[**V1DocumentVersion**](v1DocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

