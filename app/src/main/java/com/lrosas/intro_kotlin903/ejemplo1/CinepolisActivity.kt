package com.lrosas.intro_kotlin903.ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lrosas.intro_kotlin903.R
import java.util.Locale

class CinepolisActivity : AppCompatActivity() {
    // Creo los objetos
    private lateinit var btnCalcular: Button
    private lateinit var txtNombreComprador: EditText
    private lateinit var txtNcompradores: EditText
    private lateinit var txtNboletos: EditText
    private lateinit var rsi: RadioButton
    private lateinit var rno: RadioButton
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)
        // instancio
        btnCalcular = findViewById(R.id.btnCalcular)
        txtNombreComprador = findViewById(R.id.txtNombreComprador)
        txtNcompradores = findViewById(R.id.txtNcompradores)
        txtNboletos = findViewById(R.id.txtNboletos)
        rsi = findViewById(R.id.rsi)
        rno = findViewById(R.id.rno)
        txtResultado = findViewById(R.id.txtResultado)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnCalcular.setOnClickListener {
            val nombre = txtNombreComprador.text.toString().trim()
            val nCompradores = txtNcompradores.text.toString().toIntOrNull() ?: 0
            val nBoletos   = txtNboletos.text.toString().toIntOrNull() ?: 0

            if (nombre.isEmpty()) {
                txtResultado.text = "Ingresa el nombre del comprador."
                return@setOnClickListener
            }
            if (nCompradores <= 0) {
                txtResultado.text = "Ingresa cuántas personas compran."
                return@setOnClickListener
            }
            if (nBoletos <= 0) {
                txtResultado.text = "Ingresa cuántos boletos."
                return@setOnClickListener
            }
            if (nBoletos > 7 * nCompradores) {
                txtResultado.text = "No puedes comprar más de 7 boletos por persona."
                return@setOnClickListener
            }

            val precioUnitario = 12.0
            var total = nBoletos * precioUnitario

            val descuentoCantidad = when {
                nBoletos > 5       -> 0.15
                nBoletos in 3..5   -> 0.10
                else               -> 0.0
            }
            total -= total * descuentoCantidad

            if (rsi.isChecked) {
                val descuentoCineco = 0.10
                total -= total * descuentoCineco
            }

            val builder = StringBuilder()
            builder.appendLine("Comprador: $nombre")
            builder.appendLine("Boletos: $nBoletos")
            builder.appendLine("Descuento por cantidad: ${ (descuentoCantidad * 100).toInt() }%")
            if (rsi.isChecked) builder.appendLine("Descuento Cineco: 10%")
            builder.appendLine("TOTAL A PAGAR: \$${"%.2f".format(total)}")

            txtResultado.text = builder.toString()
        }
    }
}