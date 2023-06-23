/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230623221606
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * The data type of an attribute.
 * 
 *  - AUTO: Guess the attribute type based on its value.
 *  - STRING: Interpret the attribute as a string.
 *  - NUMBER: Interpret the attribute as a numeric value.
 * @export
 * @enum {string}
 */
export enum V1AttributeTypeV1 {
    AttributeTypeUnspecified = 'ATTRIBUTE_TYPE_UNSPECIFIED',
    Auto = 'AUTO',
    String = 'STRING',
    Number = 'NUMBER'
}

export function V1AttributeTypeV1FromJSON(json: any): V1AttributeTypeV1 {
    return V1AttributeTypeV1FromJSONTyped(json, false);
}

export function V1AttributeTypeV1FromJSONTyped(json: any, ignoreDiscriminator: boolean): V1AttributeTypeV1 {
    return json as V1AttributeTypeV1;
}

export function V1AttributeTypeV1ToJSON(value?: V1AttributeTypeV1 | null): any {
    return value as any;
}

