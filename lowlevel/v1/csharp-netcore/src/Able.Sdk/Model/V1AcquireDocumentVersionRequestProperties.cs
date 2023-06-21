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
    /// V1AcquireDocumentVersionRequestProperties
    /// </summary>
    [DataContract(Name = "v1AcquireDocumentVersionRequestProperties")]
    public partial class V1AcquireDocumentVersionRequestProperties : IEquatable<V1AcquireDocumentVersionRequestProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1AcquireDocumentVersionRequestProperties" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected V1AcquireDocumentVersionRequestProperties() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="V1AcquireDocumentVersionRequestProperties" /> class.
        /// </summary>
        /// <param name="expectedExecutionDuration">The expected amount of time for task execution. (required).</param>
        public V1AcquireDocumentVersionRequestProperties(string expectedExecutionDuration = default(string))
        {
            // to ensure "expectedExecutionDuration" is required (not null)
            this.ExpectedExecutionDuration = expectedExecutionDuration ?? throw new ArgumentNullException("expectedExecutionDuration is a required property for V1AcquireDocumentVersionRequestProperties and cannot be null");
        }

        /// <summary>
        /// The expected amount of time for task execution.
        /// </summary>
        /// <value>The expected amount of time for task execution.</value>
        [DataMember(Name = "expectedExecutionDuration", IsRequired = true, EmitDefaultValue = false)]
        public string ExpectedExecutionDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1AcquireDocumentVersionRequestProperties {\n");
            sb.Append("  ExpectedExecutionDuration: ").Append(ExpectedExecutionDuration).Append("\n");
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
            return this.Equals(input as V1AcquireDocumentVersionRequestProperties);
        }

        /// <summary>
        /// Returns true if V1AcquireDocumentVersionRequestProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of V1AcquireDocumentVersionRequestProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1AcquireDocumentVersionRequestProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ExpectedExecutionDuration == input.ExpectedExecutionDuration ||
                    (this.ExpectedExecutionDuration != null &&
                    this.ExpectedExecutionDuration.Equals(input.ExpectedExecutionDuration))
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
                if (this.ExpectedExecutionDuration != null)
                    hashCode = hashCode * 59 + this.ExpectedExecutionDuration.GetHashCode();
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