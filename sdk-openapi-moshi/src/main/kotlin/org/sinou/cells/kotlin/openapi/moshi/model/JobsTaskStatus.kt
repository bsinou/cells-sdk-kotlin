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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: Unknown,Idle,Running,Finished,Interrupted,Paused,Any,Error,Queued
 */

@JsonClass(generateAdapter = false)
enum class JobsTaskStatus(val value: kotlin.String) {

    @Json(name = "Unknown")
    Unknown("Unknown"),

    @Json(name = "Idle")
    Idle("Idle"),

    @Json(name = "Running")
    Running("Running"),

    @Json(name = "Finished")
    Finished("Finished"),

    @Json(name = "Interrupted")
    Interrupted("Interrupted"),

    @Json(name = "Paused")
    Paused("Paused"),

    @Json(name = "Any")
    Any("Any"),

    @Json(name = "Error")
    Error("Error"),

    @Json(name = "Queued")
    Queued("Queued");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is JobsTaskStatus) "$data" else null

        /**
         * Returns a valid [JobsTaskStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): JobsTaskStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

