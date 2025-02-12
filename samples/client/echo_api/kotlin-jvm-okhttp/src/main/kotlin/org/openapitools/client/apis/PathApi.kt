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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import org.openapitools.client.models.ApiStringEnumRef

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class PathApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:3000")
        }
    }

    /**
     * enum for parameter enumNonrefStringPath
     */
     enum class EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(val value: kotlin.String) {
         @Json(name = "success") success("success"),
         @Json(name = "failure") failure("failure"),
         @Json(name = "unclassified") unclassified("unclassified");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * GET /path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}
     * Test path parameter(s)
     * Test path parameter(s)
     * @param pathString 
     * @param pathInteger 
     * @param enumNonrefStringPath 
     * @param enumRefStringPath 
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: ApiStringEnumRef) : kotlin.String {
        val localVarResponse = testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(pathString = pathString, pathInteger = pathInteger, enumNonrefStringPath = enumNonrefStringPath, enumRefStringPath = enumRefStringPath)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * GET /path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}
     * Test path parameter(s)
     * Test path parameter(s)
     * @param pathString 
     * @param pathInteger 
     * @param enumNonrefStringPath 
     * @param enumRefStringPath 
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: ApiStringEnumRef) : ApiResponse<kotlin.String?> {
        val localVariableConfig = testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestConfig(pathString = pathString, pathInteger = pathInteger, enumNonrefStringPath = enumNonrefStringPath, enumRefStringPath = enumRefStringPath)

        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath
     *
     * @param pathString 
     * @param pathInteger 
     * @param enumNonrefStringPath 
     * @param enumRefStringPath 
     * @return RequestConfig
     */
    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestConfig(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: ApiStringEnumRef) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}".replace("{"+"path_string"+"}", encodeURIComponent(pathString.toString())).replace("{"+"path_integer"+"}", encodeURIComponent(pathInteger.toString())).replace("{"+"enum_nonref_string_path"+"}", encodeURIComponent(enumNonrefStringPath.value.toString())).replace("{"+"enum_ref_string_path"+"}", encodeURIComponent(enumRefStringPath.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
