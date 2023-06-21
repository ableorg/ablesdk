# V1CompletedDocumentVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentVersionId** | Pointer to **string** | The ID of the document version. | [optional] 
**Status** | Pointer to [**V1DocumentVersionStatus**](v1DocumentVersionStatus.md) |  | [optional] [default to DOCUMENT_VERSION_STATUS_UNSPECIFIED]
**LastError** | Pointer to **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**AcquiredBy** | Pointer to **string** | The name of the worker that acquired the document version. | [optional] 
**AcquiredTime** | Pointer to **time.Time** | The timestamp when the document version was acquired. | [optional] 
**CompletedBy** | Pointer to **string** | The name of the worker that completed the document version. | [optional] 
**CompletedTime** | Pointer to **time.Time** | The timestamp when the document version was completed. | [optional] 

## Methods

### NewV1CompletedDocumentVersion

`func NewV1CompletedDocumentVersion() *V1CompletedDocumentVersion`

NewV1CompletedDocumentVersion instantiates a new V1CompletedDocumentVersion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1CompletedDocumentVersionWithDefaults

`func NewV1CompletedDocumentVersionWithDefaults() *V1CompletedDocumentVersion`

NewV1CompletedDocumentVersionWithDefaults instantiates a new V1CompletedDocumentVersion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocumentVersionId

`func (o *V1CompletedDocumentVersion) GetDocumentVersionId() string`

GetDocumentVersionId returns the DocumentVersionId field if non-nil, zero value otherwise.

### GetDocumentVersionIdOk

`func (o *V1CompletedDocumentVersion) GetDocumentVersionIdOk() (*string, bool)`

GetDocumentVersionIdOk returns a tuple with the DocumentVersionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentVersionId

`func (o *V1CompletedDocumentVersion) SetDocumentVersionId(v string)`

SetDocumentVersionId sets DocumentVersionId field to given value.

### HasDocumentVersionId

`func (o *V1CompletedDocumentVersion) HasDocumentVersionId() bool`

HasDocumentVersionId returns a boolean if a field has been set.

### GetStatus

`func (o *V1CompletedDocumentVersion) GetStatus() V1DocumentVersionStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *V1CompletedDocumentVersion) GetStatusOk() (*V1DocumentVersionStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *V1CompletedDocumentVersion) SetStatus(v V1DocumentVersionStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *V1CompletedDocumentVersion) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLastError

`func (o *V1CompletedDocumentVersion) GetLastError() string`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *V1CompletedDocumentVersion) GetLastErrorOk() (*string, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *V1CompletedDocumentVersion) SetLastError(v string)`

SetLastError sets LastError field to given value.

### HasLastError

`func (o *V1CompletedDocumentVersion) HasLastError() bool`

HasLastError returns a boolean if a field has been set.

### GetAcquiredBy

`func (o *V1CompletedDocumentVersion) GetAcquiredBy() string`

GetAcquiredBy returns the AcquiredBy field if non-nil, zero value otherwise.

### GetAcquiredByOk

`func (o *V1CompletedDocumentVersion) GetAcquiredByOk() (*string, bool)`

GetAcquiredByOk returns a tuple with the AcquiredBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredBy

`func (o *V1CompletedDocumentVersion) SetAcquiredBy(v string)`

SetAcquiredBy sets AcquiredBy field to given value.

### HasAcquiredBy

`func (o *V1CompletedDocumentVersion) HasAcquiredBy() bool`

HasAcquiredBy returns a boolean if a field has been set.

### GetAcquiredTime

`func (o *V1CompletedDocumentVersion) GetAcquiredTime() time.Time`

GetAcquiredTime returns the AcquiredTime field if non-nil, zero value otherwise.

### GetAcquiredTimeOk

`func (o *V1CompletedDocumentVersion) GetAcquiredTimeOk() (*time.Time, bool)`

GetAcquiredTimeOk returns a tuple with the AcquiredTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredTime

`func (o *V1CompletedDocumentVersion) SetAcquiredTime(v time.Time)`

SetAcquiredTime sets AcquiredTime field to given value.

### HasAcquiredTime

`func (o *V1CompletedDocumentVersion) HasAcquiredTime() bool`

HasAcquiredTime returns a boolean if a field has been set.

### GetCompletedBy

`func (o *V1CompletedDocumentVersion) GetCompletedBy() string`

GetCompletedBy returns the CompletedBy field if non-nil, zero value otherwise.

### GetCompletedByOk

`func (o *V1CompletedDocumentVersion) GetCompletedByOk() (*string, bool)`

GetCompletedByOk returns a tuple with the CompletedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedBy

`func (o *V1CompletedDocumentVersion) SetCompletedBy(v string)`

SetCompletedBy sets CompletedBy field to given value.

### HasCompletedBy

`func (o *V1CompletedDocumentVersion) HasCompletedBy() bool`

HasCompletedBy returns a boolean if a field has been set.

### GetCompletedTime

`func (o *V1CompletedDocumentVersion) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *V1CompletedDocumentVersion) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *V1CompletedDocumentVersion) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *V1CompletedDocumentVersion) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


