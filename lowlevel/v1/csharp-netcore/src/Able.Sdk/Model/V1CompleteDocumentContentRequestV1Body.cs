/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230622180011
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
    /// V1CompleteDocumentContentRequestV1Body
    /// </summary>
    [DataContract(Name = "v1CompleteDocumentContentRequestV1Body")]
    public partial class V1CompleteDocumentContentRequestV1Body : IEquatable<V1CompleteDocumentContentRequestV1Body>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1CompleteDocumentContentRequestV1Body" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected V1CompleteDocumentContentRequestV1Body() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="V1CompleteDocumentContentRequestV1Body" /> class.
        /// </summary>
        /// <param name="status">status (required).</param>
        /// <param name="lastError">Any error message generated during processing, empty if status is COMPLETE..</param>
        /// <param name="attributes">Any attributes extracted from the document during processing..</param>
        public V1CompleteDocumentContentRequestV1Body(V1DocumentContentStatusV1 status = default(V1DocumentContentStatusV1), string lastError = default(string), List<V1Attribute> attributes = default(List<V1Attribute>))
        {
            // to ensure "status" is required (not null)
            this.Status = status ?? throw new ArgumentNullException("status is a required property for V1CompleteDocumentContentRequestV1Body and cannot be null");
            this.LastError = lastError;
            this.Attributes = attributes;
        }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = false)]
        public V1DocumentContentStatusV1 Status { get; set; }

        /// <summary>
        /// Any error message generated during processing, empty if status is COMPLETE.
        /// </summary>
        /// <value>Any error message generated during processing, empty if status is COMPLETE.</value>
        [DataMember(Name = "lastError", EmitDefaultValue = false)]
        public string LastError { get; set; }

        /// <summary>
        /// Any attributes extracted from the document during processing.
        /// </summary>
        /// <value>Any attributes extracted from the document during processing.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public List<V1Attribute> Attributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1CompleteDocumentContentRequestV1Body {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  LastError: ").Append(LastError).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
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
            return this.Equals(input as V1CompleteDocumentContentRequestV1Body);
        }

        /// <summary>
        /// Returns true if V1CompleteDocumentContentRequestV1Body instances are equal
        /// </summary>
        /// <param name="input">Instance of V1CompleteDocumentContentRequestV1Body to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1CompleteDocumentContentRequestV1Body input)
        {
            if (input == null)
                return false;

            return 
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
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
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
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.LastError != null)
                    hashCode = hashCode * 59 + this.LastError.GetHashCode();
                if (this.Attributes != null)
                    hashCode = hashCode * 59 + this.Attributes.GetHashCode();
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
