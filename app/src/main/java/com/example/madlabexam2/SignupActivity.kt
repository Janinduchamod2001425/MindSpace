package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val google = findViewById<Button>(R.id.btnGoogle)
        google.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val apple = findViewById<Button>(R.id.btnApple)
        apple.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val facebook = findViewById<Button>(R.id.btnFacebook)
        facebook.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val login = findViewById<Button>(R.id.btnLogin)
        login.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}