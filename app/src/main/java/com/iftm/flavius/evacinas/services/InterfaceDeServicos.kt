package com.iftm.flavius.evacinas.services

import com.iftm.flavius.evacinas.dtos.AgendarRetornoDTO
import com.iftm.flavius.evacinas.dtos.AtualizaPacienteDTO
import com.iftm.flavius.evacinas.dtos.CadastrarDadosCartaoVacinaDTO
import com.iftm.flavius.evacinas.dtos.CadastrarPacienteDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

public interface InterfaceDeServicos {

    @POST("/consulta/agendar_retorno")
    fun agendarRetorno(@Body user: AgendarRetornoDTO?): Call<AgendarRetornoDTO?>?

    @POST("/usuario/cadastrar")
    fun registrarProcedimentoRealizados(@Body user: CadastrarDadosCartaoVacinaDTO?): Call<CadastrarDadosCartaoVacinaDTO?>?

    @POST("/paciente/cadastrar")
    fun salvarPaciente(@Body user: CadastrarPacienteDTO?): Call<CadastrarPacienteDTO?>?

    @PATCH("/paciente")
    fun atualizaPaciente(@Body user: AtualizaPacienteDTO?): Call<AtualizaPacienteDTO>?

}