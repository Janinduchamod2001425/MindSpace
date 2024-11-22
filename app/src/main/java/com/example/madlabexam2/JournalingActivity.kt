package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class JournalingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journaling)

        val backHome = findViewById<ImageView>(R.id.jHomeButton)
        backHome.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        saveBtn.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}