package com.juanfra.warframeinfoapi.model.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroWarf {
    val baseURL = "https://api.warframestat.us/"

    val retroWarf : RetroFitService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()



        return@lazy retrofit.create(RetroFitService::class.java)
    }
}