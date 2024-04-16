package com.juanfra.warframeinfoapi.model

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia
import kotlinx.coroutines.launch

class WarfraModel(val context: Context) : ViewModel() {

    val repo = WarfRepositorio(context)

    private val defaultEndpointLiveData : MutableLiveData<DefaultEndpoint> = MutableLiveData()
    private val newsLiveData : MutableLiveData<ArrayList<Noticia>> = MutableLiveData()
    private val alertsLiveData : MutableLiveData<ArrayList<Alerta>> = MutableLiveData()
    private val eventsLiveData : MutableLiveData<ArrayList<Evento>> = MutableLiveData()

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

    fun setDefaultAlerts() {
        alertsLiveData.postValue(repo.getAlerts())
    }

    fun getAlerts() : MutableLiveData<ArrayList<Alerta>>{
        return alertsLiveData
    }

    fun getEvents(): MutableLiveData<ArrayList<Evento>> {
        return eventsLiveData
    }

    fun setDefaultEvents() {
        viewModelScope.launch {
            eventsLiveData.postValue(repo.getEvents())
        }
    }
}