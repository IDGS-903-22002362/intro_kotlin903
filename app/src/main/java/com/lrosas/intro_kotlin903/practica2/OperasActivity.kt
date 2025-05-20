package com.lrosas.intro_kotlin903.practica2

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

class OperasActivity : AppCompatActivity() {
    // cree objetos de
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var tv1: TextView
    private lateinit var button2: Button
    private lateinit var r1: RadioButton
    private lateinit var r2: RadioButton
    private lateinit var r3: RadioButton
    private lateinit var r4: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)
        // instancia
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        tv1 = findViewById(R.id.tv1)
        button2 = findViewById(R.id.button2)
        r1 = findViewById(R.id.r1)
        r2 = findViewById(R.id.r2)
        r3 = findViewById(R.id.r3)
        r4 = findViewById(R.id.r4)
        button2.setOnClickListener { calcular(it) }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calcular(view: android.view.View){
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        var res: Double

        res = 0.0
        if (edt1.text.toString().isEmpty() || edt2.text.toString().isEmpty()){
            tv1.text = "Debes ingresar los dos numeros"
        }else if (r1.isChecked){ res = num1 + num2
        }else if (r2.isChecked){ res = num1 - num2
        }else if (r3.isChecked){ res = num1 / num2
        }else if (r4.isChecked){ res = num1 * num2
        }
        tv1.text = res.toString()
    }

    }
