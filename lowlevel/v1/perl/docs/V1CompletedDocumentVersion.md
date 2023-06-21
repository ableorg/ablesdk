# AbleSDK::Object::V1CompletedDocumentVersion

## Load the model package
```perl
use AbleSDK::Object::V1CompletedDocumentVersion;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_version_id** | **string** | The ID of the document version. | [optional] 
**status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [optional] 
**last_error** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**acquired_by** | **string** | The name of the worker that acquired the document version. | [optional] 
**acquired_time** | **DateTime** | The timestamp when the document version was acquired. | [optional] 
**completed_by** | **string** | The name of the worker that completed the document version. | [optional] 
**completed_time** | **DateTime** | The timestamp when the document version was completed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


