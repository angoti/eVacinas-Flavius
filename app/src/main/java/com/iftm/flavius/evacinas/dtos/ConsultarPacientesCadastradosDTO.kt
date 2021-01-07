package com.iftm.flavius.evacinas.dtos


import java.util.*

data class ConsultarPacientesCadastradosDTO(
    val dataCastro: Date,

    val cpf: String,

    val nome: String,

    val apelido: String,

    val telefone: TelefoneDTO
)

    
