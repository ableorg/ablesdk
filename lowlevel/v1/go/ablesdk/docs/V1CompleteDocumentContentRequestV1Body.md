# V1CompleteDocumentContentRequestV1Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**V1DocumentContentStatusV1**](v1DocumentContentStatusV1.md) |  | [default to DOCUMENT_CONTENT_STATUS_UNSPECIFIED]
**LastError** | Pointer to **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**Attributes** | Pointer to [**[]V1Attribute**](V1Attribute.md) | Any attributes extracted from the document during processing. | [optional] 

## Methods

### NewV1CompleteDocumentContentRequestV1Body

`func NewV1CompleteDocumentContentRequestV1Body(status V1DocumentContentStatusV1, ) *V1CompleteDocumentContentRequestV1Body`

NewV1CompleteDocumentContentRequestV1Body instantiates a new V1CompleteDocumentContentRequestV1Body object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1CompleteDocumentContentRequestV1BodyWithDefaults

`func NewV1CompleteDocumentContentRequestV1BodyWithDefaults() *V1CompleteDocumentContentRequestV1Body`

NewV1CompleteDocumentContentRequestV1BodyWithDefaults instantiates a new V1CompleteDocumentContentRequestV1Body object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *V1CompleteDocumentContentRequestV1Body) GetStatus() V1DocumentContentStatusV1`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *V1CompleteDocumentContentRequestV1Body) GetStatusOk() (*V1DocumentContentStatusV1, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *V1CompleteDocumentContentRequestV1Body) SetStatus(v V1DocumentContentStatusV1)`

SetStatus sets Status field to given value.


### GetLastError

`func (o *V1CompleteDocumentContentRequestV1Body) GetLastError() string`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *V1CompleteDocumentContentRequestV1Body) GetLastErrorOk() (*string, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *V1CompleteDocumentContentRequestV1Body) SetLastError(v string)`

SetLastError sets LastError field to given value.

### HasLastError

`func (o *V1CompleteDocumentContentRequestV1Body) HasLastError() bool`

HasLastError returns a boolean if a field has been set.

### GetAttributes

`func (o *V1CompleteDocumentContentRequestV1Body) GetAttributes() []V1Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *V1CompleteDocumentContentRequestV1Body) GetAttributesOk() (*[]V1Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *V1CompleteDocumentContentRequestV1Body) SetAttributes(v []V1Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *V1CompleteDocumentContentRequestV1Body) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


