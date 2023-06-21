# # V1CompletedDocumentVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_version_id** | **string** | The ID of the document version. | [optional]
**status** | [**\OpenAPI\Client\Model\V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [optional]
**last_error** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional]
**acquired_by** | **string** | The name of the worker that acquired the document version. | [optional]
**acquired_time** | [**\DateTime**](\DateTime.md) | The timestamp when the document version was acquired. | [optional]
**completed_by** | **string** | The name of the worker that completed the document version. | [optional]
**completed_time** | [**\DateTime**](\DateTime.md) | The timestamp when the document version was completed. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
