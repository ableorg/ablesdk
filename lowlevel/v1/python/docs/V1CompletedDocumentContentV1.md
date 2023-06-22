# V1CompletedDocumentContentV1

Represents a DocumentContent that has been completed after processing.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_content_id** | **str** | The ID of the document content. | [optional] 
**status** | [**V1DocumentContentStatusV1**](V1DocumentContentStatusV1.md) |  | [optional] 
**last_error** | **str** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**acquired_by** | **str** | The name of the worker that acquired the document content. | [optional] 
**acquired_time** | **datetime** | The timestamp when the document content was acquired. | [optional] 
**completed_by** | **str** | The name of the worker that completed the document content. | [optional] 
**completed_time** | **datetime** | The timestamp when the document content was completed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


