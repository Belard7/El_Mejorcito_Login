package com.example.el_mejorcito_login

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

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
                showAlertDialog("Campo requerido", "Por favor, ingrese su nombre de usuario.")
                return@setOnClickListener
            }

            if (!userName.matches("[a-zA-Z]+".toRegex())) {
                showAlertDialog("Formato incorrecto", "El campo de nombre solo debe contener letras.")
                return@setOnClickListener
            }

            if (lastName.isEmpty()){
                showAlertDialog("Campo requerido","por favor , ingrese su apellido"
                )
                return@setOnClickListener
            }

            if (!lastName.matches("[a-zA-Z]+".toRegex())) {
                showAlertDialog("Formato incorrecto", "El campo de nombre solo debe contener letras.")
                return@setOnClickListener
            }

            if (password.isEmpty()){
                showAlertDialog("campo requerido", "por favor, ingrese una contraseña")
                return@setOnClickListener
            }

            if (passAgain.isEmpty()) {
                showAlertDialog("campo requerido", "por favor, ingrese nuevamete su contraseña")
                return@setOnClickListener
            }

            else
            {
                val intent = Intent(this,LoginMain2Activity::class.java)
                startActivity(intent)
            }




        }


    }

    private fun showAlertDialog(tittle: String, message: String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle(title)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialog, _ ->
            dialog.dismiss()
        })

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }


}
