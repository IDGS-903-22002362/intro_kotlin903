package com.lrosas.intro_kotlin903.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lrosas.intro_kotlin903.MenuActivity
import com.lrosas.intro_kotlin903.R

class saludoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)
        val btnStart = findViewById<Button>(R.id.btnStart)
        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        btnStart.setOnClickListener {
            if (edtNombre.text.toString().isEmpty()) {
                Toast.makeText(this, "Debes ingresar tu nombre", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MenuActivity::class.java)
                intent.putExtra("nombre", edtNombre.text.toString())
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}