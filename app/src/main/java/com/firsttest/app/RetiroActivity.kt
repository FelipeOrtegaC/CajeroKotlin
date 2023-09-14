package com.firsttest.app
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

    class retiroActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_retiro)
       var  Retiro = findViewById<Button>(R.id.botonGuardarSacar)
       val montoRetiro = findViewById<EditText>(R.id.editTextNumber)
       val montoRetiroStr = montoRetiro.text.toString()
       val monto:Double = try {
           montoRetiroStr.toDouble()
       } catch (e: NumberFormatException) {
           0.0
       }

       var txtBalanceRetiro = findViewById<TextView>(R.id.txtBalanceRetiro)
       var saldo = 0.0
       saldo = intent.getDoubleExtra("saldo_extra", 0.0)
       Retiro.setOnClickListener { retirarMonto(saldo, monto, txtBalanceRetiro) }

   }
        private fun retirarMonto(saldo:Double, monto:Double, txtBalanceRetiro:TextView) {
            var saldoActual = saldo
            if (monto <= saldoActual) {
                saldoActual -= monto
                txtBalanceRetiro.text = "El saldo restante es: $saldoActual"
                actualizarSaldo()

            } else {
                txtBalanceRetiro.text = "El saldo a retirar no esta disponible"
            }
        }

        private fun actualizarSaldo(){
            val mainActivity = Intent(this, MainActivity::class.java)
            mainActivity.actualizarSaldo()
        }
}

private fun Intent.actualizarSaldo() {
    TODO("Not yet implemented")
}

/*
       val fecha = obtenerFechaActual()
       historial.add("Retirado: -$montoRetiro el $fecha")
       actualizarHistorial()
*/