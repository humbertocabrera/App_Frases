package com.example.app_frases;

import android.app.Activity;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class activity_segunda : AppCompatActivity() {
    private var cambioIcono: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        // para obtener informacion de otro lado usamos el intent con esta funcion dependiendo el tipo de dato
        val fraseRecibida = intent.getStringExtra("frase")
        val edad = intent.getIntExtra("edad", 0)

        Log.d("DATOS", "Datos recibidos con exito fueron frase $fraseRecibida y $edad")

        val bnAbrirPantalla = findViewById<Button>(R.id.bnMasInfo)
        //var ivLogo = findViewById<ImageView>(R.id.ivLogo)

        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        val bnRegresar = findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener { finish() }
    }
}
