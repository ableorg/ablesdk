# AbleSDK::APIApi

## Load the API package
```perl
use AbleSDK::Object::APIApi;
```

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**a_pi_acquire_document_version**](APIApi.md#a_pi_acquire_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**a_pi_complete_document_version**](APIApi.md#a_pi_complete_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**a_pi_create_document_version**](APIApi.md#a_pi_create_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.


# **a_pi_acquire_document_version**
> V1AcquiredDocumentVersion a_pi_acquire_document_version(extension_id => $extension_id, worker_name => $worker_name, properties => $properties)

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $worker_name = "worker_name_example"; # string | The name of the worker that will process the task.
my $properties = AbleSDK::Object::V1AcquireDocumentVersionRequestProperties->new(); # V1AcquireDocumentVersionRequestProperties | 

eval { 
    my $result = $api_instance->a_pi_acquire_document_version(extension_id => $extension_id, worker_name => $worker_name, properties => $properties);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_acquire_document_version: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **worker_name** | **string**| The name of the worker that will process the task. | 
 **properties** | [**V1AcquireDocumentVersionRequestProperties**](V1AcquireDocumentVersionRequestProperties.md)|  | 

### Return type

[**V1AcquiredDocumentVersion**](V1AcquiredDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_complete_document_version**
> V1CompletedDocumentVersion a_pi_complete_document_version(extension_id => $extension_id, worker_name => $worker_name, document_version_id => $document_version_id, properties => $properties)

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $worker_name = "worker_name_example"; # string | The name of the worker that processed the task.
my $document_version_id = "document_version_id_example"; # string | The ID of the document version that was processed.
my $properties = AbleSDK::Object::V1CompleteDocumentVersionRequestProperties->new(); # V1CompleteDocumentVersionRequestProperties | 

eval { 
    my $result = $api_instance->a_pi_complete_document_version(extension_id => $extension_id, worker_name => $worker_name, document_version_id => $document_version_id, properties => $properties);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_complete_document_version: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **worker_name** | **string**| The name of the worker that processed the task. | 
 **document_version_id** | **string**| The ID of the document version that was processed. | 
 **properties** | [**V1CompleteDocumentVersionRequestProperties**](V1CompleteDocumentVersionRequestProperties.md)|  | 

### Return type

[**V1CompletedDocumentVersion**](V1CompletedDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_create_document_version**
> V1DocumentVersion a_pi_create_document_version(extension_id => $extension_id, body => $body)

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

### Example 
```perl
use Data::Dumper;
use AbleSDK::APIApi;
my $api_instance = AbleSDK::APIApi->new(
);

my $extension_id = "extension_id_example"; # string | The unique ID of the extension.
my $body = AbleSDK::Object::InlineObject->new(); # InlineObject | 

eval { 
    my $result = $api_instance->a_pi_create_document_version(extension_id => $extension_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling APIApi->a_pi_create_document_version: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. | 
 **body** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**V1DocumentVersion**](V1DocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

