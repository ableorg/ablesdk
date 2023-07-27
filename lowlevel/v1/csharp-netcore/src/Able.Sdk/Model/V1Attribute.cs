/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
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
    /// Represents an attribute of document content.
    /// </summary>
    [DataContract(Name = "v1Attribute")]
    public partial class V1Attribute : IEquatable<V1Attribute>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V1Attribute" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected V1Attribute() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="V1Attribute" /> class.
        /// </summary>
        /// <param name="key">The key of the attribute. (required).</param>
        /// <param name="value">The value of the attribute. (required).</param>
        /// <param name="type">type (required).</param>
        public V1Attribute(string key = default(string), string value = default(string), V1AttributeTypeV1 type = default(V1AttributeTypeV1))
        {
            // to ensure "key" is required (not null)
            this.Key = key ?? throw new ArgumentNullException("key is a required property for V1Attribute and cannot be null");
            // to ensure "value" is required (not null)
            this.Value = value ?? throw new ArgumentNullException("value is a required property for V1Attribute and cannot be null");
            // to ensure "type" is required (not null)
            this.Type = type ?? throw new ArgumentNullException("type is a required property for V1Attribute and cannot be null");
        }

        /// <summary>
        /// The key of the attribute.
        /// </summary>
        /// <value>The key of the attribute.</value>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// The value of the attribute.
        /// </summary>
        /// <value>The value of the attribute.</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public V1AttributeTypeV1 Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V1Attribute {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as V1Attribute);
        }

        /// <summary>
        /// Returns true if V1Attribute instances are equal
        /// </summary>
        /// <param name="input">Instance of V1Attribute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V1Attribute input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
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
                if (this.Key != null)
                    hashCode = hashCode * 59 + this.Key.GetHashCode();
                if (this.Value != null)
                    hashCode = hashCode * 59 + this.Value.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
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
