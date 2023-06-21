# V1AcquiredDocumentVersion

Represents a DocumentVersion that has been acquired for processing.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_version_id** | **str** | The ID of the document version. | [optional] 
**external_primary_key** | **str** | The primary key of the document in the external system. | [optional] 
**direction** | [**V1DataTransferDirection**](V1DataTransferDirection.md) |  | [optional] 
**upload_url** | **str** | The upload URL for the document file in GCS. | [optional] 
**raw_file_url** | **str** | The download URL for the raw document file in GCS. | [optional] 
**standardized_pdf_url** | **str** | The download URL for the standardized PDF file in GCS. | [optional] 
**content_url** | **str** | The download URL for the content file in GCS. | [optional] 
**acquired_by** | **str** | The name of the worker that acquired the document version. | [optional] 
**acquired_time** | **datetime** | The timestamp when the document version was acquired. | [optional] 
**acquired_duration** | **str** | The expected amount of time for task execution. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


