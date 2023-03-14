package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    lateinit var btnSignUp: Button
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutpage2)

        btnSignUp= findViewById(R.id.btn_signUp)
        btnSignUp.setOnClickListener(){
            val intent = Intent(this@Welcome,SignUp::class.java)
            startActivity(intent)

        }

        btnLogin=findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(){
            val intent = Intent(this@Welcome,Login::class.java)
            startActivity(intent)
        }
    }
}