package com.iftm.flavius.evacinas.dtos


data class AtualizaPacienteDTO(
    val cpf: String,

    val nome: String,

    val apelido: String,

    val telefone: TelefoneDTO
)