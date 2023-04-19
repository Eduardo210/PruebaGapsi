package mx.com.pruebagapsi.IU.Core

import android.content.Context
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import mx.com.pruebagapsi.IU.Complements.Utils
import mx.com.pruebagapsi.IU.Network.APIClient
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ConnectionRetrofit() {

    private val retrofit: Retrofit

    init {
        val gson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()

        val builder = Retrofit.Builder()
            .baseUrl(Utils().URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())

        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .writeTimeout(0, TimeUnit.MILLISECONDS)
            .writeTimeout(2, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES).build()
        retrofit = builder.client(okHttpClient).build()
    }

    fun getSearchService(): APIClient {
        return retrofit.create(APIClient::class.java)
    }
}