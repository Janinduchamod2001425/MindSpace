package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val login = findViewById<Button>(R.id.btnSignIn)
        login.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val register = findViewById<Button>(R.id.btnSignUp)
        register.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}