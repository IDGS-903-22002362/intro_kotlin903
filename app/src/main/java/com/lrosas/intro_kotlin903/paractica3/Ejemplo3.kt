package com.lrosas.intro_kotlin903.paractica3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lrosas.intro_kotlin903.R

class Ejemplo3 : AppCompatActivity() {
    private lateinit var tv1 : TextView
    private lateinit var edt1: EditText
    private lateinit var button: Button
    private var numero: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo3)
        edt1=findViewById(R.id.ed1)
        numero=(Math.random() * 100001).toInt()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun controlar(view: android.view.View){
            val valorIngresado:String=edt1.text.toString()
            val valor=valorIngresado.toInt()
            if(valor==numero){
                val notificacion=Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT)}
            else{
                val notificacion=Toast.makeText(this,"Perdiste",Toast.LENGTH_SHORT)
            }
        }
    }
}