# V1AcquiredDocumentContentV1

Represents a DocumentContent that has been acquired for processing.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_content_id** | **str** | The ID of the document content. | [optional] 
**external_primary_key** | **str** | The primary key of the document in the external system. | [optional] 
**direction** | [**V1DataTransferDirectionV1**](V1DataTransferDirectionV1.md) |  | [optional] 
**upload_url** | **str** | The upload URL for the document file in GCS. | [optional] 
**raw_file_url** | **str** | The download URL for the raw document file in GCS. | [optional] 
**standardized_pdf_url** | **str** | The download URL for the standardized PDF file in GCS. | [optional] 
**content_url** | **str** | The download URL for the content file in GCS. | [optional] 
**acquired_by** | **str** | The name of the worker that acquired the document content. | [optional] 
**acquired_time** | **datetime** | The timestamp when the document content was acquired. | [optional] 
**next_retry_time** | **datetime** | The expected time of task compleation. If not completed before this time, the task will be retried. | [optional] 
**task_type** | **str** |  | [optional] 
**attributes** | [**[V1Attribute]**](V1Attribute.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


