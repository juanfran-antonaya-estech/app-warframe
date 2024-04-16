package com.juanfra.warframeinfoapi.model

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia


class WarfRepositorio(val context: Context) {

    private lateinit var defaultEndpoint: DefaultEndpoint
    fun getDefaultEndpoint(): DefaultEndpoint {
        var jsonString = getJsonFromAsset("defaultendpoint.json")
        var lista = Gson().fromJson(jsonString, TypeToken.get(DefaultEndpoint::class.java))
        defaultEndpoint = lista
        return lista
    }

    fun getJsonFromAsset(fileName: String?): String {
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

    suspend fun getNews(page: Int): ArrayList<Noticia> {
        return ArrayList(defaultEndpoint.news)
    }

    suspend fun getAlerts(): ArrayList<Alerta> {
        return ArrayList(defaultEndpoint.alerts)
    }

    suspend fun getEvents(): ArrayList<Evento>? {

    }
}