package com.iftm.flavius.evacinas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.ItemVacinaDTO

class ConsultaPacienteHistoricoAdapter(val dados: List<ItemVacinaDTO>, val contexto: Context) :
    RecyclerView.Adapter<ConsultaPacienteHistoricoAdapter.ConsultaPacienteHistoricoHolder>() {

    class ConsultaPacienteHistoricoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val historico_item_view_dataAplicacao = itemView.findViewById<TextView>(R.id.historico_item_view_dataAplicacao)
        val historico_item_view_dose = itemView.findViewById<TextView>(R.id.historico_item_view_dose)
        val historico_item_view_nome = itemView.findViewById<TextView>(R.id.historico_item_view_nome)
        val historico_item_view_observacoes = itemView.findViewById<TextView>(R.id.historico_item_view_observacoes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsultaPacienteHistoricoHolder {
        return ConsultaPacienteHistoricoHolder(LayoutInflater.from(contexto).inflate(R.layout.historico_item_view, parent, false))
    }

    override fun onBindViewHolder(holder: ConsultaPacienteHistoricoHolder, position: Int) {
        holder.historico_item_view_dataAplicacao.text = dados[position].dataAplicacao
        holder.historico_item_view_dose.text = dados[position].dose
        holder.historico_item_view_nome.text = dados[position].nome
        holder.historico_item_view_observacoes.text = dados[position].obesevacoes
    }

    override fun getItemCount() = dados.size
}
