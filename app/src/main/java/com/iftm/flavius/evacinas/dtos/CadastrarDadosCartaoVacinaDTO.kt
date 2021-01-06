package com.iftm.flavius.evacinas.dtos


import java.util.*


class CadastrarDadosCartaoVacinaDTO {

    var cpf: String? = null

    var usuario: String? = null

    var nome: String? = null

    var procedimentos: String? = null

    var observacoesVacina: String? = null

    var dose: String? = null

    var dataAplicacao: Date? = null

    var lote: Int? = null

    var dataVenc: Date? = null

    var consulta: ConsultaDTO? = null

}