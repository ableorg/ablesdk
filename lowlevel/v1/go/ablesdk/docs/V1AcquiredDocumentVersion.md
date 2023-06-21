# V1AcquiredDocumentVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentVersionId** | Pointer to **string** | The ID of the document version. | [optional] 
**ExternalPrimaryKey** | Pointer to **string** | The primary key of the document in the external system. | [optional] 
**Direction** | Pointer to [**V1DataTransferDirection**](v1DataTransferDirection.md) |  | [optional] [default to DATA_TRANSFER_DIRECTION_UNSPECIFIED]
**UploadUrl** | Pointer to **string** | The upload URL for the document file in GCS. | [optional] 
**RawFileUrl** | Pointer to **string** | The download URL for the raw document file in GCS. | [optional] 
**StandardizedPdfUrl** | Pointer to **string** | The download URL for the standardized PDF file in GCS. | [optional] 
**ContentUrl** | Pointer to **string** | The download URL for the content file in GCS. | [optional] 
**AcquiredBy** | Pointer to **string** | The name of the worker that acquired the document version. | [optional] 
**AcquiredTime** | Pointer to **time.Time** | The timestamp when the document version was acquired. | [optional] 
**AcquiredDuration** | Pointer to **string** | The expected amount of time for task execution. | [optional] 

## Methods

### NewV1AcquiredDocumentVersion

`func NewV1AcquiredDocumentVersion() *V1AcquiredDocumentVersion`

NewV1AcquiredDocumentVersion instantiates a new V1AcquiredDocumentVersion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1AcquiredDocumentVersionWithDefaults

`func NewV1AcquiredDocumentVersionWithDefaults() *V1AcquiredDocumentVersion`

NewV1AcquiredDocumentVersionWithDefaults instantiates a new V1AcquiredDocumentVersion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocumentVersionId

`func (o *V1AcquiredDocumentVersion) GetDocumentVersionId() string`

GetDocumentVersionId returns the DocumentVersionId field if non-nil, zero value otherwise.

### GetDocumentVersionIdOk

`func (o *V1AcquiredDocumentVersion) GetDocumentVersionIdOk() (*string, bool)`

GetDocumentVersionIdOk returns a tuple with the DocumentVersionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentVersionId

`func (o *V1AcquiredDocumentVersion) SetDocumentVersionId(v string)`

SetDocumentVersionId sets DocumentVersionId field to given value.

### HasDocumentVersionId

`func (o *V1AcquiredDocumentVersion) HasDocumentVersionId() bool`

HasDocumentVersionId returns a boolean if a field has been set.

### GetExternalPrimaryKey

`func (o *V1AcquiredDocumentVersion) GetExternalPrimaryKey() string`

GetExternalPrimaryKey returns the ExternalPrimaryKey field if non-nil, zero value otherwise.

### GetExternalPrimaryKeyOk

`func (o *V1AcquiredDocumentVersion) GetExternalPrimaryKeyOk() (*string, bool)`

GetExternalPrimaryKeyOk returns a tuple with the ExternalPrimaryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPrimaryKey

`func (o *V1AcquiredDocumentVersion) SetExternalPrimaryKey(v string)`

SetExternalPrimaryKey sets ExternalPrimaryKey field to given value.

### HasExternalPrimaryKey

`func (o *V1AcquiredDocumentVersion) HasExternalPrimaryKey() bool`

HasExternalPrimaryKey returns a boolean if a field has been set.

### GetDirection

`func (o *V1AcquiredDocumentVersion) GetDirection() V1DataTransferDirection`

GetDirection returns the Direction field if non-nil, zero value otherwise.

### GetDirectionOk

`func (o *V1AcquiredDocumentVersion) GetDirectionOk() (*V1DataTransferDirection, bool)`

GetDirectionOk returns a tuple with the Direction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDirection

`func (o *V1AcquiredDocumentVersion) SetDirection(v V1DataTransferDirection)`

SetDirection sets Direction field to given value.

### HasDirection

`func (o *V1AcquiredDocumentVersion) HasDirection() bool`

HasDirection returns a boolean if a field has been set.

### GetUploadUrl

`func (o *V1AcquiredDocumentVersion) GetUploadUrl() string`

GetUploadUrl returns the UploadUrl field if non-nil, zero value otherwise.

### GetUploadUrlOk

`func (o *V1AcquiredDocumentVersion) GetUploadUrlOk() (*string, bool)`

GetUploadUrlOk returns a tuple with the UploadUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadUrl

`func (o *V1AcquiredDocumentVersion) SetUploadUrl(v string)`

SetUploadUrl sets UploadUrl field to given value.

### HasUploadUrl

