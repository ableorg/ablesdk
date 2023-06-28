/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * API version: 1.20230628184958
 * Contact: support@able.ai
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ablesdk

import (
	"encoding/json"
	"fmt"
)

// V1DataTransferDirectionV1 Direction of data transfer.   - TO_ABLE: Data is transfered from an external source to Able.  - TO_EXTERNAL: Data is transfered from Able to an external source.
type V1DataTransferDirectionV1 string

// List of v1DataTransferDirectionV1
const (
	DATA_TRANSFER_DIRECTION_UNSPECIFIED V1DataTransferDirectionV1 = "DATA_TRANSFER_DIRECTION_UNSPECIFIED"
	TO_ABLE V1DataTransferDirectionV1 = "TO_ABLE"
	TO_EXTERNAL V1DataTransferDirectionV1 = "TO_EXTERNAL"
)

func (v *V1DataTransferDirectionV1) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := V1DataTransferDirectionV1(value)
	for _, existing := range []V1DataTransferDirectionV1{ "DATA_TRANSFER_DIRECTION_UNSPECIFIED", "TO_ABLE", "TO_EXTERNAL",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid V1DataTransferDirectionV1", value)
}

// Ptr returns reference to v1DataTransferDirectionV1 value
func (v V1DataTransferDirectionV1) Ptr() *V1DataTransferDirectionV1 {
	return &v
}

type NullableV1DataTransferDirectionV1 struct {
	value *V1DataTransferDirectionV1
	isSet bool
}

func (v NullableV1DataTransferDirectionV1) Get() *V1DataTransferDirectionV1 {
	return v.value
}

func (v *NullableV1DataTransferDirectionV1) Set(val *V1DataTransferDirectionV1) {
	v.value = val
	v.isSet = true
}

func (v NullableV1DataTransferDirectionV1) IsSet() bool {
	return v.isSet
}

func (v *NullableV1DataTransferDirectionV1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1DataTransferDirectionV1(val *V1DataTransferDirectionV1) *NullableV1DataTransferDirectionV1 {
	return &NullableV1DataTransferDirectionV1{value: val, isSet: true}
}

func (v NullableV1DataTransferDirectionV1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1DataTransferDirectionV1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

