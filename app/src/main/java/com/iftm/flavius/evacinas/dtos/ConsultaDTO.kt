package com.iftm.flavius.evacinas.dtos

import java.time.LocalDateTime


class ConsultaDTO {

    var hora: String? = null

    var local: String? = null

//    var horarioDisponivel: Int? = null

    constructor(hora: String, local: String?
//                , horarioDisponivel: Int?
    ) {
        this.hora = hora
        this.local = local
//        this.horarioDisponivel = horarioDisponivel
    }
}