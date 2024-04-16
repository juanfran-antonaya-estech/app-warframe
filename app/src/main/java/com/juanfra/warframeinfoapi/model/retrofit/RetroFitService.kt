package com.juanfra.warframeinfoapi.model.retrofit

import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.DefaultEndpoint
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetroFitService {

    @GET("{platform}")
    suspend fun getDefaultEndpoint(
        @Path("platform") platform: String,
        @Query("language") lang: String?
    ) : Response<DefaultEndpoint>

    @GET("{platform}/news")
    suspend fun getNews(
        @Path("platform") platform: String,
        @Query("language") lang: String?
    ) : Response<ArrayList<Noticia>>

    @GET("{platform}/alerts")
    suspend fun getAlerts(
        @Path("platform") platform: String,
        @Query("language") lang: String?
    ) : Response<ArrayList<Alerta>>

    @GET("{platform}/events")
    suspend fun getEvents(
        @Path("platform") platform: String,
        @Query("language") lang: String?
    ) : Response<ArrayList<Evento>>
}