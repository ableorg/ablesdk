/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * API version: 1.20230727053012
 * Contact: support@able.ai
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ablesdk

import (
	"encoding/json"
	"fmt"
)

// V1AttributeTypeV1 The data type of an attribute.   - AUTO: Guess the attribute type based on its value.  - STRING: Interpret the attribute as a string.  - NUMBER: Interpret the attribute as a numeric value.
type V1AttributeTypeV1 string

// List of v1AttributeTypeV1
const (
	ATTRIBUTE_TYPE_UNSPECIFIED V1AttributeTypeV1 = "ATTRIBUTE_TYPE_UNSPECIFIED"
	AUTO V1AttributeTypeV1 = "AUTO"
	STRING V1AttributeTypeV1 = "STRING"
	NUMBER V1AttributeTypeV1 = "NUMBER"
)

func (v *V1AttributeTypeV1) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := V1AttributeTypeV1(value)
	for _, existing := range []V1AttributeTypeV1{ "ATTRIBUTE_TYPE_UNSPECIFIED", "AUTO", "STRING", "NUMBER",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid V1AttributeTypeV1", value)
}

// Ptr returns reference to v1AttributeTypeV1 value
func (v V1AttributeTypeV1) Ptr() *V1AttributeTypeV1 {
	return &v
}

type NullableV1AttributeTypeV1 struct {
	value *V1AttributeTypeV1
	isSet bool
}

func (v NullableV1AttributeTypeV1) Get() *V1AttributeTypeV1 {
	return v.value
}

func (v *NullableV1AttributeTypeV1) Set(val *V1AttributeTypeV1) {
	v.value = val
	v.isSet = true
}

func (v NullableV1AttributeTypeV1) IsSet() bool {
	return v.isSet
}

func (v *NullableV1AttributeTypeV1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1AttributeTypeV1(val *V1AttributeTypeV1) *NullableV1AttributeTypeV1 {
	return &NullableV1AttributeTypeV1{value: val, isSet: true}
}

func (v NullableV1AttributeTypeV1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1AttributeTypeV1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

