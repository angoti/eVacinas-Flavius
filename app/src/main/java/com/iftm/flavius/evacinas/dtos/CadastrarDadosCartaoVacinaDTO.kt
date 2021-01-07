package com.iftm.flavius.evacinas.dtos


import java.util.*


class CadastrarDadosCartaoVacinaDTO {

    var cpf: String? = null

    var usuario: String? = null

    var nome: String? = null

    var procedimentos: String? = null

    var observacoesVacina: String? = null

    var dose: String? = null

    var dataAplicacao: String? = null

    var lote: String? = null

    var dataVenc: String? = null

    var consulta: ConsultaDTO? = null

    constructor(
        cpf: String?,
        usuario: String?,
        nome: String?,
        procedimentos: String?,
        observacoesVacina: String?,
        dose: String?,
        dataAplicacao: String?,
        lote: String?,
        dataVenc: String?,
        consulta: ConsultaDTO?
    ) {
        this.cpf = cpf
        this.usuario = usuario
        this.nome = nome
        this.procedimentos = procedimentos
        this.observacoesVacina = observacoesVacina
        this.dose = dose
        this.dataAplicacao = dataAplicacao
        this.lote = lote
        this.dataVenc = dataVenc
        this.consulta = consulta
    }
}