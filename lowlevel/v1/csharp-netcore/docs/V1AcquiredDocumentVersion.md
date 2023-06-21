# Able.Sdk.Model.V1AcquiredDocumentVersion
Represents a DocumentVersion that has been acquired for processing.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentVersionId** | **string** | The ID of the document version. | [optional] 
**ExternalPrimaryKey** | **string** | The primary key of the document in the external system. | [optional] 
**Direction** | [**V1DataTransferDirection**](V1DataTransferDirection.md) |  | [optional] 
**UploadUrl** | **string** | The upload URL for the document file in GCS. | [optional] 
**RawFileUrl** | **string** | The download URL for the raw document file in GCS. | [optional] 
**StandardizedPdfUrl** | **string** | The download URL for the standardized PDF file in GCS. | [optional] 
**ContentUrl** | **string** | The download URL for the content file in GCS. | [optional] 
**AcquiredBy** | **string** | The name of the worker that acquired the document version. | [optional] 
**AcquiredTime** | **DateTime** | The timestamp when the document version was acquired. | [optional] 
**AcquiredDuration** | **string** | The expected amount of time for task execution. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

