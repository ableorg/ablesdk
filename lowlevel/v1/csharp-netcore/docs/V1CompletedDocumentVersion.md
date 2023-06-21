# Able.Sdk.Model.V1CompletedDocumentVersion
Represents a DocumentVersion that has been completed after processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentVersionId** | **string** | The ID of the document version. | [optional] 
**Status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [optional] 
**LastError** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**AcquiredBy** | **string** | The name of the worker that acquired the document version. | [optional] 
**AcquiredTime** | **DateTime** | The timestamp when the document version was acquired. | [optional] 
**CompletedBy** | **string** | The name of the worker that completed the document version. | [optional] 
**CompletedTime** | **DateTime** | The timestamp when the document version was completed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

