package com.example.el_mejorcito_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginMain2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main2)



        val GoInvitado = findViewById<TextView>(R.id.Invitadotxt)

        GoInvitado.setOnClickListener {
        }

        val GoRegistrar = findViewById<TextView>(R.id.Nocuentatxt)

        GoRegistrar.setOnClickListener {
            val intent = Intent(this,RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}