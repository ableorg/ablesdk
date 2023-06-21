/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * API version: 1.20230621235520
 * Contact: support@able.ai
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ablesdk

import (
	"encoding/json"
)

// V1Attribute Represents an attribute of a document.
type V1Attribute struct {
	// The key of the attribute.
	Key string `json:"key"`
	// The value of the attribute.
	Value string `json:"value"`
	Type V1AttributeType `json:"type"`
}

// NewV1Attribute instantiates a new V1Attribute object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewV1Attribute(key string, value string, type_ V1AttributeType, ) *V1Attribute {
	this := V1Attribute{}
	this.Key = key
	this.Value = value
	this.Type = type_
	return &this
}

// NewV1AttributeWithDefaults instantiates a new V1Attribute object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewV1AttributeWithDefaults() *V1Attribute {
	this := V1Attribute{}
	var type_ V1AttributeType = ATTRIBUTE_TYPE_UNSPECIFIED
	this.Type = type_
	return &this
}

// GetKey returns the Key field value
func (o *V1Attribute) GetKey() string {
	if o == nil  {
		var ret string
		return ret
	}

	return o.Key
}

// GetKeyOk returns a tuple with the Key field value
// and a boolean to check if the value has been set.
func (o *V1Attribute) GetKeyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Key, true
}

// SetKey sets field value
func (o *V1Attribute) SetKey(v string) {
	o.Key = v
}

// GetValue returns the Value field value
func (o *V1Attribute) GetValue() string {
	if o == nil  {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *V1Attribute) GetValueOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *V1Attribute) SetValue(v string) {
	o.Value = v
}

// GetType returns the Type field value
func (o *V1Attribute) GetType() V1AttributeType {
	if o == nil  {
		var ret V1AttributeType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *V1Attribute) GetTypeOk() (*V1AttributeType, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *V1Attribute) SetType(v V1AttributeType) {
	o.Type = v
}

func (o V1Attribute) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["key"] = o.Key
	}
	if true {
		toSerialize["value"] = o.Value
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableV1Attribute struct {
	value *V1Attribute
	isSet bool
}

func (v NullableV1Attribute) Get() *V1Attribute {
	return v.value
}

func (v *NullableV1Attribute) Set(val *V1Attribute) {
	v.value = val
	v.isSet = true
}

func (v NullableV1Attribute) IsSet() bool {
	return v.isSet
}

func (v *NullableV1Attribute) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1Attribute(val *V1Attribute) *NullableV1Attribute {
	return &NullableV1Attribute{value: val, isSet: true}
}

func (v NullableV1Attribute) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1Attribute) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

