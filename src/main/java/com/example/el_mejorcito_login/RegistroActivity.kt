package com.example.el_mejorcito_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnRegistrado = findViewById<Button>(R.id.btnGuardar)

        val nombre = findViewById<EditText>(R.id.NombreRegistrotxt)
        val apellidos = findViewById<EditText>(R.id.apellidoRegistrotxt)
        val contra = findViewById<EditText>(R.id.passRegistro)
         val contraDeNuevo = findViewById<EditText>(R.id.passDenuevoRegistro)

        btnRegistrado.setOnClickListener{
            val userName = nombre.text.toString()
            val lastName = apellidos.text.toString()
            val password = contra.text.toString()
            val passAgain = contraDeNuevo.text.toString()


            if(userName.isEmpty()){
            }


            val intent = Intent(this,LoginMain2Activity::class.java)
            startActivity(intent)

        }
    }
}