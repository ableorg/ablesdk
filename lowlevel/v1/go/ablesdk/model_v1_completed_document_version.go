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
	"time"
)

// V1CompletedDocumentVersion Represents a DocumentVersion that has been completed after processing.
type V1CompletedDocumentVersion struct {
	// The ID of the document version.
	DocumentVersionId *string `json:"documentVersionId,omitempty"`
	Status *V1DocumentVersionStatus `json:"status,omitempty"`
	// Any error message generated during processing, empty if status is COMPLETE.
	LastError *string `json:"lastError,omitempty"`
	// The name of the worker that acquired the document version.
	AcquiredBy *string `json:"acquiredBy,omitempty"`
	// The timestamp when the document version was acquired.
	AcquiredTime *time.Time `json:"acquiredTime,omitempty"`
	// The name of the worker that completed the document version.
	CompletedBy *string `json:"completedBy,omitempty"`
	// The timestamp when the document version was completed.
	CompletedTime *time.Time `json:"completedTime,omitempty"`
}

// NewV1CompletedDocumentVersion instantiates a new V1CompletedDocumentVersion object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewV1CompletedDocumentVersion() *V1CompletedDocumentVersion {
	this := V1CompletedDocumentVersion{}
	var status V1DocumentVersionStatus = DOCUMENT_VERSION_STATUS_UNSPECIFIED
	this.Status = &status
	return &this
}

// NewV1CompletedDocumentVersionWithDefaults instantiates a new V1CompletedDocumentVersion object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewV1CompletedDocumentVersionWithDefaults() *V1CompletedDocumentVersion {
	this := V1CompletedDocumentVersion{}
	var status V1DocumentVersionStatus = DOCUMENT_VERSION_STATUS_UNSPECIFIED
	this.Status = &status
	return &this
}

// GetDocumentVersionId returns the DocumentVersionId field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetDocumentVersionId() string {
	if o == nil || o.DocumentVersionId == nil {
		var ret string
		return ret
	}
	return *o.DocumentVersionId
}

// GetDocumentVersionIdOk returns a tuple with the DocumentVersionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetDocumentVersionIdOk() (*string, bool) {
	if o == nil || o.DocumentVersionId == nil {
		return nil, false
	}
	return o.DocumentVersionId, true
}

// HasDocumentVersionId returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasDocumentVersionId() bool {
	if o != nil && o.DocumentVersionId != nil {
		return true
	}

	return false
}

// SetDocumentVersionId gets a reference to the given string and assigns it to the DocumentVersionId field.
func (o *V1CompletedDocumentVersion) SetDocumentVersionId(v string) {
	o.DocumentVersionId = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetStatus() V1DocumentVersionStatus {
	if o == nil || o.Status == nil {
		var ret V1DocumentVersionStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetStatusOk() (*V1DocumentVersionStatus, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given V1DocumentVersionStatus and assigns it to the Status field.
func (o *V1CompletedDocumentVersion) SetStatus(v V1DocumentVersionStatus) {
	o.Status = &v
}

// GetLastError returns the LastError field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetLastError() string {
	if o == nil || o.LastError == nil {
		var ret string
		return ret
	}
	return *o.LastError
}

// GetLastErrorOk returns a tuple with the LastError field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetLastErrorOk() (*string, bool) {
	if o == nil || o.LastError == nil {
		return nil, false
	}
	return o.LastError, true
}

// HasLastError returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasLastError() bool {
	if o != nil && o.LastError != nil {
		return true
	}

	return false
}

// SetLastError gets a reference to the given string and assigns it to the LastError field.
func (o *V1CompletedDocumentVersion) SetLastError(v string) {
	o.LastError = &v
}

// GetAcquiredBy returns the AcquiredBy field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetAcquiredBy() string {
	if o == nil || o.AcquiredBy == nil {
		var ret string
		return ret
	}
	return *o.AcquiredBy
}

// GetAcquiredByOk returns a tuple with the AcquiredBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetAcquiredByOk() (*string, bool) {
	if o == nil || o.AcquiredBy == nil {
		return nil, false
	}
	return o.AcquiredBy, true
}

