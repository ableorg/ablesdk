# V1CompletedDocumentContentV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentContentId** | Pointer to **string** | The ID of the document content. | [optional] 
**Status** | Pointer to [**V1DocumentContentStatusV1**](v1DocumentContentStatusV1.md) |  | [optional] [default to DOCUMENT_CONTENT_STATUS_UNSPECIFIED]
**LastError** | Pointer to **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**AcquiredBy** | Pointer to **string** | The name of the worker that acquired the document content. | [optional] 
**AcquiredTime** | Pointer to **time.Time** | The timestamp when the document content was acquired. | [optional] 
**CompletedBy** | Pointer to **string** | The name of the worker that completed the document content. | [optional] 
**CompletedTime** | Pointer to **time.Time** | The timestamp when the document content was completed. | [optional] 

## Methods

### NewV1CompletedDocumentContentV1

`func NewV1CompletedDocumentContentV1() *V1CompletedDocumentContentV1`

NewV1CompletedDocumentContentV1 instantiates a new V1CompletedDocumentContentV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1CompletedDocumentContentV1WithDefaults

`func NewV1CompletedDocumentContentV1WithDefaults() *V1CompletedDocumentContentV1`

NewV1CompletedDocumentContentV1WithDefaults instantiates a new V1CompletedDocumentContentV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocumentContentId

`func (o *V1CompletedDocumentContentV1) GetDocumentContentId() string`

GetDocumentContentId returns the DocumentContentId field if non-nil, zero value otherwise.

### GetDocumentContentIdOk

`func (o *V1CompletedDocumentContentV1) GetDocumentContentIdOk() (*string, bool)`

GetDocumentContentIdOk returns a tuple with the DocumentContentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentContentId

`func (o *V1CompletedDocumentContentV1) SetDocumentContentId(v string)`

SetDocumentContentId sets DocumentContentId field to given value.

### HasDocumentContentId

`func (o *V1CompletedDocumentContentV1) HasDocumentContentId() bool`

HasDocumentContentId returns a boolean if a field has been set.

### GetStatus

`func (o *V1CompletedDocumentContentV1) GetStatus() V1DocumentContentStatusV1`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *V1CompletedDocumentContentV1) GetStatusOk() (*V1DocumentContentStatusV1, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *V1CompletedDocumentContentV1) SetStatus(v V1DocumentContentStatusV1)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *V1CompletedDocumentContentV1) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLastError

`func (o *V1CompletedDocumentContentV1) GetLastError() string`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *V1CompletedDocumentContentV1) GetLastErrorOk() (*string, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *V1CompletedDocumentContentV1) SetLastError(v string)`

SetLastError sets LastError field to given value.

### HasLastError

`func (o *V1CompletedDocumentContentV1) HasLastError() bool`

HasLastError returns a boolean if a field has been set.

### GetAcquiredBy

`func (o *V1CompletedDocumentContentV1) GetAcquiredBy() string`

GetAcquiredBy returns the AcquiredBy field if non-nil, zero value otherwise.

### GetAcquiredByOk

`func (o *V1CompletedDocumentContentV1) GetAcquiredByOk() (*string, bool)`

GetAcquiredByOk returns a tuple with the AcquiredBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredBy

`func (o *V1CompletedDocumentContentV1) SetAcquiredBy(v string)`

SetAcquiredBy sets AcquiredBy field to given value.

### HasAcquiredBy

`func (o *V1CompletedDocumentContentV1) HasAcquiredBy() bool`

HasAcquiredBy returns a boolean if a field has been set.

### GetAcquiredTime

`func (o *V1CompletedDocumentContentV1) GetAcquiredTime() time.Time`

GetAcquiredTime returns the AcquiredTime field if non-nil, zero value otherwise.

### GetAcquiredTimeOk

`func (o *V1CompletedDocumentContentV1) GetAcquiredTimeOk() (*time.Time, bool)`

GetAcquiredTimeOk returns a tuple with the AcquiredTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcquiredTime

`func (o *V1CompletedDocumentContentV1) SetAcquiredTime(v time.Time)`

SetAcquiredTime sets AcquiredTime field to given value.

### HasAcquiredTime

`func (o *V1CompletedDocumentContentV1) HasAcquiredTime() bool`

HasAcquiredTime returns a boolean if a field has been set.

### GetCompletedBy

`func (o *V1CompletedDocumentContentV1) GetCompletedBy() string`

GetCompletedBy returns the CompletedBy field if non-nil, zero value otherwise.

### GetCompletedByOk

`func (o *V1CompletedDocumentContentV1) GetCompletedByOk() (*string, bool)`

GetCompletedByOk returns a tuple with the CompletedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedBy

`func (o *V1CompletedDocumentContentV1) SetCompletedBy(v string)`

SetCompletedBy sets CompletedBy field to given value.

### HasCompletedBy

`func (o *V1CompletedDocumentContentV1) HasCompletedBy() bool`

HasCompletedBy returns a boolean if a field has been set.

### GetCompletedTime

`func (o *V1CompletedDocumentContentV1) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *V1CompletedDocumentContentV1) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *V1CompletedDocumentContentV1) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *V1CompletedDocumentContentV1) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