`func (o *V1AcquiredDocumentVersion) HasUploadUrl() bool`

HasUploadUrl returns a boolean if a field has been set.

### GetRawFileUrl

`func (o *V1AcquiredDocumentVersion) GetRawFileUrl() string`

GetRawFileUrl returns the RawFileUrl field if non-nil, zero value otherwise.

### GetRawFileUrlOk

`func (o *V1AcquiredDocumentVersion) GetRawFileUrlOk() (*string, bool)`

GetRawFileUrlOk returns a tuple with the RawFileUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawFileUrl

`func (o *V1AcquiredDocumentVersion) SetRawFileUrl(v string)`

SetRawFileUrl sets RawFileUrl field to given value.

### HasRawFileUrl

`func (o *V1AcquiredDocumentVersion) HasRawFileUrl() bool`

HasRawFileUrl returns a boolean if a field has been set.

### GetStandardizedPdfUrl

`func (o *V1AcquiredDocumentVersion) GetStandardizedPdfUrl() string`

GetStandardizedPdfUrl returns the StandardizedPdfUrl field if non-nil, zero value otherwise.

### GetStandardizedPdfUrlOk

`func (o *V1AcquiredDocumentVersion) GetStandardizedPdfUrlOk() (*string, bool)`

GetStandardizedPdfUrlOk returns a tuple with the StandardizedPdfUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStandardizedPdfUrl

`func (o *V1AcquiredDocumentVersion) SetStandardizedPdfUrl(v string)`

SetStandardizedPdfUrl sets StandardizedPdfUrl field to given value.

### HasStandardizedPdfUrl

`func (o *V1AcquiredDocumentVersion) HasStandardizedPdfUrl() bool`

HasStandardizedPdfUrl returns a boolean if a field has been set.

### GetContentUrl

`func (o *V1AcquiredDocumentVersion) GetContentUrl() string`

GetContentUrl returns the ContentUrl field if non-nil, zero value otherwise.

### GetContentUrlOk

`func (o *V1AcquiredDocumentVersion) GetContentUrlOk() (*string, bool)`

GetContentUrlOk returns a tuple with the ContentUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentUrl

`func (o *V1AcquiredDocumentVersion) SetContentUrl(v string)`

SetContentUrl sets ContentUrl field to given value.

### HasContentUrl

`func (o *V1AcquiredDocumentVersion) HasContentUrl() bool`

HasContentUrl returns a boolean if a field has been set.

### GetAcquiredBy

`func (o *V1AcquiredDocumentVersion) GetAcquiredBy() string`

GetAcquiredBy returns the AcquiredBy field if non-nil, zero value otherwise.

### GetAcquiredByOk

`func (o *V1AcquiredDocumentVersion) GetAcquiredByOk() (*string, bool)`

GetAcquiredByOk returns a tuple with the AcquiredBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredBy

`func (o *V1AcquiredDocumentVersion) SetAcquiredBy(v string)`

SetAcquiredBy sets AcquiredBy field to given value.

### HasAcquiredBy

`func (o *V1AcquiredDocumentVersion) HasAcquiredBy() bool`

HasAcquiredBy returns a boolean if a field has been set.

### GetAcquiredTime

`func (o *V1AcquiredDocumentVersion) GetAcquiredTime() time.Time`

GetAcquiredTime returns the AcquiredTime field if non-nil, zero value otherwise.

### GetAcquiredTimeOk

`func (o *V1AcquiredDocumentVersion) GetAcquiredTimeOk() (*time.Time, bool)`

GetAcquiredTimeOk returns a tuple with the AcquiredTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredTime

`func (o *V1AcquiredDocumentVersion) SetAcquiredTime(v time.Time)`

SetAcquiredTime sets AcquiredTime field to given value.

### HasAcquiredTime

`func (o *V1AcquiredDocumentVersion) HasAcquiredTime() bool`

HasAcquiredTime returns a boolean if a field has been set.

### GetAcquiredDuration

`func (o *V1AcquiredDocumentVersion) GetAcquiredDuration() string`

GetAcquiredDuration returns the AcquiredDuration field if non-nil, zero value otherwise.

### GetAcquiredDurationOk

`func (o *V1AcquiredDocumentVersion) GetAcquiredDurationOk() (*string, bool)`

GetAcquiredDurationOk returns a tuple with the AcquiredDuration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredDuration

`func (o *V1AcquiredDocumentVersion) SetAcquiredDuration(v string)`

SetAcquiredDuration sets AcquiredDuration field to given value.

### HasAcquiredDuration

`func (o *V1AcquiredDocumentVersion) HasAcquiredDuration() bool`

HasAcquiredDuration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


