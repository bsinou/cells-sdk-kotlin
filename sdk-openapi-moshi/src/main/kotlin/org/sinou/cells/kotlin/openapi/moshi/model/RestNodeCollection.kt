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

import org.sinou.cells.kotlin.openapi.moshi.model.RestNode
import org.sinou.cells.kotlin.openapi.moshi.model.RestPagination
import org.sinou.cells.kotlin.openapi.moshi.model.TreeSearchFacet

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param nodes 
 * @param facets 
 * @param pagination 
 */


data class RestNodeCollection (

    @Json(name = "Nodes")
    val nodes: kotlin.collections.List<RestNode>,

    @Json(name = "Facets")
    val facets: kotlin.collections.List<TreeSearchFacet>? = null,

    @Json(name = "Pagination")
    val pagination: RestPagination? = null

) {


}

