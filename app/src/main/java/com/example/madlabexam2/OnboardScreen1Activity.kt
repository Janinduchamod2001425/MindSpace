package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen1)

        val nextButton = findViewById<Button>(R.id.btnNext)
        nextButton.setOnClickListener {
            val intent = Intent(this,OnboardScreen2Activity::class.java)
            startActivity(intent)
            finish()
        }

        val skipButton = findViewById<Button>(R.id.btnSkip)
        skipButton.setOnClickListener {
            val intent = Intent(this,IntroActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}