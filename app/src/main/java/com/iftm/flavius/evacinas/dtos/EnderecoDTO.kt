package com.iftm.flavius.evacinas.dtos

class EnderecoDTO {

    var rua: String? = null

    var numero: String? = null

    var bairro: String? = null

    var estado: String? = null

    var cep: String? = null

    var cidade: String? = null

    constructor(
        rua: String?,
        numero: String?,
        bairro: String?,
        estado: String?,
        cep: String?,
        cidade: String?
    ) {
        this.rua = rua
        this.numero = numero
        this.bairro = bairro
        this.estado = estado
        this.cep = cep
        this.cidade = cidade
    }
}
