package com.iftm.flavius.evacinas.services

import com.iftm.flavius.evacinas.dtos.AgendarRetornoDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

public interface InterfaceDeServicos {

    @POST("/consulta/agendar_retorno")
    fun agendarRetorno(@Body user: AgendarRetornoDTO?): Call<AgendarRetornoDTO?>?
}