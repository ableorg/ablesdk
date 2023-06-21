/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230621235520
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    V1Attribute,
    V1AttributeFromJSON,
    V1AttributeFromJSONTyped,
    V1AttributeToJSON,
} from './';

/**
 * Represents a document to be added to a DocumentVersion.
 * @export
 * @interface V1Document
 */
export interface V1Document {
    /**
     * The primary key of the document in the external system.
     * @type {string}
     * @memberof V1Document
     */
    externalPrimaryKey?: string;
    /**
     * Attributes associated with the document.
     * @type {Array<V1Attribute>}
     * @memberof V1Document
     */
    attributes?: Array<V1Attribute>;
}

export function V1DocumentFromJSON(json: any): V1Document {
    return V1DocumentFromJSONTyped(json, false);
}

export function V1DocumentFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1Document {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'externalPrimaryKey': !exists(json, 'externalPrimaryKey') ? undefined : json['externalPrimaryKey'],
        'attributes': !exists(json, 'attributes') ? undefined : ((json['attributes'] as Array<any>).map(V1AttributeFromJSON)),
    };
}

export function V1DocumentToJSON(value?: V1Document | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'externalPrimaryKey': value.externalPrimaryKey,
        'attributes': value.attributes === undefined ? undefined : ((value.attributes as Array<any>).map(V1AttributeToJSON)),
    };
}

