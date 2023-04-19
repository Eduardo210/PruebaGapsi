package mx.com.pruebagapsi.IU.Network.Request

import com.google.gson.annotations.SerializedName

class RequestSearch (
    @SerializedName("query") val query: String,
    @SerializedName("page") val page: Int
)