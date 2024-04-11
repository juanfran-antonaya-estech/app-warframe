package com.juanfra.warframeinfoapi.model

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint

class WarfraModel(val context: Context) : ViewModel() {

    val repo = WarfRepositorio(context)

    val defaultEndpointLiveData: MutableLiveData<DefaultEndpoint> = MutableLiveData()

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