/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230628184958
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    V1AttributeTypeV1,
    V1AttributeTypeV1FromJSON,
    V1AttributeTypeV1FromJSONTyped,
    V1AttributeTypeV1ToJSON,
} from './';

/**
 * Represents an attribute of document content.
 * @export
 * @interface V1Attribute
 */
export interface V1Attribute {
    /**
     * The key of the attribute.
     * @type {string}
     * @memberof V1Attribute
     */
    key: string;
    /**
     * The value of the attribute.
     * @type {string}
     * @memberof V1Attribute
     */
    value: string;
    /**
     * 
     * @type {V1AttributeTypeV1}
     * @memberof V1Attribute
     */
    type: V1AttributeTypeV1;
}

export function V1AttributeFromJSON(json: any): V1Attribute {
    return V1AttributeFromJSONTyped(json, false);
}

export function V1AttributeFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1Attribute {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'key': json['key'],
        'value': json['value'],
        'type': V1AttributeTypeV1FromJSON(json['type']),
    };
}

export function V1AttributeToJSON(value?: V1Attribute | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'key': value.key,
        'value': value.value,
        'type': V1AttributeTypeV1ToJSON(value.type),
    };
}


