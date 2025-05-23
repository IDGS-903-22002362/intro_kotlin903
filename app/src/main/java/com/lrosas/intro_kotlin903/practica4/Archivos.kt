package com.lrosas.intro_kotlin903.practica4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lrosas.intro_kotlin903.R
import java.io.FileNotFoundException

class Archivos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_archivos)

        val btnGuardar  = findViewById<Button>(R.id.saveButton)
        val btnLeer     = findViewById<Button>(R.id.readButton)
        val btnBorrar   = findViewById<Button>(R.id.btnBorrar)
        val inputText   = findViewById<EditText>(R.id.inputText)
        val outputText  = findViewById<TextView>(R.id.outputText)

        btnGuardar.setOnClickListener {
            val texto = inputText.text.toString() + "\n"
            try {
                openFileOutput("datos.txt", MODE_APPEND).use { stream ->
                    stream.write(texto.toByteArray())
                }
                inputText.text.clear()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnLeer.setOnClickListener {
            try {
                val contenido = openFileInput("datos.txt")
                    .bufferedReader()
                    .use { it.readText() }
                outputText.text = contenido
            } catch (e: java.io.FileNotFoundException) {
                outputText.text = "No hay datos guardados, archivo no encontrado"
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnBorrar.setOnClickListener {
            deleteFile("datos.txt")
            outputText.text = ""
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val sys = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sys.left, sys.top, sys.right, sys.bottom)
            insets
        }
    }
}