package com.iftm.flavius.evacinas.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.ConsultarPacientesCadastradosDTO

class ConsultaPacienteAdapter(
    private val dados: List<ConsultarPacientesCadastradosDTO>,
    private val contexto: Context
) : RecyclerView.Adapter<ConsultaPacienteAdapter.ConsultaPacienteHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsultaPacienteHolder {
        return ConsultaPacienteHolder(
            LayoutInflater.from(contexto)
                .inflate(R.layout.item_lista_pacientes_cadastrados, parent, false)
        )
    }

    override fun getItemCount() = dados.size

    override fun onBindViewHolder(holder: ConsultaPacienteHolder, position: Int) {
        Log.d("debug", "posição: $position")
        holder.cpf!!.text = dados[position].cpf
        holder.nome!!.text = dados[position].nome
    }


    class ConsultaPacienteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val cpf: TextView? = itemView.findViewById(R.id.tv_item_paciente_cpf)
        val nome: TextView? = itemView.findViewById(R.id.tv_item_paciente_nome)

    }
}