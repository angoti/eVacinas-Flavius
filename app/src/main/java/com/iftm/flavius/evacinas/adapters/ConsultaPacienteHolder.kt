package com.iftm.flavius.evacinas.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R

class ConsultaPacienteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val cpf: TextView? = itemView.findViewById(R.id.tv_item_paciente_cpf)
    val nome: TextView? = itemView.findViewById(R.id.tv_item_paciente_nome)
    val apelido: TextView? = itemView.findViewById(R.id.tv_item_paciente_apelido)

    val tipoTel: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_tipo)
    val numeroTel: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_numero)

    val rua: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_rua)
    val numeroEnd: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_numero)
    val bairro: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_bairro)
    val estado: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_estado)
    val cep: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_cep)
    val cidade: TextView? = itemView.findViewById(R.id.tv_item_paciente_telefone_endereco_cidade)
}
