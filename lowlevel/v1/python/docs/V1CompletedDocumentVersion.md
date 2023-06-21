# V1CompletedDocumentVersion

Represents a DocumentVersion that has been completed after processing.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_version_id** | **str** | The ID of the document version. | [optional] 
**status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [optional] 
**last_error** | **str** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**acquired_by** | **str** | The name of the worker that acquired the document version. | [optional] 
**acquired_time** | **datetime** | The timestamp when the document version was acquired. | [optional] 
**completed_by** | **str** | The name of the worker that completed the document version. | [optional] 
**completed_time** | **datetime** | The timestamp when the document version was completed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


