# Able.Sdk.Model.V1CompletedDocumentContentV1
Represents a DocumentContent that has been completed after processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentContentId** | **string** | The ID of the document content. | [optional] 
**Status** | [**V1DocumentContentStatusV1**](V1DocumentContentStatusV1.md) |  | [optional] 
**LastError** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**AcquiredBy** | **string** | The name of the worker that acquired the document content. | [optional] 
**AcquiredTime** | **DateTime** | The timestamp when the document content was acquired. | [optional] 
**CompletedBy** | **string** | The name of the worker that completed the document content. | [optional] 
**CompletedTime** | **DateTime** | The timestamp when the document content was completed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

