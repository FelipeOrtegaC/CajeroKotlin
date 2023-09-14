package com.firsttest.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class historialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial)
        lateinit var registrosBancarios: TextView
        registrosBancarios = findViewById(R.id.registrosBancarios)
    }


    private fun actualizarHistorial() {

        //  registrosBancarios.text = historial.joinToString("\n")
    }

}