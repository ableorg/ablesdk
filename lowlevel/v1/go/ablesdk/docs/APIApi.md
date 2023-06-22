# \APIApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIAcquireDocumentContentV1**](APIApi.md#APIAcquireDocumentContentV1) | **Put** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**APICompleteDocumentContentV1**](APIApi.md#APICompleteDocumentContentV1) | **Put** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**APICreateDocumentContentV1**](APIApi.md#APICreateDocumentContentV1) | **Put** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.



## APIAcquireDocumentContentV1

> V1AcquiredDocumentContentV1 APIAcquireDocumentContentV1(ctx, extensionId, workerName).Body(body).Execute()

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

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
    body := *openapiclient.NewV1AcquireDocumentContentRequestV1Body("ExpectedExecutionDuration_example") // V1AcquireDocumentContentRequestV1Body | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.APIApi.APIAcquireDocumentContentV1(context.Background(), extensionId, workerName).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APIAcquireDocumentContentV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APIAcquireDocumentContentV1`: V1AcquiredDocumentContentV1
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APIAcquireDocumentContentV1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 
**workerName** | **string** | The name of the worker that will process the task. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPIAcquireDocumentContentV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **body** | [**V1AcquireDocumentContentRequestV1Body**](V1AcquireDocumentContentRequestV1Body.md) |  | 

### Return type

[**V1AcquiredDocumentContentV1**](v1AcquiredDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## APICompleteDocumentContentV1

> V1CompletedDocumentContentV1 APICompleteDocumentContentV1(ctx, extensionId, workerName, documentContentId).Body(body).Execute()

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

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
    documentContentId := "documentContentId_example" // string | The ID of the document content that was processed.
    body := *openapiclient.NewV1CompleteDocumentContentRequestV1Body(openapiclient.v1DocumentContentStatusV1("DOCUMENT_CONTENT_STATUS_UNSPECIFIED")) // V1CompleteDocumentContentRequestV1Body | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.APIApi.APICompleteDocumentContentV1(context.Background(), extensionId, workerName, documentContentId).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APICompleteDocumentContentV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APICompleteDocumentContentV1`: V1CompletedDocumentContentV1
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APICompleteDocumentContentV1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 
**workerName** | **string** | The name of the worker that processed the task. | 
**documentContentId** | **string** | The ID of the document content that was processed. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPICompleteDocumentContentV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **body** | [**V1CompleteDocumentContentRequestV1Body**](V1CompleteDocumentContentRequestV1Body.md) |  | 

### Return type

[**V1CompletedDocumentContentV1**](v1CompletedDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## APICreateDocumentContentV1

> V1DocumentContent APICreateDocumentContentV1(ctx, extensionId).Body(body).Execute()

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

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
    resp, r, err := api_client.APIApi.APICreateDocumentContentV1(context.Background(), extensionId).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `APIApi.APICreateDocumentContentV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `APICreateDocumentContentV1`: V1DocumentContent
    fmt.Fprintf(os.Stdout, "Response from `APIApi.APICreateDocumentContentV1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**extensionId** | **string** | The unique ID of the extension. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAPICreateDocumentContentV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **body** | [**InlineObject**](InlineObject.md) |  | 

### Return type

[**V1DocumentContent**](v1DocumentContent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

