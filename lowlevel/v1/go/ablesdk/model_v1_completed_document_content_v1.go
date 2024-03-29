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
	"time"
)

// V1CompletedDocumentContentV1 Represents a DocumentContent that has been completed after processing.
type V1CompletedDocumentContentV1 struct {
	// The ID of the document content.
	DocumentContentId *string `json:"documentContentId,omitempty"`
	Status *V1DocumentContentStatusV1 `json:"status,omitempty"`
	// Any error message generated during processing, empty if status is COMPLETE.
	LastError *string `json:"lastError,omitempty"`
	// The name of the worker that acquired the document content.
	AcquiredBy *string `json:"acquiredBy,omitempty"`
	// The timestamp when the document content was acquired.
	AcquiredTime *time.Time `json:"acquiredTime,omitempty"`
	// The name of the worker that completed the document content.
	CompletedBy *string `json:"completedBy,omitempty"`
	// The timestamp when the document content was completed.
	CompletedTime *time.Time `json:"completedTime,omitempty"`
}

// NewV1CompletedDocumentContentV1 instantiates a new V1CompletedDocumentContentV1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewV1CompletedDocumentContentV1() *V1CompletedDocumentContentV1 {
	this := V1CompletedDocumentContentV1{}
	var status V1DocumentContentStatusV1 = DOCUMENT_CONTENT_STATUS_UNSPECIFIED
	this.Status = &status
	return &this
}

// NewV1CompletedDocumentContentV1WithDefaults instantiates a new V1CompletedDocumentContentV1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewV1CompletedDocumentContentV1WithDefaults() *V1CompletedDocumentContentV1 {
	this := V1CompletedDocumentContentV1{}
	var status V1DocumentContentStatusV1 = DOCUMENT_CONTENT_STATUS_UNSPECIFIED
	this.Status = &status
	return &this
}

// GetDocumentContentId returns the DocumentContentId field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetDocumentContentId() string {
	if o == nil || o.DocumentContentId == nil {
		var ret string
		return ret
	}
	return *o.DocumentContentId
}

// GetDocumentContentIdOk returns a tuple with the DocumentContentId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetDocumentContentIdOk() (*string, bool) {
	if o == nil || o.DocumentContentId == nil {
		return nil, false
	}
	return o.DocumentContentId, true
}

// HasDocumentContentId returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasDocumentContentId() bool {
	if o != nil && o.DocumentContentId != nil {
		return true
	}

	return false
}

// SetDocumentContentId gets a reference to the given string and assigns it to the DocumentContentId field.
func (o *V1CompletedDocumentContentV1) SetDocumentContentId(v string) {
	o.DocumentContentId = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetStatus() V1DocumentContentStatusV1 {
	if o == nil || o.Status == nil {
		var ret V1DocumentContentStatusV1
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetStatusOk() (*V1DocumentContentStatusV1, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given V1DocumentContentStatusV1 and assigns it to the Status field.
func (o *V1CompletedDocumentContentV1) SetStatus(v V1DocumentContentStatusV1) {
	o.Status = &v
}

// GetLastError returns the LastError field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetLastError() string {
	if o == nil || o.LastError == nil {
		var ret string
		return ret
	}
	return *o.LastError
}

// GetLastErrorOk returns a tuple with the LastError field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetLastErrorOk() (*string, bool) {
	if o == nil || o.LastError == nil {
		return nil, false
	}
	return o.LastError, true
}

// HasLastError returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasLastError() bool {
	if o != nil && o.LastError != nil {
		return true
	}

	return false
}

// SetLastError gets a reference to the given string and assigns it to the LastError field.
func (o *V1CompletedDocumentContentV1) SetLastError(v string) {
	o.LastError = &v
}

// GetAcquiredBy returns the AcquiredBy field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetAcquiredBy() string {
	if o == nil || o.AcquiredBy == nil {
		var ret string
		return ret
	}
	return *o.AcquiredBy
}

// GetAcquiredByOk returns a tuple with the AcquiredBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetAcquiredByOk() (*string, bool) {
	if o == nil || o.AcquiredBy == nil {
		return nil, false
	}
	return o.AcquiredBy, true
}

// HasAcquiredBy returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasAcquiredBy() bool {
	if o != nil && o.AcquiredBy != nil {
		return true
	}

	return false
}

