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

import org.sinou.cells.kotlin.openapi.moshi.model.JobsCommand

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param cmd 
 * @param jobId 
 * @param ownerId 
 * @param runParameters 
 * @param taskId 
 */


data class JobsCtrlCommand (

    @Json(name = "Cmd")
    val cmd: JobsCommand? = JobsCommand.None,

    @Json(name = "JobId")
    val jobId: kotlin.String? = null,

    @Json(name = "OwnerId")
    val ownerId: kotlin.String? = null,

    @Json(name = "RunParameters")
    val runParameters: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "TaskId")
    val taskId: kotlin.String? = null

) {


}

