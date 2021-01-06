package com.iftm.flavius.evacinas.dtos



class AgendarRetornoDTO {
    var cpf: String? = null

    var usuario: String? = null

    var consulta: ConsultaDTO? = null

    constructor(cpf: String?, usuario: String?, consulta: ConsultaDTO?) {
        this.cpf = cpf
        this.usuario = usuario
        this.consulta = consulta
    }
}