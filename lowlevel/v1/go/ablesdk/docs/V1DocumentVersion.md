# V1DocumentVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalPrimaryKey** | Pointer to **string** | The primary key of the document in the external system. | [optional] 
**Attributes** | Pointer to [**[]V1Attribute**](V1Attribute.md) | Attributes associated with the document. | [optional] 

## Methods

### NewV1DocumentVersion

`func NewV1DocumentVersion() *V1DocumentVersion`

NewV1DocumentVersion instantiates a new V1DocumentVersion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1DocumentVersionWithDefaults

`func NewV1DocumentVersionWithDefaults() *V1DocumentVersion`

NewV1DocumentVersionWithDefaults instantiates a new V1DocumentVersion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExternalPrimaryKey

`func (o *V1DocumentVersion) GetExternalPrimaryKey() string`

GetExternalPrimaryKey returns the ExternalPrimaryKey field if non-nil, zero value otherwise.

### GetExternalPrimaryKeyOk

`func (o *V1DocumentVersion) GetExternalPrimaryKeyOk() (*string, bool)`

GetExternalPrimaryKeyOk returns a tuple with the ExternalPrimaryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPrimaryKey

`func (o *V1DocumentVersion) SetExternalPrimaryKey(v string)`

SetExternalPrimaryKey sets ExternalPrimaryKey field to given value.

### HasExternalPrimaryKey

`func (o *V1DocumentVersion) HasExternalPrimaryKey() bool`

HasExternalPrimaryKey returns a boolean if a field has been set.

### GetAttributes

`func (o *V1DocumentVersion) GetAttributes() []V1Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *V1DocumentVersion) GetAttributesOk() (*[]V1Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *V1DocumentVersion) SetAttributes(v []V1Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *V1DocumentVersion) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


