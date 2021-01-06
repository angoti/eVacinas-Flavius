package com.iftm.flavius.evacinas.dtos

import java.util.*

class ListaItemVacinaDTO {
    var nome: String? = null

    var observacoes: String? = null

    var dose: String? = null

    var dataAplicacao: Date? = null

    constructor(nome: String?, observacoes: String?, dose: String?, dataAplicacao: Date?) {
        this.nome = nome
        this.observacoes = observacoes
        this.dose = dose
        this.dataAplicacao = dataAplicacao
    }
}