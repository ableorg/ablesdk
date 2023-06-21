

# V1CompletedDocumentVersion

Represents a DocumentVersion that has been completed after processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentVersionId** | **String** | The ID of the document version. |  [optional]
**status** | **V1DocumentVersionStatus** |  |  [optional]
**lastError** | **String** | Any error message generated during processing, empty if status is COMPLETE. |  [optional]
**acquiredBy** | **String** | The name of the worker that acquired the document version. |  [optional]
**acquiredTime** | **OffsetDateTime** | The timestamp when the document version was acquired. |  [optional]
**completedBy** | **String** | The name of the worker that completed the document version. |  [optional]
**completedTime** | **OffsetDateTime** | The timestamp when the document version was completed. |  [optional]



