package com.juanfra.warframeinfoapi.model

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia

class WarfraModel(val context: Context) : ViewModel() {

    val repo = WarfRepositorio(context)

    private val defaultEndpointLiveData : MutableLiveData<DefaultEndpoint> = MutableLiveData()
    private val newsLiveData : MutableLiveData<ArrayList<Noticia>> = MutableLiveData()

    fun firstTime(){
        setDefaultEndpoint(repo.getDefaultEndpoint())
    }
    private fun setDefaultEndpoint(defEP: DefaultEndpoint) {
        defaultEndpointLiveData.postValue(defEP)
    }
    fun getDefaultEndpoint(): MutableLiveData<DefaultEndpoint>{
        return defaultEndpointLiveData
    }

    fun setNews(page: Int){
        newsLiveData.postValue(repo.getNews(page))
    }

    fun getNews(): MutableLiveData<ArrayList<Noticia>> {
        return newsLiveData
    }
}