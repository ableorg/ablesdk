/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230622180011
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
    V1DocumentContentStatusV1,
    V1DocumentContentStatusV1FromJSON,
    V1DocumentContentStatusV1FromJSONTyped,
    V1DocumentContentStatusV1ToJSON,
} from './';

/**
 * 
 * @export
 * @interface V1CompleteDocumentContentRequestV1Body
 */
export interface V1CompleteDocumentContentRequestV1Body {
    /**
     * 
     * @type {V1DocumentContentStatusV1}
     * @memberof V1CompleteDocumentContentRequestV1Body
     */
    status: V1DocumentContentStatusV1;
    /**
     * Any error message generated during processing, empty if status is
     * COMPLETE.
     * @type {string}
     * @memberof V1CompleteDocumentContentRequestV1Body
     */
    lastError?: string;
    /**
     * Any attributes extracted from the document during processing.
     * @type {Array<V1Attribute>}
     * @memberof V1CompleteDocumentContentRequestV1Body
     */
    attributes?: Array<V1Attribute>;
}

export function V1CompleteDocumentContentRequestV1BodyFromJSON(json: any): V1CompleteDocumentContentRequestV1Body {
    return V1CompleteDocumentContentRequestV1BodyFromJSONTyped(json, false);
}

export function V1CompleteDocumentContentRequestV1BodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1CompleteDocumentContentRequestV1Body {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': V1DocumentContentStatusV1FromJSON(json['status']),
        'lastError': !exists(json, 'lastError') ? undefined : json['lastError'],
        'attributes': !exists(json, 'attributes') ? undefined : ((json['attributes'] as Array<any>).map(V1AttributeFromJSON)),
    };
}

export function V1CompleteDocumentContentRequestV1BodyToJSON(value?: V1CompleteDocumentContentRequestV1Body | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': V1DocumentContentStatusV1ToJSON(value.status),
        'lastError': value.lastError,
        'attributes': value.attributes === undefined ? undefined : ((value.attributes as Array<any>).map(V1AttributeToJSON)),
    };
}


