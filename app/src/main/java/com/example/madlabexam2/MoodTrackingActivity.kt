package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MoodTrackingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_tracking)

        val backHome = findViewById<ImageView>(R.id.homeMood)
        backHome.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}