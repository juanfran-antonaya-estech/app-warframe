package com.juanfra.warframeinfoapi.model

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia
import com.juanfra.warframeinfoapi.model.retrofit.RetroFitService
import com.juanfra.warframeinfoapi.model.retrofit.RetroWarf


class WarfRepositorio(val context: Context) {

    private lateinit var defaultEndpoint: DefaultEndpoint
    private val warfapi = RetroWarf.retroWarf

    private val platform = "pc"
    private val lang = "es"

    suspend fun getDefaultEndpoint(): DefaultEndpoint {
        var jsonString = getJsonFromAsset("defaultendpoint.json")
        var lista = Gson().fromJson(jsonString, TypeToken.get(DefaultEndpoint::class.java))
        val response = warfapi.getDefaultEndpoint(platform, lang)
        if (response.isSuccessful){
            defaultEndpoint = lista
            lista = response.body()
            return lista
        } else {
            defaultEndpoint = lista
            return lista
        }

    }

    private fun getJsonFromAsset(fileName: String?): String {
        var json = ""
        try {
            val stream = context.assets.open(fileName!!)
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            json = String(buffer, charset("UTF-8"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return json
    }

    suspend fun getNews(page: Int): ArrayList<Noticia>? {
        val response = warfapi.getNews(platform, lang)
        if (response.isSuccessful) {
            return response.body()
        }
        return ArrayList(defaultEndpoint.news)
    }

    suspend fun getAlerts(): ArrayList<Alerta>? {
        val response = warfapi.getAlerts(platform, lang)
        if (response.isSuccessful) {
            return response.body()
        }
        return ArrayList(defaultEndpoint.alerts)
    }

    suspend fun getEvents(): ArrayList<Evento>? {
        val response = warfapi.getEvents(platform, lang)
        Log.d("Llamada bien hecha", response.isSuccessful.toString())
        Log.d("el objeto", response.body().toString())
        if (response.isSuccessful) {
            return response.body()
        } else {
            return null
        }
    }
}