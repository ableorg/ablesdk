<?php
/**
 * V1AttributeTypeV1
 *
 * PHP version 7.2
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
 * Contact: support@able.ai
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.0.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;
use \OpenAPI\Client\ObjectSerializer;

/**
 * V1AttributeTypeV1 Class Doc Comment
 *
 * @category Class
 * @description The data type of an attribute.   - AUTO: Guess the attribute type based on its value.  - STRING: Interpret the attribute as a string.  - NUMBER: Interpret the attribute as a numeric value.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class V1AttributeTypeV1
{
    /**
     * Possible values of this enum
     */
    const ATTRIBUTE_TYPE_UNSPECIFIED = 'ATTRIBUTE_TYPE_UNSPECIFIED';
    const AUTO = 'AUTO';
    const STRING = 'STRING';
    const NUMBER = 'NUMBER';
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ATTRIBUTE_TYPE_UNSPECIFIED,
            self::AUTO,
            self::STRING,
            self::NUMBER,
        ];
    }
}


