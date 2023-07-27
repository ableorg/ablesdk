# Able.Sdk.Model.V1AcquiredDocumentContentV1
Represents a DocumentContent that has been acquired for processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentContentId** | **string** | The ID of the document content. | [optional] 
**ExternalPrimaryKey** | **string** | The primary key of the document in the external system. | [optional] 
**Direction** | [**V1DataTransferDirectionV1**](V1DataTransferDirectionV1.md) |  | [optional] 
**UploadUrl** | **string** | The upload URL for the document file in GCS. | [optional] 
**RawFileUrl** | **string** | The download URL for the raw document file in GCS. | [optional] 
**StandardizedPdfUrl** | **string** | The download URL for the standardized PDF file in GCS. | [optional] 
**ContentUrl** | **string** | The download URL for the content file in GCS. | [optional] 
**AcquiredBy** | **string** | The name of the worker that acquired the document content. | [optional] 
**AcquiredTime** | **DateTime** | The timestamp when the document content was acquired. | [optional] 
**NextRetryTime** | **DateTime** | The expected time of task compleation. If not completed before this time, the task will be retried. | [optional] 
**TaskType** | **string** |  | [optional] 
**Attributes** | [**List&lt;V1Attribute&gt;**](V1Attribute.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

