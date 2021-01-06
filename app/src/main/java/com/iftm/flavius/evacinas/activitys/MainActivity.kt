package com.iftm.flavius.evacinas.activitys

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.iftm.flavius.evacinas.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when(item.itemId){
            R.id.at_action_agendarretorno ->startActivity(Intent(this,
                AgendarRetornoActivity::class.java))
            R.id.at_action_atualizarpaciente ->startActivity(Intent(this,
                AtualizaPacienteActivity::class.java))
            R.id.at_action_consultarhistoricoaciente ->startActivity(Intent(this,
                ConsultarHistoricoPacienteActivity::class.java))
            R.id.at_action_consultarparcientescadastrados ->startActivity(Intent(this,
                ConsultarPacientesCadastradosActivity::class.java))
            R.id.at_action_listartodasasconsultas ->startActivity(Intent(this,
                ListaTodasAsConsultasActivity::class.java))
            R.id.at_action_procedimentosrealizados ->startActivity(Intent(this,
                RegistrarProcedimentoRealizadosActivity::class.java))
            R.id.at_action_savepaciente ->startActivity(Intent(this,
                SavePacienteActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}