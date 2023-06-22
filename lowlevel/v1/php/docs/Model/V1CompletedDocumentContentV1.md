# # V1CompletedDocumentContentV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_content_id** | **string** | The ID of the document content. | [optional]
**status** | [**\OpenAPI\Client\Model\V1DocumentContentStatusV1**](V1DocumentContentStatusV1.md) |  | [optional]
**last_error** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional]
**acquired_by** | **string** | The name of the worker that acquired the document content. | [optional]
**acquired_time** | [**\DateTime**](\DateTime.md) | The timestamp when the document content was acquired. | [optional]
**completed_by** | **string** | The name of the worker that completed the document content. | [optional]
**completed_time** | [**\DateTime**](\DateTime.md) | The timestamp when the document content was completed. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
