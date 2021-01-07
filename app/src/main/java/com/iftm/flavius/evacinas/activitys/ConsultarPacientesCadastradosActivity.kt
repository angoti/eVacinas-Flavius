package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.adapters.ConsultaPacienteAdvice
import com.iftm.flavius.evacinas.dtos.ConsultarPacientesCadastradosDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ConsultarPacientesCadastradosActivity : AppCompatActivity() {

    val listDePacientes = ArrayList<ConsultarPacientesCadastradosDTO?>()
    val recicleView = findViewById<RecyclerView>(R.id.recyclieview)
    var adapter: ConsultaPacienteAdvice? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar_pacientes_cadastrados)
        buscaDados()
    }

    fun preencherLista(lista: List<ConsultarPacientesCadastradosDTO>?) {
        for (i in 1..20){
            listDePacientes.add(lista!![i])
        }

        adapter =  ConsultaPacienteAdvice(listDePacientes,this)
        recicleView.layoutManager = LinearLayoutManager(this)
        recicleView.adapter = adapter
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
                   var lista:List<ConsultarPacientesCadastradosDTO>? = response.body()
                    preencherLista(lista)
                    Toast.makeText(this@ConsultarPacientesCadastradosActivity,"Listagem com Sucesso",
                        Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@ConsultarPacientesCadastradosActivity,"Erro ao Listar o Paciente", Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}