package com.iftm.flavius.evacinas.dtos

import java.util.*

data class ListaItemVacinaDTO(
    val nome: String,

    val observacoes: String,

    val dose: String,

    val dataAplicacao: Date
)