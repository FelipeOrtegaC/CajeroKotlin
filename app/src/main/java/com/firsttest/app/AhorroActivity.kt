package com.firsttest.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ahorroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahorro)
        val registroAhorro = findViewById<Button>(R.id.botonGuardarAhorro)
    }
    private var total = 0.0


    //registroAhorro.setOnClickListener { agregarMonto() }

    private fun agregarMonto() {
        val montoIngresado = 0.0


    }
}