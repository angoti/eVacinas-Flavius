package com.iftm.flavius.evacinas.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.iftm.flavius.evacinas.R
import com.iftm.flavius.evacinas.dtos.CadastrarPacienteDTO
import com.iftm.flavius.evacinas.dtos.EnderecoDTO
import com.iftm.flavius.evacinas.dtos.TelefoneDTO
import com.iftm.flavius.evacinas.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SavePacienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_paciente)
    }

    fun salvarPaciente(view: View) {

        var cpf = (findViewById<EditText>(R.id.et_save_paciente_cpf)).text.toString()
        var nome = (findViewById<EditText>(R.id.et_save_paciente_nome)).text.toString()
        var apelido = (findViewById<EditText>(R.id.et_save_paciente_apelido)).text.toString()

        var tipoTel = (findViewById<EditText>(R.id.et_save_paciente_telefone_tipo)).text.toString()
        var numeroTel = (findViewById<EditText>(R.id.et_save_paciente_telefone_numero)).text.toString()

        var rua = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_rua)).text.toString()
        var numeroEnd = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_numero)).text.toString()
        var bairro = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_bairro)).text.toString()
        var estado = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_estado)).text.toString()
        var cep = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_cep)).text.toString()
        var cidade = (findViewById<EditText>(R.id.et_save_paciente_telefone_endereco_cidade)).text.toString()

        var enderecoCompleto = EnderecoDTO(rua,numeroEnd,bairro,estado,cep,cidade)

        var telPacient = TelefoneDTO(tipoTel,numeroTel,enderecoCompleto)

        var cadastroPaciente = CadastrarPacienteDTO(cpf,nome,apelido,telPacient)

        RetrofitService().api?.salvarPaciente(cadastroPaciente)?.enqueue(object : Callback<CadastrarPacienteDTO?>{
            override fun onFailure(call: Call<CadastrarPacienteDTO?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }

            override fun onResponse(
                call: Call<CadastrarPacienteDTO?>,
                response: Response<CadastrarPacienteDTO?>
            ) {
                if (response.code() == 200){
                    Toast.makeText(this@SavePacienteActivity,"Paciente Cadastrado com Sucesso",
                        Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@SavePacienteActivity,"Erro ao Cadastrar Paciente", Toast.LENGTH_LONG).show()
                }
            }

        })

    }
}