// SetAcquiredBy gets a reference to the given string and assigns it to the AcquiredBy field.
func (o *V1CompletedDocumentContentV1) SetAcquiredBy(v string) {
	o.AcquiredBy = &v
}

// GetAcquiredTime returns the AcquiredTime field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetAcquiredTime() time.Time {
	if o == nil || o.AcquiredTime == nil {
		var ret time.Time
		return ret
	}
	return *o.AcquiredTime
}

// GetAcquiredTimeOk returns a tuple with the AcquiredTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetAcquiredTimeOk() (*time.Time, bool) {
	if o == nil || o.AcquiredTime == nil {
		return nil, false
	}
	return o.AcquiredTime, true
}

// HasAcquiredTime returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasAcquiredTime() bool {
	if o != nil && o.AcquiredTime != nil {
		return true
	}

	return false
}

// SetAcquiredTime gets a reference to the given time.Time and assigns it to the AcquiredTime field.
func (o *V1CompletedDocumentContentV1) SetAcquiredTime(v time.Time) {
	o.AcquiredTime = &v
}

// GetCompletedBy returns the CompletedBy field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetCompletedBy() string {
	if o == nil || o.CompletedBy == nil {
		var ret string
		return ret
	}
	return *o.CompletedBy
}

// GetCompletedByOk returns a tuple with the CompletedBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetCompletedByOk() (*string, bool) {
	if o == nil || o.CompletedBy == nil {
		return nil, false
	}
	return o.CompletedBy, true
}

// HasCompletedBy returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasCompletedBy() bool {
	if o != nil && o.CompletedBy != nil {
		return true
	}

	return false
}

// SetCompletedBy gets a reference to the given string and assigns it to the CompletedBy field.
func (o *V1CompletedDocumentContentV1) SetCompletedBy(v string) {
	o.CompletedBy = &v
}

// GetCompletedTime returns the CompletedTime field value if set, zero value otherwise.
func (o *V1CompletedDocumentContentV1) GetCompletedTime() time.Time {
	if o == nil || o.CompletedTime == nil {
		var ret time.Time
		return ret
	}
	return *o.CompletedTime
}

// GetCompletedTimeOk returns a tuple with the CompletedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentContentV1) GetCompletedTimeOk() (*time.Time, bool) {
	if o == nil || o.CompletedTime == nil {
		return nil, false
	}
	return o.CompletedTime, true
}

// HasCompletedTime returns a boolean if a field has been set.
func (o *V1CompletedDocumentContentV1) HasCompletedTime() bool {
	if o != nil && o.CompletedTime != nil {
		return true
	}

	return false
}

// SetCompletedTime gets a reference to the given time.Time and assigns it to the CompletedTime field.
func (o *V1CompletedDocumentContentV1) SetCompletedTime(v time.Time) {
	o.CompletedTime = &v
}

func (o V1CompletedDocumentContentV1) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DocumentContentId != nil {
		toSerialize["documentContentId"] = o.DocumentContentId
	}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	if o.LastError != nil {
		toSerialize["lastError"] = o.LastError
	}
	if o.AcquiredBy != nil {
		toSerialize["acquiredBy"] = o.AcquiredBy
	}
	if o.AcquiredTime != nil {
		toSerialize["acquiredTime"] = o.AcquiredTime
	}
	if o.CompletedBy != nil {
		toSerialize["completedBy"] = o.CompletedBy
	}
	if o.CompletedTime != nil {
		toSerialize["completedTime"] = o.CompletedTime
	}
	return json.Marshal(toSerialize)
}

type NullableV1CompletedDocumentContentV1 struct {
	value *V1CompletedDocumentContentV1
	isSet bool
}

func (v NullableV1CompletedDocumentContentV1) Get() *V1CompletedDocumentContentV1 {
	return v.value
}

func (v *NullableV1CompletedDocumentContentV1) Set(val *V1CompletedDocumentContentV1) {
	v.value = val
	v.isSet = true
}

func (v NullableV1CompletedDocumentContentV1) IsSet() bool {
	return v.isSet
}

func (v *NullableV1CompletedDocumentContentV1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1CompletedDocumentContentV1(val *V1CompletedDocumentContentV1) *NullableV1CompletedDocumentContentV1 {
	return &NullableV1CompletedDocumentContentV1{value: val, isSet: true}
}

func (v NullableV1CompletedDocumentContentV1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1CompletedDocumentContentV1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


