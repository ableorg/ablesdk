

# V1AcquiredDocumentContentV1

Represents a DocumentContent that has been acquired for processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentContentId** | **String** | The ID of the document content. |  [optional]
**externalPrimaryKey** | **String** | The primary key of the document in the external system. |  [optional]
**direction** | **V1DataTransferDirectionV1** |  |  [optional]
**uploadUrl** | **String** | The upload URL for the document file in GCS. |  [optional]
**rawFileUrl** | **String** | The download URL for the raw document file in GCS. |  [optional]
**standardizedPdfUrl** | **String** | The download URL for the standardized PDF file in GCS. |  [optional]
**contentUrl** | **String** | The download URL for the content file in GCS. |  [optional]
**acquiredBy** | **String** | The name of the worker that acquired the document content. |  [optional]
**acquiredTime** | **OffsetDateTime** | The timestamp when the document content was acquired. |  [optional]
**nextRetryTime** | **OffsetDateTime** | The expected time of task compleation. If not completed before this time, the task will be retried. |  [optional]



