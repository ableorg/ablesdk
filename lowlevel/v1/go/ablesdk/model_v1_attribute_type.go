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
	"fmt"
)

// V1AttributeType The data type of an attribute.   - AUTO: Guess the attribute type based on its value.  - STRING: Interpret the attribute as a string.  - NUMBER: Interpret the attribute as a numeric value.
type V1AttributeType string

// List of v1AttributeType
const (
	ATTRIBUTE_TYPE_UNSPECIFIED V1AttributeType = "ATTRIBUTE_TYPE_UNSPECIFIED"
	AUTO V1AttributeType = "AUTO"
	STRING V1AttributeType = "STRING"
	NUMBER V1AttributeType = "NUMBER"
)

func (v *V1AttributeType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := V1AttributeType(value)
	for _, existing := range []V1AttributeType{ "ATTRIBUTE_TYPE_UNSPECIFIED", "AUTO", "STRING", "NUMBER",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid V1AttributeType", value)
}

// Ptr returns reference to v1AttributeType value
func (v V1AttributeType) Ptr() *V1AttributeType {
	return &v
}

type NullableV1AttributeType struct {
	value *V1AttributeType
	isSet bool
}

func (v NullableV1AttributeType) Get() *V1AttributeType {
	return v.value
}

func (v *NullableV1AttributeType) Set(val *V1AttributeType) {
	v.value = val
	v.isSet = true
}

func (v NullableV1AttributeType) IsSet() bool {
	return v.isSet
}

func (v *NullableV1AttributeType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1AttributeType(val *V1AttributeType) *NullableV1AttributeType {
	return &NullableV1AttributeType{value: val, isSet: true}
}

func (v NullableV1AttributeType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1AttributeType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
