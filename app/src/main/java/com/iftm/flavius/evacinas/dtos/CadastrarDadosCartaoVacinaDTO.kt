package com.iftm.flavius.evacinas.dtos


data class CadastrarDadosCartaoVacinaDTO (

    val cpf: String,

    val usuario: String,

    val nome: String,

    val procedimentos: String,

    val observacoesVacina: String,

    val dose: String,

    val dataAplicacao: String,

    val lote: String,

    val dataVenc: String,

    var consulta: ConsultaDTO,
    )