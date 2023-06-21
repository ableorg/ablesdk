# V1CompleteDocumentVersionRequestProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**V1DocumentVersionStatus**](v1DocumentVersionStatus.md) |  | [default to DOCUMENT_VERSION_STATUS_UNSPECIFIED]
**LastError** | Pointer to **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**Attributes** | Pointer to [**[]V1Attribute**](V1Attribute.md) | Any attributes extracted from the document during processing. | [optional] 

## Methods

### NewV1CompleteDocumentVersionRequestProperties

`func NewV1CompleteDocumentVersionRequestProperties(status V1DocumentVersionStatus, ) *V1CompleteDocumentVersionRequestProperties`

NewV1CompleteDocumentVersionRequestProperties instantiates a new V1CompleteDocumentVersionRequestProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1CompleteDocumentVersionRequestPropertiesWithDefaults

`func NewV1CompleteDocumentVersionRequestPropertiesWithDefaults() *V1CompleteDocumentVersionRequestProperties`

NewV1CompleteDocumentVersionRequestPropertiesWithDefaults instantiates a new V1CompleteDocumentVersionRequestProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *V1CompleteDocumentVersionRequestProperties) GetStatus() V1DocumentVersionStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *V1CompleteDocumentVersionRequestProperties) GetStatusOk() (*V1DocumentVersionStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *V1CompleteDocumentVersionRequestProperties) SetStatus(v V1DocumentVersionStatus)`

SetStatus sets Status field to given value.


### GetLastError

`func (o *V1CompleteDocumentVersionRequestProperties) GetLastError() string`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *V1CompleteDocumentVersionRequestProperties) GetLastErrorOk() (*string, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *V1CompleteDocumentVersionRequestProperties) SetLastError(v string)`

SetLastError sets LastError field to given value.

### HasLastError

`func (o *V1CompleteDocumentVersionRequestProperties) HasLastError() bool`

HasLastError returns a boolean if a field has been set.

### GetAttributes

`func (o *V1CompleteDocumentVersionRequestProperties) GetAttributes() []V1Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *V1CompleteDocumentVersionRequestProperties) GetAttributesOk() (*[]V1Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *V1CompleteDocumentVersionRequestProperties) SetAttributes(v []V1Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *V1CompleteDocumentVersionRequestProperties) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


