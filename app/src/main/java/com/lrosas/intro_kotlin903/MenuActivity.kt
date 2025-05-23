package com.lrosas.intro_kotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lrosas.intro_kotlin903.ejemplo1.CinepolisActivity
import com.lrosas.intro_kotlin903.paractica3.Ejemplo3
import com.lrosas.intro_kotlin903.practica1.saludoActivity
import com.lrosas.intro_kotlin903.practica2.OperasActivity
import com.lrosas.intro_kotlin903.practica4.Archivos

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnEjemplo3 = findViewById<Button>(R.id.btn2)
        btnEjemplo3.setOnClickListener {navegateToEjemplo3() }
        btnSaludo.setOnClickListener {navegateToSaludar() }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSaludar() {
        val intent = Intent(this, saludoActivity::class.java)

        startActivity(intent)
    }
    private fun navegateToEjemplo3() {
        val intent = Intent(this, Archivos::class.java)
        startActivity(intent)
    }
}