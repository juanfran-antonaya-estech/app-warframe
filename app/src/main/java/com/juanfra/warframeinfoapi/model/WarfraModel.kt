package com.juanfra.warframeinfoapi.model

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WarfraModel(val context: Context) : ViewModel() {

    val repo = WarfRepositorio(context)

    private val defaultEndpointLiveData: MutableLiveData<DefaultEndpoint> = MutableLiveData()

    fun firstTime(){
        setDefaultEndpoint(repo.getDefaultEndpoint())
    }
    private fun setDefaultEndpoint(defEP: DefaultEndpoint) {
        defaultEndpointLiveData.postValue(defEP)
    }
    fun getDefaultEndpoint(): MutableLiveData<DefaultEndpoint>{
        return defaultEndpointLiveData
    }
}