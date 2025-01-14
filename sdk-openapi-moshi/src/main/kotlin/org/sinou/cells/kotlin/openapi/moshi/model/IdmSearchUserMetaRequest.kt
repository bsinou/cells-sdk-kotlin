/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.sinou.cells.kotlin.openapi.moshi.model

import org.sinou.cells.kotlin.openapi.moshi.model.ServiceResourcePolicyQuery

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param metaUuids 
 * @param namespace 
 * @param nodeUuids 
 * @param resourceQuery 
 * @param resourceSubjectOwner 
 */


data class IdmSearchUserMetaRequest (

    @Json(name = "MetaUuids")
    val metaUuids: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "Namespace")
    val namespace: kotlin.String? = null,

    @Json(name = "NodeUuids")
    val nodeUuids: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "ResourceQuery")
    val resourceQuery: ServiceResourcePolicyQuery? = null,

    @Json(name = "ResourceSubjectOwner")
    val resourceSubjectOwner: kotlin.String? = null

) {


}

