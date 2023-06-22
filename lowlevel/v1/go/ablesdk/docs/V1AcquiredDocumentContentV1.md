# V1AcquiredDocumentContentV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentContentId** | Pointer to **string** | The ID of the document content. | [optional] 
**ExternalPrimaryKey** | Pointer to **string** | The primary key of the document in the external system. | [optional] 
**Direction** | Pointer to [**V1DataTransferDirectionV1**](v1DataTransferDirectionV1.md) |  | [optional] [default to DATA_TRANSFER_DIRECTION_UNSPECIFIED]
**UploadUrl** | Pointer to **string** | The upload URL for the document file in GCS. | [optional] 
**RawFileUrl** | Pointer to **string** | The download URL for the raw document file in GCS. | [optional] 
**StandardizedPdfUrl** | Pointer to **string** | The download URL for the standardized PDF file in GCS. | [optional] 
**ContentUrl** | Pointer to **string** | The download URL for the content file in GCS. | [optional] 
**AcquiredBy** | Pointer to **string** | The name of the worker that acquired the document content. | [optional] 
**AcquiredTime** | Pointer to **time.Time** | The timestamp when the document content was acquired. | [optional] 
**NextRetryTime** | Pointer to **time.Time** | The expected time of task compleation. If not completed before this time, the task will be retried. | [optional] 

## Methods

### NewV1AcquiredDocumentContentV1

`func NewV1AcquiredDocumentContentV1() *V1AcquiredDocumentContentV1`

NewV1AcquiredDocumentContentV1 instantiates a new V1AcquiredDocumentContentV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1AcquiredDocumentContentV1WithDefaults

`func NewV1AcquiredDocumentContentV1WithDefaults() *V1AcquiredDocumentContentV1`

NewV1AcquiredDocumentContentV1WithDefaults instantiates a new V1AcquiredDocumentContentV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocumentContentId

`func (o *V1AcquiredDocumentContentV1) GetDocumentContentId() string`

GetDocumentContentId returns the DocumentContentId field if non-nil, zero value otherwise.

### GetDocumentContentIdOk

`func (o *V1AcquiredDocumentContentV1) GetDocumentContentIdOk() (*string, bool)`

GetDocumentContentIdOk returns a tuple with the DocumentContentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentContentId

`func (o *V1AcquiredDocumentContentV1) SetDocumentContentId(v string)`

SetDocumentContentId sets DocumentContentId field to given value.

### HasDocumentContentId

`func (o *V1AcquiredDocumentContentV1) HasDocumentContentId() bool`

HasDocumentContentId returns a boolean if a field has been set.

### GetExternalPrimaryKey

`func (o *V1AcquiredDocumentContentV1) GetExternalPrimaryKey() string`

GetExternalPrimaryKey returns the ExternalPrimaryKey field if non-nil, zero value otherwise.

### GetExternalPrimaryKeyOk

`func (o *V1AcquiredDocumentContentV1) GetExternalPrimaryKeyOk() (*string, bool)`

GetExternalPrimaryKeyOk returns a tuple with the ExternalPrimaryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPrimaryKey

`func (o *V1AcquiredDocumentContentV1) SetExternalPrimaryKey(v string)`

SetExternalPrimaryKey sets ExternalPrimaryKey field to given value.

### HasExternalPrimaryKey

`func (o *V1AcquiredDocumentContentV1) HasExternalPrimaryKey() bool`

HasExternalPrimaryKey returns a boolean if a field has been set.

### GetDirection

`func (o *V1AcquiredDocumentContentV1) GetDirection() V1DataTransferDirectionV1`

GetDirection returns the Direction field if non-nil, zero value otherwise.

### GetDirectionOk

`func (o *V1AcquiredDocumentContentV1) GetDirectionOk() (*V1DataTransferDirectionV1, bool)`

GetDirectionOk returns a tuple with the Direction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDirection

`func (o *V1AcquiredDocumentContentV1) SetDirection(v V1DataTransferDirectionV1)`

SetDirection sets Direction field to given value.

### HasDirection

`func (o *V1AcquiredDocumentContentV1) HasDirection() bool`

HasDirection returns a boolean if a field has been set.

### GetUploadUrl

`func (o *V1AcquiredDocumentContentV1) GetUploadUrl() string`

GetUploadUrl returns the UploadUrl field if non-nil, zero value otherwise.

### GetUploadUrlOk

`func (o *V1AcquiredDocumentContentV1) GetUploadUrlOk() (*string, bool)`

GetUploadUrlOk returns a tuple with the UploadUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadUrl

`func (o *V1AcquiredDocumentContentV1) SetUploadUrl(v string)`

SetUploadUrl sets UploadUrl field to given value.

### HasUploadUrl

