/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package org.sinou.cells.kotlin.openapi.moshi.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/** Values: delete,restore,copy,move,extract,compress */
@JsonClass(generateAdapter = false)
enum class RestUserActionType(val value: kotlin.String) {

  @Json(name = "delete") delete("delete"),
  @Json(name = "restore") restore("restore"),
  @Json(name = "copy") copy("copy"),
  @Json(name = "move") move("move"),
  @Json(name = "extract") extract("extract"),
  @Json(name = "compress") compress("compress");

  /**
   * Override [toString()] to avoid using the enum variable name as the value, and instead use the
   * actual value defined in the API spec file.
   *
   * This solves a problem when the variable name and its value are different, and ensures that the
   * client sends the correct enum values to the server always.
   */
  override fun toString(): kotlin.String = value

  companion object {
    /** Converts the provided [data] to a [String] on success, null otherwise. */
    fun encode(data: kotlin.Any?): kotlin.String? =
        if (data is RestUserActionType) "$data" else null

    /** Returns a valid [RestUserActionType] for [data], null otherwise. */
    fun decode(data: kotlin.Any?): RestUserActionType? =
        data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value -> it == value || normalizedData == "$value".lowercase() }
        }
  }
}
