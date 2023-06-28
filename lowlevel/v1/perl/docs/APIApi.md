# AbleSDK::APIApi

## Load the API package
```perl
use AbleSDK::Object::APIApi;
```

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**a_pi_acquire_document_content_v1**](APIApi.md#a_pi_acquire_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**a_pi_complete_document_content_v1**](APIApi.md#a_pi_complete_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**a_pi_create_document_content_v1**](APIApi.md#a_pi_create_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.


# **a_pi_acquire_document_content_v1**
> V1AcquiredDocumentContentV1 a_pi_acquire_document_content_v1(extension_id => $extension_id, worker_name => $worker_name, body => $body)

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $worker_name = "worker_name_example"; # string | The name of the worker that will process the task.
my $body = AbleSDK::Object::V1AcquireDocumentContentRequestV1Body->new(); # V1AcquireDocumentContentRequestV1Body | 

eval { 
    my $result = $api_instance->a_pi_acquire_document_content_v1(extension_id => $extension_id, worker_name => $worker_name, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_acquire_document_content_v1: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **worker_name** | **string**| The name of the worker that will process the task. | 
 **body** | [**V1AcquireDocumentContentRequestV1Body**](V1AcquireDocumentContentRequestV1Body.md)|  | 

### Return type

[**V1AcquiredDocumentContentV1**](V1AcquiredDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_complete_document_content_v1**
> V1CompletedDocumentContentV1 a_pi_complete_document_content_v1(extension_id => $extension_id, worker_name => $worker_name, document_content_id => $document_content_id, body => $body)

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $worker_name = "worker_name_example"; # string | The name of the worker that processed the task.
my $document_content_id = "document_content_id_example"; # string | The ID of the document content that was processed.
my $body = AbleSDK::Object::V1CompleteDocumentContentRequestV1Body->new(); # V1CompleteDocumentContentRequestV1Body | 

eval { 
    my $result = $api_instance->a_pi_complete_document_content_v1(extension_id => $extension_id, worker_name => $worker_name, document_content_id => $document_content_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_complete_document_content_v1: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **worker_name** | **string**| The name of the worker that processed the task. | 
 **document_content_id** | **string**| The ID of the document content that was processed. | 
 **body** | [**V1CompleteDocumentContentRequestV1Body**](V1CompleteDocumentContentRequestV1Body.md)|  | 

### Return type

[**V1CompletedDocumentContentV1**](V1CompletedDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_create_document_content_v1**
> V1DocumentContent a_pi_create_document_content_v1(extension_id => $extension_id, body => $body)

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $body = AbleSDK::Object::V1CreateDocumentContentRequestV1Body->new(); # V1CreateDocumentContentRequestV1Body | 

eval { 
    my $result = $api_instance->a_pi_create_document_content_v1(extension_id => $extension_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_create_document_content_v1: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **body** | [**V1CreateDocumentContentRequestV1Body**](V1CreateDocumentContentRequestV1Body.md)|  | 

### Return type

[**V1DocumentContent**](V1DocumentContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

