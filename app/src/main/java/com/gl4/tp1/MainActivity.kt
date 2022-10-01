package com.gl4.tp1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPassword : EditText
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEmail = findViewById(R.id.email)
        var email = txtEmail.text.toString()
        txtPassword = findViewById(R.id.password)
        var password = txtPassword.text.toString()
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener { view ->
            val duration = Toast.LENGTH_SHORT
            Log.v(password,email)
            email = txtEmail.text.toString()
            password = txtPassword.text.toString()
            if(! email.equals("gl4@insat.tn") || !password.equals("insat2022")){
                var toastText = "email ou mot de passe incorrecte"

                Toast.makeText(this, toastText, duration).show()


            } else {
                var toastText = "bon couple login/mdp"


                Toast.makeText(this, toastText, duration).show()

                val intent = Intent(view.context,WelcomeActivity::class.java)
                intent.putExtra("email",email)
                startActivity(intent)



            }

        }



    }



}