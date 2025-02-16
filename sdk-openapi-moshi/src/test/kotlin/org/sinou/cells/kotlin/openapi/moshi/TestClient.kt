package org.sinou.cells.kotlin.openapi.moshi


import java.security.cert.X509Certificate
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

const val SERVER_URL = "https://localhost:8080"
private const val SKIP_SSL_VERIFICATION = true
private const val PAT =
    "MmY33NSwMyPq4ZUlYwZYsKBZhNdpU5ME0aLeuVAt0eU.UNPXXPR53BukQu-uYtv9ZjIydSq45xFRe8cWPJlloc4"

private const val USER_AGENT = "org.sinou.cells.kotlin.openapi.moshi/v0.1.1 CellsAPI/v2"
private const val AUTH_HEADER = "Authorization"
private const val USER_AGENT_HEADER = "User-Agent"
private const val DEFAULT_TOKEN_TYPE = "Bearer"

private var currClient: OkHttpClient? = null

fun getTestHttpClient(): OkHttpClient {
    if (currClient != null) {
        return currClient!!
    }
    var builder =
        if (SKIP_SSL_VERIFICATION) {
            unsafeClientBuilder()
        } else {
            OkHttpClient.Builder()
        }
    builder = builder.addInterceptor(DummyPatInterceptor(USER_AGENT) { PAT })
    currClient = builder.build()
    return currClient!!
}

fun pingServer(): Int {
    try {
        val request = Request.Builder().url(SERVER_URL).build()
        val response = getTestHttpClient().newCall(request).execute()
        return response.code
    } catch (e: Exception) {
        print("unexpected error while pinging server at ${SERVER_URL}: ${e.message}")
        return 503
    }
}

private class DummyPatInterceptor(
    private val userAgent: String,
    private val getToken: () -> String,
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var builder =
            chain
                .request()
                .newBuilder()
                .addHeader(USER_AGENT_HEADER, userAgent)
                .addHeader(AUTH_HEADER, "$DEFAULT_TOKEN_TYPE ${getToken()}")
        return chain.proceed(builder.build())
    }
}

private fun unsafeClientBuilder(): OkHttpClient.Builder {
    try {
        // Create a trust manager that does not validate certificate chains
        val trustAllCerts =
            arrayOf<TrustManager>(
                object : X509TrustManager {
                    override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) {}

                    override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) {}

                    override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
                })

        // Install the all-trusting trust manager
        val sslContext = SSLContext.getInstance("SSL")
        sslContext.init(null, trustAllCerts, java.security.SecureRandom())
        val sslSocketFactory = sslContext.socketFactory

        // Create an OkHttpClient and configure it to ignore certificate errors
        return OkHttpClient.Builder()
            .sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            .hostnameVerifier(HostnameVerifier { _, _ -> true })
    } catch (e: Exception) {
        throw RuntimeException(e)
    }
}
