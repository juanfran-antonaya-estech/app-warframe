package com.juanfra.warframeinfoapi.model

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint


class WarfRepositorio(val context: Context) {
    fun getDefaultEndpoint(): DefaultEndpoint {
        var jsonString = getJsonFromAsset("defaultendpoint.json")
        var lista = Gson().fromJson(jsonString, TypeToken.get(DefaultEndpoint::class.java))
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
}