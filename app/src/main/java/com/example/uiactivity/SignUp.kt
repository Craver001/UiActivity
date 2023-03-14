package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    lateinit var btnSignUp: Button
    lateinit var btnLogin: Button
    lateinit var backButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignUp=findViewById(R.id.signUp)
        btnSignUp.setOnClickListener(){
            val intent = Intent(this@SignUp,FinalStep::class.java)
            startActivity(intent)
        }

        btnLogin=findViewById(R.id.login)
        btnLogin.setOnClickListener(){
            val intent = Intent(this@SignUp,Login::class.java)
            startActivity(intent)
        }

        backButton=findViewById(R.id.back_SignUp)
        backButton.setOnClickListener{
            val intent = Intent(this@SignUp,Welcome::class.java)
            startActivity(intent)
        }
    }
}