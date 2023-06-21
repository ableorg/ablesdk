

# V1AcquiredDocumentVersion

Represents a DocumentVersion that has been acquired for processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentVersionId** | **String** | The ID of the document version. |  [optional]
**externalPrimaryKey** | **String** | The primary key of the document in the external system. |  [optional]
**direction** | **V1DataTransferDirection** |  |  [optional]
**uploadUrl** | **String** | The upload URL for the document file in GCS. |  [optional]
**rawFileUrl** | **String** | The download URL for the raw document file in GCS. |  [optional]
**standardizedPdfUrl** | **String** | The download URL for the standardized PDF file in GCS. |  [optional]
**contentUrl** | **String** | The download URL for the content file in GCS. |  [optional]
**acquiredBy** | **String** | The name of the worker that acquired the document version. |  [optional]
**acquiredTime** | **OffsetDateTime** | The timestamp when the document version was acquired. |  [optional]
**acquiredDuration** | **String** | The expected amount of time for task execution. |  [optional]



