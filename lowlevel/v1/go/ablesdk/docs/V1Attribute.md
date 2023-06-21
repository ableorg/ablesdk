# V1Attribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | The key of the attribute. | 
**Value** | **string** | The value of the attribute. | 
**Type** | [**V1AttributeType**](v1AttributeType.md) |  | [default to ATTRIBUTE_TYPE_UNSPECIFIED]

## Methods

### NewV1Attribute

`func NewV1Attribute(key string, value string, type_ V1AttributeType, ) *V1Attribute`

NewV1Attribute instantiates a new V1Attribute object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1AttributeWithDefaults

`func NewV1AttributeWithDefaults() *V1Attribute`

NewV1AttributeWithDefaults instantiates a new V1Attribute object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *V1Attribute) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *V1Attribute) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *V1Attribute) SetKey(v string)`

SetKey sets Key field to given value.


### GetValue

`func (o *V1Attribute) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *V1Attribute) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *V1Attribute) SetValue(v string)`

SetValue sets Value field to given value.


### GetType

`func (o *V1Attribute) GetType() V1AttributeType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *V1Attribute) GetTypeOk() (*V1AttributeType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *V1Attribute) SetType(v V1AttributeType)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


