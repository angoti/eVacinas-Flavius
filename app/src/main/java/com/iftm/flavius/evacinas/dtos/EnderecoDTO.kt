package com.iftm.flavius.evacinas.dtos

data class EnderecoDTO(
    val rua: String,

    val numero: String,

    val bairro: String,

    val estado: String,

    val cep: String,

    val cidade: String
)