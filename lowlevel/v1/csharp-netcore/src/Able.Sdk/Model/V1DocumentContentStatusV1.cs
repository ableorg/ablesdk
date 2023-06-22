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
    /// Status of processing document content.   - COMPLETE: Document processing has been successful.  - ERROR: Document processing was not successful.
    /// </summary>
    /// <value>Status of processing document content.   - COMPLETE: Document processing has been successful.  - ERROR: Document processing was not successful.</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum V1DocumentContentStatusV1
    {
        /// <summary>
        /// Enum DOCUMENTCONTENTSTATUSUNSPECIFIED for value: DOCUMENT_CONTENT_STATUS_UNSPECIFIED
        /// </summary>
        [EnumMember(Value = "DOCUMENT_CONTENT_STATUS_UNSPECIFIED")]
        DOCUMENTCONTENTSTATUSUNSPECIFIED = 1,

        /// <summary>
        /// Enum COMPLETE for value: COMPLETE
        /// </summary>
        [EnumMember(Value = "COMPLETE")]
        COMPLETE = 2,

        /// <summary>
        /// Enum ERROR for value: ERROR
        /// </summary>
        [EnumMember(Value = "ERROR")]
        ERROR = 3

    }

}
