# V1DocumentContent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalPrimaryKey** | Pointer to **string** | The primary key of the document in the external system. | [optional] 
**Attributes** | Pointer to [**[]V1Attribute**](V1Attribute.md) | Attributes associated with the document. | [optional] 

## Methods

### NewV1DocumentContent

`func NewV1DocumentContent() *V1DocumentContent`

NewV1DocumentContent instantiates a new V1DocumentContent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1DocumentContentWithDefaults

`func NewV1DocumentContentWithDefaults() *V1DocumentContent`

NewV1DocumentContentWithDefaults instantiates a new V1DocumentContent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExternalPrimaryKey

`func (o *V1DocumentContent) GetExternalPrimaryKey() string`

GetExternalPrimaryKey returns the ExternalPrimaryKey field if non-nil, zero value otherwise.

### GetExternalPrimaryKeyOk

`func (o *V1DocumentContent) GetExternalPrimaryKeyOk() (*string, bool)`

GetExternalPrimaryKeyOk returns a tuple with the ExternalPrimaryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPrimaryKey

`func (o *V1DocumentContent) SetExternalPrimaryKey(v string)`

SetExternalPrimaryKey sets ExternalPrimaryKey field to given value.

### HasExternalPrimaryKey

`func (o *V1DocumentContent) HasExternalPrimaryKey() bool`

HasExternalPrimaryKey returns a boolean if a field has been set.

### GetAttributes

`func (o *V1DocumentContent) GetAttributes() []V1Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *V1DocumentContent) GetAttributesOk() (*[]V1Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *V1DocumentContent) SetAttributes(v []V1Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *V1DocumentContent) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


