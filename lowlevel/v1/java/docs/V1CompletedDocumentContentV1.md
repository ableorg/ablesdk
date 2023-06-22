

# V1CompletedDocumentContentV1

Represents a DocumentContent that has been completed after processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentContentId** | **String** | The ID of the document content. |  [optional]
**status** | **V1DocumentContentStatusV1** |  |  [optional]
**lastError** | **String** | Any error message generated during processing, empty if status is COMPLETE. |  [optional]
**acquiredBy** | **String** | The name of the worker that acquired the document content. |  [optional]
**acquiredTime** | **OffsetDateTime** | The timestamp when the document content was acquired. |  [optional]
**completedBy** | **String** | The name of the worker that completed the document content. |  [optional]
**completedTime** | **OffsetDateTime** | The timestamp when the document content was completed. |  [optional]



