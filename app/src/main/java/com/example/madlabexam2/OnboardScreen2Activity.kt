package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        val next2Button = findViewById<Button>(R.id.btn2Next)
        next2Button.setOnClickListener {
            val intent = Intent(this,IntroActivity::class.java)
            startActivity(intent)
            finish()
        }

        val skip2Button = findViewById<Button>(R.id.btn2Skip)
        skip2Button.setOnClickListener {
            val intent = Intent(this,IntroActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}