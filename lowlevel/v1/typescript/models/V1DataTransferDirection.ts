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

/**
 * Direction of data transfer.
 * 
 *  - TO_ABLE: Data is transfered from an external source to Able.
 *  - TO_EXTERNAL: Data is transfered from Able to an external source.
 * @export
 * @enum {string}
 */
export enum V1DataTransferDirection {
    DataTransferDirectionUnspecified = 'DATA_TRANSFER_DIRECTION_UNSPECIFIED',
    ToAble = 'TO_ABLE',
    ToExternal = 'TO_EXTERNAL'
}

export function V1DataTransferDirectionFromJSON(json: any): V1DataTransferDirection {
    return V1DataTransferDirectionFromJSONTyped(json, false);
}

export function V1DataTransferDirectionFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1DataTransferDirection {
    return json as V1DataTransferDirection;
}

export function V1DataTransferDirectionToJSON(value?: V1DataTransferDirection | null): any {
    return value as any;
}
