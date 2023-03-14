package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {

    lateinit var backButton: Button
    lateinit var login: Button
    lateinit var signUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login =findViewById(R.id.logIn)
        signUp =findViewById(R.id.signUp)
        backButton =findViewById(R.id.back_login)


        login.setOnClickListener(){
            val intent = Intent(this,FinalStep::class.java)
            startActivity(intent)
        }

        signUp.setOnClickListener(){
            val intent =Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener{
            val intent = Intent(this,Welcome::class.java)
            startActivity(intent)
        }
    }
}