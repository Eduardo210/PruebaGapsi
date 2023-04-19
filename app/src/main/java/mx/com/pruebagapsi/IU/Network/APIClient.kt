package mx.com.pruebagapsi.IU.Network

import mx.com.pruebagapsi.IU.Complements.Utils
import mx.com.pruebagapsi.IU.Network.Request.RequestSearch
import mx.com.pruebagapsi.IU.Network.ResponseSearch.ResponseSearch
import retrofit2.Response
import retrofit2.http.*

interface APIClient {

    @GET("/demo-gapsi/search")
    @Headers ("X-IBM-Client-Id: adb8204d-d574-4394-8c1a-53226a40876e")
    suspend fun search(@Query("query") query : String,
                        @Query("page") page: Int): Response<ResponseSearch>
}