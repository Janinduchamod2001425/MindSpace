package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val editProfileSection = findViewById<ImageView>(R.id.editProfile)
        editProfileSection.setOnClickListener {
            val intent = Intent(this,EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val backToHome = findViewById<ImageView>(R.id.btnProfileHome)
        backToHome.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}