`func (o *V1AcquiredDocumentContentV1) HasUploadUrl() bool`

HasUploadUrl returns a boolean if a field has been set.

### GetRawFileUrl

`func (o *V1AcquiredDocumentContentV1) GetRawFileUrl() string`

GetRawFileUrl returns the RawFileUrl field if non-nil, zero value otherwise.

### GetRawFileUrlOk

`func (o *V1AcquiredDocumentContentV1) GetRawFileUrlOk() (*string, bool)`

GetRawFileUrlOk returns a tuple with the RawFileUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawFileUrl

`func (o *V1AcquiredDocumentContentV1) SetRawFileUrl(v string)`

SetRawFileUrl sets RawFileUrl field to given value.

### HasRawFileUrl

`func (o *V1AcquiredDocumentContentV1) HasRawFileUrl() bool`

HasRawFileUrl returns a boolean if a field has been set.

### GetStandardizedPdfUrl

`func (o *V1AcquiredDocumentContentV1) GetStandardizedPdfUrl() string`

GetStandardizedPdfUrl returns the StandardizedPdfUrl field if non-nil, zero value otherwise.

### GetStandardizedPdfUrlOk

`func (o *V1AcquiredDocumentContentV1) GetStandardizedPdfUrlOk() (*string, bool)`

GetStandardizedPdfUrlOk returns a tuple with the StandardizedPdfUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStandardizedPdfUrl

`func (o *V1AcquiredDocumentContentV1) SetStandardizedPdfUrl(v string)`

SetStandardizedPdfUrl sets StandardizedPdfUrl field to given value.

### HasStandardizedPdfUrl

`func (o *V1AcquiredDocumentContentV1) HasStandardizedPdfUrl() bool`

HasStandardizedPdfUrl returns a boolean if a field has been set.

### GetContentUrl

`func (o *V1AcquiredDocumentContentV1) GetContentUrl() string`

GetContentUrl returns the ContentUrl field if non-nil, zero value otherwise.

### GetContentUrlOk

`func (o *V1AcquiredDocumentContentV1) GetContentUrlOk() (*string, bool)`

GetContentUrlOk returns a tuple with the ContentUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentUrl

`func (o *V1AcquiredDocumentContentV1) SetContentUrl(v string)`

SetContentUrl sets ContentUrl field to given value.

### HasContentUrl

`func (o *V1AcquiredDocumentContentV1) HasContentUrl() bool`

HasContentUrl returns a boolean if a field has been set.

### GetAcquiredBy

`func (o *V1AcquiredDocumentContentV1) GetAcquiredBy() string`

GetAcquiredBy returns the AcquiredBy field if non-nil, zero value otherwise.

### GetAcquiredByOk

`func (o *V1AcquiredDocumentContentV1) GetAcquiredByOk() (*string, bool)`

GetAcquiredByOk returns a tuple with the AcquiredBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredBy

`func (o *V1AcquiredDocumentContentV1) SetAcquiredBy(v string)`

SetAcquiredBy sets AcquiredBy field to given value.

### HasAcquiredBy

`func (o *V1AcquiredDocumentContentV1) HasAcquiredBy() bool`

HasAcquiredBy returns a boolean if a field has been set.

### GetAcquiredTime

`func (o *V1AcquiredDocumentContentV1) GetAcquiredTime() time.Time`

GetAcquiredTime returns the AcquiredTime field if non-nil, zero value otherwise.

### GetAcquiredTimeOk

`func (o *V1AcquiredDocumentContentV1) GetAcquiredTimeOk() (*time.Time, bool)`

GetAcquiredTimeOk returns a tuple with the AcquiredTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredTime

`func (o *V1AcquiredDocumentContentV1) SetAcquiredTime(v time.Time)`

SetAcquiredTime sets AcquiredTime field to given value.

### HasAcquiredTime

`func (o *V1AcquiredDocumentContentV1) HasAcquiredTime() bool`

HasAcquiredTime returns a boolean if a field has been set.

### GetNextRetryTime

`func (o *V1AcquiredDocumentContentV1) GetNextRetryTime() time.Time`

GetNextRetryTime returns the NextRetryTime field if non-nil, zero value otherwise.

### GetNextRetryTimeOk

`func (o *V1AcquiredDocumentContentV1) GetNextRetryTimeOk() (*time.Time, bool)`

GetNextRetryTimeOk returns a tuple with the NextRetryTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextRetryTime

`func (o *V1AcquiredDocumentContentV1) SetNextRetryTime(v time.Time)`

SetNextRetryTime sets NextRetryTime field to given value.

### HasNextRetryTime

`func (o *V1AcquiredDocumentContentV1) HasNextRetryTime() bool`

HasNextRetryTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


