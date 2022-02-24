package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)


        sair.setOnClickListener {
            finish()
        }

        calcular.setOnClickListener {
            val txtpeso = findViewById<EditText>(R.id.txtPeso)
            val txtaltura = findViewById<EditText>(R.id.txtAltura)
            val txtnome = findViewById<EditText>(R.id.txtNome)
            val status = findViewById<TextView>(R.id.status)
            val peso = findViewById<TextView>(R.id.peso)
            val altura = findViewById<TextView>(R.id.altura)
            val nome = findViewById<TextView>(R.id.nome)

            val calculoImc = peso /(altura * altura)

            txtpeso.text = "${peso}"



        }
    }
}