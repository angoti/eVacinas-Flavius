package com.iftm.flavius.evacinas.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.activitys.ConsultarHistoricoPacienteActivity
import com.iftm.flavius.evacinas.dtos.ConsultarPacientesCadastradosDTO

class ConsultaPacienteAdapter(
    private val dados: List<ConsultarPacientesCadastradosDTO>,
    val contexto: Context
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


    inner class ConsultaPacienteHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val cpf: TextView? = itemView.findViewById(R.id.tv_item_paciente_cpf)
        val nome: TextView? = itemView.findViewById(R.id.tv_item_paciente_nome)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val intent = Intent(contexto, ConsultarHistoricoPacienteActivity::class.java)
            intent.putExtra("id", layoutPosition)
            contexto.startActivity(intent)
        }

    }
}