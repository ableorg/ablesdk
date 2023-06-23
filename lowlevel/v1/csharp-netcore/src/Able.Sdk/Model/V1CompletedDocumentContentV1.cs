/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230623221606
 * Contact: support@able.ai
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Able.Sdk.Client.OpenAPIDateConverter;

namespace Able.Sdk.Model
{
    /// <summary>
    /// Represents a DocumentContent that has been completed after processing.
    /// </summary>
    [DataContract(Name = "v1CompletedDocumentContentV1")]
    public partial class V1CompletedDocumentContentV1 : IEquatable<V1CompletedDocumentContentV1>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1CompletedDocumentContentV1" /> class.
        /// </summary>
        /// <param name="documentContentId">The ID of the document content..</param>
        /// <param name="status">status.</param>
        /// <param name="lastError">Any error message generated during processing, empty if status is COMPLETE..</param>
        /// <param name="acquiredBy">The name of the worker that acquired the document content..</param>
        /// <param name="acquiredTime">The timestamp when the document content was acquired..</param>
        /// <param name="completedBy">The name of the worker that completed the document content..</param>
        /// <param name="completedTime">The timestamp when the document content was completed..</param>
        public V1CompletedDocumentContentV1(string documentContentId = default(string), V1DocumentContentStatusV1 status = default(V1DocumentContentStatusV1), string lastError = default(string), string acquiredBy = default(string), DateTime acquiredTime = default(DateTime), string completedBy = default(string), DateTime completedTime = default(DateTime))
        {
            this.DocumentContentId = documentContentId;
            this.Status = status;
            this.LastError = lastError;
            this.AcquiredBy = acquiredBy;
            this.AcquiredTime = acquiredTime;
            this.CompletedBy = completedBy;
            this.CompletedTime = completedTime;
        }

        /// <summary>
        /// The ID of the document content.
        /// </summary>
        /// <value>The ID of the document content.</value>
        [DataMember(Name = "documentContentId", EmitDefaultValue = false)]
        public string DocumentContentId { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public V1DocumentContentStatusV1 Status { get; set; }

        /// <summary>
        /// Any error message generated during processing, empty if status is COMPLETE.
        /// </summary>
        /// <value>Any error message generated during processing, empty if status is COMPLETE.</value>
        [DataMember(Name = "lastError", EmitDefaultValue = false)]
        public string LastError { get; set; }

        /// <summary>
        /// The name of the worker that acquired the document content.
        /// </summary>
        /// <value>The name of the worker that acquired the document content.</value>
        [DataMember(Name = "acquiredBy", EmitDefaultValue = false)]
        public string AcquiredBy { get; set; }

        /// <summary>
        /// The timestamp when the document content was acquired.
        /// </summary>
        /// <value>The timestamp when the document content was acquired.</value>
        [DataMember(Name = "acquiredTime", EmitDefaultValue = false)]
        public DateTime AcquiredTime { get; set; }

        /// <summary>
        /// The name of the worker that completed the document content.
        /// </summary>
        /// <value>The name of the worker that completed the document content.</value>
        [DataMember(Name = "completedBy", EmitDefaultValue = false)]
        public string CompletedBy { get; set; }

        /// <summary>
        /// The timestamp when the document content was completed.
        /// </summary>
        /// <value>The timestamp when the document content was completed.</value>
        [DataMember(Name = "completedTime", EmitDefaultValue = false)]
        public DateTime CompletedTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1CompletedDocumentContentV1 {\n");
            sb.Append("  DocumentContentId: ").Append(DocumentContentId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  LastError: ").Append(LastError).Append("\n");
            sb.Append("  AcquiredBy: ").Append(AcquiredBy).Append("\n");
            sb.Append("  AcquiredTime: ").Append(AcquiredTime).Append("\n");
            sb.Append("  CompletedBy: ").Append(CompletedBy).Append("\n");
            sb.Append("  CompletedTime: ").Append(CompletedTime).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as V1CompletedDocumentContentV1);
        }

        /// <summary>
        /// Returns true if V1CompletedDocumentContentV1 instances are equal
        /// </summary>
        /// <param name="input">Instance of V1CompletedDocumentContentV1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1CompletedDocumentContentV1 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DocumentContentId == input.DocumentContentId ||
                    (this.DocumentContentId != null &&
                    this.DocumentContentId.Equals(input.DocumentContentId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.LastError == input.LastError ||
                    (this.LastError != null &&
                    this.LastError.Equals(input.LastError))
                ) && 
                (
                    this.AcquiredBy == input.AcquiredBy ||
                    (this.AcquiredBy != null &&
                    this.AcquiredBy.Equals(input.AcquiredBy))
                ) && 
                (
                    this.AcquiredTime == input.AcquiredTime ||
                    (this.AcquiredTime != null &&
                    this.AcquiredTime.Equals(input.AcquiredTime))
                ) && 
                (
                    this.CompletedBy == input.CompletedBy ||
                    (this.CompletedBy != null &&
                    this.CompletedBy.Equals(input.CompletedBy))
                ) && 
                (
                    this.CompletedTime == input.CompletedTime ||
                    (this.CompletedTime != null &&
                    this.CompletedTime.Equals(input.CompletedTime))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DocumentContentId != null)
                    hashCode = hashCode * 59 + this.DocumentContentId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.LastError != null)
                    hashCode = hashCode * 59 + this.LastError.GetHashCode();
                if (this.AcquiredBy != null)
                    hashCode = hashCode * 59 + this.AcquiredBy.GetHashCode();
                if (this.AcquiredTime != null)
                    hashCode = hashCode * 59 + this.AcquiredTime.GetHashCode();
                if (this.CompletedBy != null)
                    hashCode = hashCode * 59 + this.CompletedBy.GetHashCode();
                if (this.CompletedTime != null)
                    hashCode = hashCode * 59 + this.CompletedTime.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
