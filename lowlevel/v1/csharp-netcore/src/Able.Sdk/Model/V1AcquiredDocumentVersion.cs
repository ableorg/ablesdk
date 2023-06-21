/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230621235520
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
    /// Represents a DocumentVersion that has been acquired for processing.
    /// </summary>
    [DataContract(Name = "v1AcquiredDocumentVersion")]
    public partial class V1AcquiredDocumentVersion : IEquatable<V1AcquiredDocumentVersion>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1AcquiredDocumentVersion" /> class.
        /// </summary>
        /// <param name="documentVersionId">The ID of the document version..</param>
        /// <param name="externalPrimaryKey">The primary key of the document in the external system..</param>
        /// <param name="direction">direction.</param>
        /// <param name="uploadUrl">The upload URL for the document file in GCS..</param>
        /// <param name="rawFileUrl">The download URL for the raw document file in GCS..</param>
        /// <param name="standardizedPdfUrl">The download URL for the standardized PDF file in GCS..</param>
        /// <param name="contentUrl">The download URL for the content file in GCS..</param>
        /// <param name="acquiredBy">The name of the worker that acquired the document version..</param>
        /// <param name="acquiredTime">The timestamp when the document version was acquired..</param>
        /// <param name="acquiredDuration">The expected amount of time for task execution..</param>
        public V1AcquiredDocumentVersion(string documentVersionId = default(string), string externalPrimaryKey = default(string), V1DataTransferDirection direction = default(V1DataTransferDirection), string uploadUrl = default(string), string rawFileUrl = default(string), string standardizedPdfUrl = default(string), string contentUrl = default(string), string acquiredBy = default(string), DateTime acquiredTime = default(DateTime), string acquiredDuration = default(string))
        {
            this.DocumentVersionId = documentVersionId;
            this.ExternalPrimaryKey = externalPrimaryKey;
            this.Direction = direction;
            this.UploadUrl = uploadUrl;
            this.RawFileUrl = rawFileUrl;
            this.StandardizedPdfUrl = standardizedPdfUrl;
            this.ContentUrl = contentUrl;
            this.AcquiredBy = acquiredBy;
            this.AcquiredTime = acquiredTime;
            this.AcquiredDuration = acquiredDuration;
        }

        /// <summary>
        /// The ID of the document version.
        /// </summary>
        /// <value>The ID of the document version.</value>
        [DataMember(Name = "documentVersionId", EmitDefaultValue = false)]
        public string DocumentVersionId { get; set; }

        /// <summary>
        /// The primary key of the document in the external system.
        /// </summary>
        /// <value>The primary key of the document in the external system.</value>
        [DataMember(Name = "externalPrimaryKey", EmitDefaultValue = false)]
        public string ExternalPrimaryKey { get; set; }

        /// <summary>
        /// Gets or Sets Direction
        /// </summary>
        [DataMember(Name = "direction", EmitDefaultValue = false)]
        public V1DataTransferDirection Direction { get; set; }

        /// <summary>
        /// The upload URL for the document file in GCS.
        /// </summary>
        /// <value>The upload URL for the document file in GCS.</value>
        [DataMember(Name = "uploadUrl", EmitDefaultValue = false)]
        public string UploadUrl { get; set; }

        /// <summary>
        /// The download URL for the raw document file in GCS.
        /// </summary>
        /// <value>The download URL for the raw document file in GCS.</value>
        [DataMember(Name = "rawFileUrl", EmitDefaultValue = false)]
        public string RawFileUrl { get; set; }

        /// <summary>
        /// The download URL for the standardized PDF file in GCS.
        /// </summary>
        /// <value>The download URL for the standardized PDF file in GCS.</value>
        [DataMember(Name = "standardizedPdfUrl", EmitDefaultValue = false)]
        public string StandardizedPdfUrl { get; set; }

        /// <summary>
        /// The download URL for the content file in GCS.
        /// </summary>
        /// <value>The download URL for the content file in GCS.</value>
        [DataMember(Name = "contentUrl", EmitDefaultValue = false)]
        public string ContentUrl { get; set; }

        /// <summary>
        /// The name of the worker that acquired the document version.
        /// </summary>
        /// <value>The name of the worker that acquired the document version.</value>
        [DataMember(Name = "acquiredBy", EmitDefaultValue = false)]
        public string AcquiredBy { get; set; }

        /// <summary>
        /// The timestamp when the document version was acquired.
        /// </summary>
        /// <value>The timestamp when the document version was acquired.</value>
        [DataMember(Name = "acquiredTime", EmitDefaultValue = false)]
        public DateTime AcquiredTime { get; set; }

        /// <summary>
        /// The expected amount of time for task execution.
        /// </summary>
        /// <value>The expected amount of time for task execution.</value>
        [DataMember(Name = "acquiredDuration", EmitDefaultValue = false)]
        public string AcquiredDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1AcquiredDocumentVersion {\n");
            sb.Append("  DocumentVersionId: ").Append(DocumentVersionId).Append("\n");
            sb.Append("  ExternalPrimaryKey: ").Append(ExternalPrimaryKey).Append("\n");
            sb.Append("  Direction: ").Append(Direction).Append("\n");
            sb.Append("  UploadUrl: ").Append(UploadUrl).Append("\n");
            sb.Append("  RawFileUrl: ").Append(RawFileUrl).Append("\n");
            sb.Append("  StandardizedPdfUrl: ").Append(StandardizedPdfUrl).Append("\n");
            sb.Append("  ContentUrl: ").Append(ContentUrl).Append("\n");
            sb.Append("  AcquiredBy: ").Append(AcquiredBy).Append("\n");
            sb.Append("  AcquiredTime: ").Append(AcquiredTime).Append("\n");
            sb.Append("  AcquiredDuration: ").Append(AcquiredDuration).Append("\n");
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
            return this.Equals(input as V1AcquiredDocumentVersion);
        }

        /// <summary>
        /// Returns true if V1AcquiredDocumentVersion instances are equal
        /// </summary>
        /// <param name="input">Instance of V1AcquiredDocumentVersion to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1AcquiredDocumentVersion input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DocumentVersionId == input.DocumentVersionId ||
                    (this.DocumentVersionId != null &&
                    this.DocumentVersionId.Equals(input.DocumentVersionId))
                ) && 
                (
                    this.ExternalPrimaryKey == input.ExternalPrimaryKey ||
                    (this.ExternalPrimaryKey != null &&
                    this.ExternalPrimaryKey.Equals(input.ExternalPrimaryKey))
                ) && 
                (
                    this.Direction == input.Direction ||
                    (this.Direction != null &&
                    this.Direction.Equals(input.Direction))
                ) && 
                (
                    this.UploadUrl == input.UploadUrl ||
                    (this.UploadUrl != null &&
                    this.UploadUrl.Equals(input.UploadUrl))
                ) && 
                (
                    this.RawFileUrl == input.RawFileUrl ||
                    (this.RawFileUrl != null &&
                    this.RawFileUrl.Equals(input.RawFileUrl))
                ) && 
                (
                    this.StandardizedPdfUrl == input.StandardizedPdfUrl ||
                    (this.StandardizedPdfUrl != null &&
                    this.StandardizedPdfUrl.Equals(input.StandardizedPdfUrl))
                ) && 
                (
                    this.ContentUrl == input.ContentUrl ||
                    (this.ContentUrl != null &&
                    this.ContentUrl.Equals(input.ContentUrl))
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
                    this.AcquiredDuration == input.AcquiredDuration ||
                    (this.AcquiredDuration != null &&
                    this.AcquiredDuration.Equals(input.AcquiredDuration))
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
                if (this.DocumentVersionId != null)
                    hashCode = hashCode * 59 + this.DocumentVersionId.GetHashCode();
                if (this.ExternalPrimaryKey != null)
                    hashCode = hashCode * 59 + this.ExternalPrimaryKey.GetHashCode();
                if (this.Direction != null)
                    hashCode = hashCode * 59 + this.Direction.GetHashCode();
                if (this.UploadUrl != null)
                    hashCode = hashCode * 59 + this.UploadUrl.GetHashCode();
                if (this.RawFileUrl != null)
                    hashCode = hashCode * 59 + this.RawFileUrl.GetHashCode();
                if (this.StandardizedPdfUrl != null)
                    hashCode = hashCode * 59 + this.StandardizedPdfUrl.GetHashCode();
                if (this.ContentUrl != null)
                    hashCode = hashCode * 59 + this.ContentUrl.GetHashCode();
                if (this.AcquiredBy != null)
                    hashCode = hashCode * 59 + this.AcquiredBy.GetHashCode();
                if (this.AcquiredTime != null)
                    hashCode = hashCode * 59 + this.AcquiredTime.GetHashCode();
                if (this.AcquiredDuration != null)
                    hashCode = hashCode * 59 + this.AcquiredDuration.GetHashCode();
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
