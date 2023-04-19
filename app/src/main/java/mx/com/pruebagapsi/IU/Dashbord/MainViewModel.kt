package mx.com.pruebagapsi.IU.Dashbord

import android.telecom.ConnectionService
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import mx.com.pruebagapsi.IU.Core.ConnectionRetrofit
import mx.com.pruebagapsi.IU.Network.Request.RequestSearch
import mx.com.pruebagapsi.IU.Network.ResponseSearch.ResponseSearch

class MainViewModel : ViewModel() {

    suspend fun obtenerArticulos(search: String, page: Int): ResponseSearch {
        var response = CompletableDeferred<ResponseSearch>()

        viewModelScope.launch (Dispatchers.IO){
            val request =RequestSearch(search, page)
            val autService = ConnectionRetrofit().getSearchService()
            val responseService  = autService.search(search,page)
            response.complete(responseService.body()!!)

        }
        return response.await()

    }
}