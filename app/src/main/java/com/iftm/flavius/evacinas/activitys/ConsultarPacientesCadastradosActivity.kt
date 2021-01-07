package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.adapters.ConsultaPacienteAdapter
import com.iftm.flavius.evacinas.dtos.ConsultarPacientesCadastradosDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ConsultarPacientesCadastradosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar_pacientes_cadastrados)
        buscaDados()
    }

    fun buscaDados(){

        RetrofitService().api?.buscarPaciente()?.enqueue(object : Callback<List<ConsultarPacientesCadastradosDTO>?>{
            override fun onFailure(
                call: Call<List<ConsultarPacientesCadastradosDTO>?>,
                t: Throwable
            ) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }

            override fun onResponse(
                call: Call<List<ConsultarPacientesCadastradosDTO>?>,
                response: Response<List<ConsultarPacientesCadastradosDTO>?>
            ) {
                if (response.code() == 200){
                    var listaDePacientes = ArrayList<ConsultarPacientesCadastradosDTO>()
                    for (paciente in response.body()!!)
                        listaDePacientes.add(paciente)
                    preencherLista(listaDePacientes)
                }else{
                    Toast.makeText(this@ConsultarPacientesCadastradosActivity,"Erro ao Listar o Paciente", Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun preencherLista(listaDePacientes: java.util.ArrayList<ConsultarPacientesCadastradosDTO>) {
        Log.d("debug", "tamanho da lista: ${listaDePacientes.size}")
        val recicleView = findViewById<RecyclerView>(R.id.recyclieview)
        val adapter = ConsultaPacienteAdapter(listaDePacientes, this)
        recicleView.layoutManager = LinearLayoutManager(this)
        recicleView.adapter = adapter
    }
}