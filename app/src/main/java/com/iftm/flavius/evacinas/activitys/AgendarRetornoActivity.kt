package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.AgendarRetornoDTO
import com.iftm.flavius.evacinas.dtos.ConsultaDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AgendarRetornoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendar_retorno)
    }

    fun agendarretorno(view: View) {
        var cpf = (findViewById<EditText>(R.id.et_agenda_retorno_cpf)).text.toString()
        var usuario = (findViewById<EditText>(R.id.et_agenda_retorno_usuario)).text.toString()
        var data = (findViewById<EditText>(R.id.et_agenda_retorno_consulta_horario)).text.toString()
        var local = (findViewById<EditText>(R.id.et_agenda_retorno_consulta_local)).text.toString()

        var consulta: ConsultaDTO = ConsultaDTO(data, local)
        var agedarRetorno: AgendarRetornoDTO = AgendarRetornoDTO(cpf, usuario, consulta)

        RetrofitService().api?.agendarRetorno(agedarRetorno)?.enqueue(object : Callback<AgendarRetornoDTO?>{
            override fun onResponse(
                call: Call<AgendarRetornoDTO?>,
                response: Response<AgendarRetornoDTO?>
            ) {
                if (response.code() == 200){
                    Toast.makeText(this@AgendarRetornoActivity,"Usuario Cadastrado com Sucesso",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@AgendarRetornoActivity,"Erro ao Cadastrar Usuario",Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<AgendarRetornoDTO?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }
        })

    }
}