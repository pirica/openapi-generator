/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable
/**
 * 
 * @param number None
 * @param double None
 * @param patternWithoutDelimiter None
 * @param byte None
 * @param integer None
 * @param int32 None
 * @param int64 None
 * @param float None
 * @param string None
 * @param binary None
 * @param date None
 * @param dateTime None
 * @param password None
 * @param callback None
 */

data class InlineObject3 (
    /* None */
    @SerializedName("number")
    val number: java.math.BigDecimal,
    /* None */
    @SerializedName("double")
    val double: kotlin.Double,
    /* None */
    @SerializedName("pattern_without_delimiter")
    val patternWithoutDelimiter: kotlin.String,
    /* None */
    @SerializedName("byte")
    val byte: kotlin.ByteArray,
    /* None */
    @SerializedName("integer")
    val integer: kotlin.Int? = null,
    /* None */
    @SerializedName("int32")
    val int32: kotlin.Int? = null,
    /* None */
    @SerializedName("int64")
    val int64: kotlin.Long? = null,
    /* None */
    @SerializedName("float")
    val float: kotlin.Float? = null,
    /* None */
    @SerializedName("string")
    val string: kotlin.String? = null,
    /* None */
    @SerializedName("binary")
    val binary: java.io.File? = null,
    /* None */
    @SerializedName("date")
    val date: java.time.LocalDate? = null,
    /* None */
    @SerializedName("dateTime")
    val dateTime: java.time.OffsetDateTime? = null,
    /* None */
    @SerializedName("password")
    val password: kotlin.String? = null,
    /* None */
    @SerializedName("callback")
    val callback: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

