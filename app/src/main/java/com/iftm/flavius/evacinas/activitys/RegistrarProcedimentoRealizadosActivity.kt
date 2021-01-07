package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.CadastrarDadosCartaoVacinaDTO
import com.iftm.flavius.evacinas.dtos.ConsultaDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegistrarProcedimentoRealizadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_procedimento_realizados)
    }

    fun registrarProcedimentos(view: View) {
        var cpf = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var usuario = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var nome = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var procedimento = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var observacao = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var dose = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var dataAplicacao = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var lote = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()
        var dataVenc = (findViewById<EditText>(R.id.et_registrar_procedimento_cpf)).text.toString()

        var horaConsulta = (findViewById<EditText>(R.id.et_registrar_procedimento_consulta_hora)).text.toString()
        var localConsulta = (findViewById<EditText>(R.id.et_registrar_procedimento_consulta_local)).text.toString()

        var consulta = ConsultaDTO(horaConsulta,localConsulta)
        var cadastro = CadastrarDadosCartaoVacinaDTO(cpf,usuario,nome,procedimento,observacao,dose,dataAplicacao,lote,dataVenc,consulta)

        RetrofitService().api?.registrarProcedimentoRealizados(cadastro)?.enqueue(object : Callback<CadastrarDadosCartaoVacinaDTO?>{
            override fun onFailure(call: Call<CadastrarDadosCartaoVacinaDTO?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }

            override fun onResponse(
                call: Call<CadastrarDadosCartaoVacinaDTO?>,
                response: Response<CadastrarDadosCartaoVacinaDTO?>
            ) {
                if (response.code() == 200){
                    Toast.makeText(this@RegistrarProcedimentoRealizadosActivity,"Procedimentos Cadastrados com Sucesso",
                        Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@RegistrarProcedimentoRealizadosActivity,"Erro ao Cadastrar Procedimentos", Toast.LENGTH_LONG).show()
                }
            }
        })

    }
}