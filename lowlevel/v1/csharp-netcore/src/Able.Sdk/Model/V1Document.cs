/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230628184958
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
    /// Represents a document to be added to a DocumentContent.
    /// </summary>
    [DataContract(Name = "v1Document")]
    public partial class V1Document : IEquatable<V1Document>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1Document" /> class.
        /// </summary>
        /// <param name="externalPrimaryKey">The primary key of the document in the external system..</param>
        /// <param name="attributes">Attributes associated with the document..</param>
        public V1Document(string externalPrimaryKey = default(string), List<V1Attribute> attributes = default(List<V1Attribute>))
        {
            this.ExternalPrimaryKey = externalPrimaryKey;
            this.Attributes = attributes;
        }

        /// <summary>
        /// The primary key of the document in the external system.
        /// </summary>
        /// <value>The primary key of the document in the external system.</value>
        [DataMember(Name = "externalPrimaryKey", EmitDefaultValue = false)]
        public string ExternalPrimaryKey { get; set; }

        /// <summary>
        /// Attributes associated with the document.
        /// </summary>
        /// <value>Attributes associated with the document.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public List<V1Attribute> Attributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1Document {\n");
            sb.Append("  ExternalPrimaryKey: ").Append(ExternalPrimaryKey).Append("\n");
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
            return this.Equals(input as V1Document);
        }

        /// <summary>
        /// Returns true if V1Document instances are equal
        /// </summary>
        /// <param name="input">Instance of V1Document to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1Document input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ExternalPrimaryKey == input.ExternalPrimaryKey ||
                    (this.ExternalPrimaryKey != null &&
                    this.ExternalPrimaryKey.Equals(input.ExternalPrimaryKey))
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
                if (this.ExternalPrimaryKey != null)
                    hashCode = hashCode * 59 + this.ExternalPrimaryKey.GetHashCode();
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
