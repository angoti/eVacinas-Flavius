package com.iftm.flavius.evacinas.dtos



class AtualizaPacienteDTO {
    var cpf: String? = null

    var nome: String? = null

    var apelido: String? = null

    var telefone: TelefoneDTO? = null


    constructor(cpf: String?, nome: String?, apelido: String?, telefone: TelefoneDTO?) {
        this.cpf = cpf
        this.nome = nome
        this.apelido = apelido
        this.telefone = telefone
    }
}