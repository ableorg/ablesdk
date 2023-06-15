/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230615090446
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
    /// Upload reference for files.
    /// </summary>
    [DataContract(Name = "v1UploadRef")]
    public partial class V1UploadRef : IEquatable<V1UploadRef>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1UploadRef" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected V1UploadRef() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="V1UploadRef" /> class.
        /// </summary>
        /// <param name="uploadUrl">URL where the file contents should be PUT. (required).</param>
        public V1UploadRef(string uploadUrl = default(string))
        {
            // to ensure "uploadUrl" is required (not null)
            this.UploadUrl = uploadUrl ?? throw new ArgumentNullException("uploadUrl is a required property for V1UploadRef and cannot be null");
        }

        /// <summary>
        /// URL where the file contents should be PUT.
        /// </summary>
        /// <value>URL where the file contents should be PUT.</value>
        [DataMember(Name = "uploadUrl", IsRequired = true, EmitDefaultValue = false)]
        public string UploadUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1UploadRef {\n");
            sb.Append("  UploadUrl: ").Append(UploadUrl).Append("\n");
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
            return this.Equals(input as V1UploadRef);
        }

        /// <summary>
        /// Returns true if V1UploadRef instances are equal
        /// </summary>
        /// <param name="input">Instance of V1UploadRef to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1UploadRef input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UploadUrl == input.UploadUrl ||
                    (this.UploadUrl != null &&
                    this.UploadUrl.Equals(input.UploadUrl))
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
                if (this.UploadUrl != null)
                    hashCode = hashCode * 59 + this.UploadUrl.GetHashCode();
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
