package com.example.el_mejorcito_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val duracion = 3000

        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val intent = Intent(this, LoginMain2Activity::class.java)
            startActivity(intent)
            finish()
        }, duracion.toLong())
    }
}