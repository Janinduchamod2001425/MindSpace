package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val login = findViewById<Button>(R.id.btnLogout)
        login.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        val home = findViewById<ImageView>(R.id.backTOHomeButton)
        home.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val support = findViewById<ImageView>(R.id.btnSupport)
        support.setOnClickListener {
            val intent = Intent(this,SupportActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}