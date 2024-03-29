# # V1AcquiredDocumentContentV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_content_id** | **string** | The ID of the document content. | [optional]
**external_primary_key** | **string** | The primary key of the document in the external system. | [optional]
**direction** | [**\OpenAPI\Client\Model\V1DataTransferDirectionV1**](V1DataTransferDirectionV1.md) |  | [optional]
**upload_url** | **string** | The upload URL for the document file in GCS. | [optional]
**raw_file_url** | **string** | The download URL for the raw document file in GCS. | [optional]
**standardized_pdf_url** | **string** | The download URL for the standardized PDF file in GCS. | [optional]
**content_url** | **string** | The download URL for the content file in GCS. | [optional]
**acquired_by** | **string** | The name of the worker that acquired the document content. | [optional]
**acquired_time** | [**\DateTime**](\DateTime.md) | The timestamp when the document content was acquired. | [optional]
**next_retry_time** | [**\DateTime**](\DateTime.md) | The expected time of task compleation. If not completed before this time, the task will be retried. | [optional]
**task_type** | **string** |  | [optional]
**attributes** | [**\OpenAPI\Client\Model\V1Attribute[]**](V1Attribute.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
