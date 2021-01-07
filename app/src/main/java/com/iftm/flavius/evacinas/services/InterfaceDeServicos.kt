package com.iftm.flavius.evacinas.services

import com.iftm.flavius.evacinas.dtos.*
import retrofit2.Call
import retrofit2.http.*

public interface InterfaceDeServicos {

    @POST("/consulta/agendar_retorno")
    fun agendarRetorno(@Body user: AgendarRetornoDTO?): Call<AgendarRetornoDTO?>?

    @POST("/usuario/cadastrar")
    fun registrarProcedimentoRealizados(@Body user: CadastrarDadosCartaoVacinaDTO?): Call<CadastrarDadosCartaoVacinaDTO?>?

    @POST("/paciente/cadastrar")
    fun salvarPaciente(@Body user: CadastrarPacienteDTO?): Call<CadastrarPacienteDTO?>?

    @PATCH("/paciente")
    fun atualizaPaciente(@Body user: AtualizaPacienteDTO?): Call<AtualizaPacienteDTO>?

    @GET("/paciente")
    fun buscarPaciente():Call<List<ConsultarPacientesCadastradosDTO>?>?

}