// HasAcquiredBy returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasAcquiredBy() bool {
	if o != nil && o.AcquiredBy != nil {
		return true
	}

	return false
}

// SetAcquiredBy gets a reference to the given string and assigns it to the AcquiredBy field.
func (o *V1CompletedDocumentVersion) SetAcquiredBy(v string) {
	o.AcquiredBy = &v
}

// GetAcquiredTime returns the AcquiredTime field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetAcquiredTime() time.Time {
	if o == nil || o.AcquiredTime == nil {
		var ret time.Time
		return ret
	}
	return *o.AcquiredTime
}

// GetAcquiredTimeOk returns a tuple with the AcquiredTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetAcquiredTimeOk() (*time.Time, bool) {
	if o == nil || o.AcquiredTime == nil {
		return nil, false
	}
	return o.AcquiredTime, true
}

// HasAcquiredTime returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasAcquiredTime() bool {
	if o != nil && o.AcquiredTime != nil {
		return true
	}

	return false
}

// SetAcquiredTime gets a reference to the given time.Time and assigns it to the AcquiredTime field.
func (o *V1CompletedDocumentVersion) SetAcquiredTime(v time.Time) {
	o.AcquiredTime = &v
}

// GetCompletedBy returns the CompletedBy field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetCompletedBy() string {
	if o == nil || o.CompletedBy == nil {
		var ret string
		return ret
	}
	return *o.CompletedBy
}

// GetCompletedByOk returns a tuple with the CompletedBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetCompletedByOk() (*string, bool) {
	if o == nil || o.CompletedBy == nil {
		return nil, false
	}
	return o.CompletedBy, true
}

// HasCompletedBy returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasCompletedBy() bool {
	if o != nil && o.CompletedBy != nil {
		return true
	}

	return false
}

// SetCompletedBy gets a reference to the given string and assigns it to the CompletedBy field.
func (o *V1CompletedDocumentVersion) SetCompletedBy(v string) {
	o.CompletedBy = &v
}

// GetCompletedTime returns the CompletedTime field value if set, zero value otherwise.
func (o *V1CompletedDocumentVersion) GetCompletedTime() time.Time {
	if o == nil || o.CompletedTime == nil {
		var ret time.Time
		return ret
	}
	return *o.CompletedTime
}

// GetCompletedTimeOk returns a tuple with the CompletedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *V1CompletedDocumentVersion) GetCompletedTimeOk() (*time.Time, bool) {
	if o == nil || o.CompletedTime == nil {
		return nil, false
	}
	return o.CompletedTime, true
}

// HasCompletedTime returns a boolean if a field has been set.
func (o *V1CompletedDocumentVersion) HasCompletedTime() bool {
	if o != nil && o.CompletedTime != nil {
		return true
	}

	return false
}

// SetCompletedTime gets a reference to the given time.Time and assigns it to the CompletedTime field.
func (o *V1CompletedDocumentVersion) SetCompletedTime(v time.Time) {
	o.CompletedTime = &v
}

func (o V1CompletedDocumentVersion) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DocumentVersionId != nil {
		toSerialize["documentVersionId"] = o.DocumentVersionId
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

type NullableV1CompletedDocumentVersion struct {
	value *V1CompletedDocumentVersion
	isSet bool
}

func (v NullableV1CompletedDocumentVersion) Get() *V1CompletedDocumentVersion {
	return v.value
}

func (v *NullableV1CompletedDocumentVersion) Set(val *V1CompletedDocumentVersion) {
	v.value = val
	v.isSet = true
}

func (v NullableV1CompletedDocumentVersion) IsSet() bool {
	return v.isSet
}

func (v *NullableV1CompletedDocumentVersion) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableV1CompletedDocumentVersion(val *V1CompletedDocumentVersion) *NullableV1CompletedDocumentVersion {
	return &NullableV1CompletedDocumentVersion{value: val, isSet: true}
}

func (v NullableV1CompletedDocumentVersion) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableV1CompletedDocumentVersion) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

