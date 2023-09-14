package com.firsttest.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private val historial = mutableListOf<String>()

class MainActivity : AppCompatActivity() {

    private lateinit var txtBalance: TextView
    var saldo = 300000.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtBalance = findViewById(R.id.txtBalance)

        val Ahorrar = findViewById<Button>(R.id.botonAhorrar)
        val Retirar = findViewById<Button>(R.id.botonRetiro)
        val Historial = findViewById<Button>(R.id.botonHistorial)

        Ahorrar.setOnClickListener {
            val intent = Intent(this, ahorroActivity::class.java)
            startActivity(intent)
            //actualizarSaldo()
        }
        Retirar.setOnClickListener {
            val intent = Intent(this, retiroActivity::class.java)
            intent.putExtra("saldo_extra", saldo)
            startActivity(intent)
            //actualizarSaldo()
        }
        Historial.setOnClickListener {
            val intent = Intent(this, historialActivity::class.java)
            startActivity(intent)
            actualizarSaldo(saldo, txtBalance)
        }
    }

    public fun actualizarSaldo(saldo:Double, txtBalance:TextView){
        txtBalance.text = "$$saldo"
    }



    /*
    private fun obtenerFechaActual(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        val fechaActual = Date()
        return dateFormat.format(fechaActual)
    }*/

}






