package com.iftm.flavius.evacinas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.ConsultarPacientesCadastradosDTO

class ConsultaPacienteAdvice: RecyclerView.Adapter<ConsultaPacienteHolder> {

    var dados:List<ConsultarPacientesCadastradosDTO?>? = null
    var geradorDeView : LayoutInflater? = null

    constructor(
        dados: List<ConsultarPacientesCadastradosDTO?>?,
        context: Context?
    ) {
        this.dados = dados
        geradorDeView = LayoutInflater.from(context)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsultaPacienteHolder {
        return ConsultaPacienteHolder(geradorDeView!!.inflate(R.layout.item_lista_pacientes_cadastrados,parent,false))
    }

    override fun getItemCount() = dados!!.size

    override fun onBindViewHolder(holder: ConsultaPacienteHolder, position: Int) {
        holder.cpf!!.text = dados!![position].toString()
        holder.nome!!.text = dados!![position].toString()
        holder.apelido!!.text = dados!![position].toString()

        holder.tipoTel!!.text = dados!![position].toString()
        holder.numeroTel!!.text = dados!![position].toString()

        holder.rua!!.text = dados!![position].toString()
        holder.numeroEnd!!.text = dados!![position].toString()
        holder.bairro!!.text = dados!![position].toString()
        holder.estado!!.text = dados!![position].toString()
        holder.cep!!.text = dados!![position].toString()
        holder.cidade!!.text = dados!![position].toString()
    }
}