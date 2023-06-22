# V1Document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalPrimaryKey** | Pointer to **string** | The primary key of the document in the external system. | [optional] 
**Attributes** | Pointer to [**[]V1Attribute**](V1Attribute.md) | Attributes associated with the document. | [optional] 

## Methods

### NewV1Document

`func NewV1Document() *V1Document`

NewV1Document instantiates a new V1Document object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1DocumentWithDefaults

`func NewV1DocumentWithDefaults() *V1Document`

NewV1DocumentWithDefaults instantiates a new V1Document object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExternalPrimaryKey

`func (o *V1Document) GetExternalPrimaryKey() string`

GetExternalPrimaryKey returns the ExternalPrimaryKey field if non-nil, zero value otherwise.

### GetExternalPrimaryKeyOk

`func (o *V1Document) GetExternalPrimaryKeyOk() (*string, bool)`

GetExternalPrimaryKeyOk returns a tuple with the ExternalPrimaryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPrimaryKey

`func (o *V1Document) SetExternalPrimaryKey(v string)`

SetExternalPrimaryKey sets ExternalPrimaryKey field to given value.

### HasExternalPrimaryKey

`func (o *V1Document) HasExternalPrimaryKey() bool`

HasExternalPrimaryKey returns a boolean if a field has been set.

### GetAttributes

`func (o *V1Document) GetAttributes() []V1Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *V1Document) GetAttributesOk() (*[]V1Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *V1Document) SetAttributes(v []V1Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *V1Document) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


