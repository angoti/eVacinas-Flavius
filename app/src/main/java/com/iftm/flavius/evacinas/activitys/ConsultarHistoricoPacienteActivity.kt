package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.adapters.ConsultaPacienteHistoricoAdapter
import com.iftm.flavius.evacinas.dtos.ItemVacinaDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ConsultarHistoricoPacienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar_historico_paciente)
        val id = intent.getIntExtra("id", -1)
        buscaDados(id+1)
    }

    private fun buscaDados(id: Int) {
        val clienteHTTP = RetrofitService()
        clienteHTTP.api!!.buscarHistoricoPaciente(id).enqueue(object : Callback<List<ItemVacinaDTO>> {
            override fun onResponse(call: Call<List<ItemVacinaDTO>>, response: Response<List<ItemVacinaDTO>>) {
                preencheRecycler(response.body()!!)
            }

            override fun onFailure(call: Call<List<ItemVacinaDTO>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    private fun preencheRecycler(historico: List<ItemVacinaDTO>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_historico)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ConsultaPacienteHistoricoAdapter(historico, this)
    }
}