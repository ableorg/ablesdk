/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
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
export enum V1DataTransferDirectionV1 {
    DataTransferDirectionUnspecified = 'DATA_TRANSFER_DIRECTION_UNSPECIFIED',
    ToAble = 'TO_ABLE',
    ToExternal = 'TO_EXTERNAL'
}

export function V1DataTransferDirectionV1FromJSON(json: any): V1DataTransferDirectionV1 {
    return V1DataTransferDirectionV1FromJSONTyped(json, false);
}

export function V1DataTransferDirectionV1FromJSONTyped(json: any, ignoreDiscriminator: boolean): V1DataTransferDirectionV1 {
    return json as V1DataTransferDirectionV1;
}

export function V1DataTransferDirectionV1ToJSON(value?: V1DataTransferDirectionV1 | null): any {
    return value as any;
}

