package com.gl4.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    lateinit var welcomeTxt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val email = intent.getStringExtra("email")
        welcomeTxt = findViewById(R.id.txtWelcome)
        welcomeTxt.text = "Bienvenue $email"
    }
}