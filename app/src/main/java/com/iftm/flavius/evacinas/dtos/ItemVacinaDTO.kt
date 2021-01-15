package com.iftm.flavius.evacinas.dtos

import java.util.*

data class ItemVacinaDTO(
    val dataAplicacao: String,
    val dose: String,
    val nome: String,
    val obesevacoes: String
)