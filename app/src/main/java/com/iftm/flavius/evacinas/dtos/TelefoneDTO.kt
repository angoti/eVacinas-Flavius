package com.iftm.flavius.evacinas.dtos

class TelefoneDTO {

    var tipo: Int? = null

    var numero: String? = null

    var endereco: EnderecoDTO? = null


    constructor(tipo: Int?, numero: String?, endereco: EnderecoDTO?) {
        this.tipo = tipo
        this.numero = numero
        this.endereco = endereco
    }
}
