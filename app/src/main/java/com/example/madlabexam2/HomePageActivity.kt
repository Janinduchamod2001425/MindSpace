package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //Meditate Page
        val meditateBtn = findViewById<ImageButton>(R.id.btnMeditate)
        meditateBtn.setOnClickListener {
            val intent = Intent(this,MeditateActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Tips Page
        val tipsBtn = findViewById<ImageButton>(R.id.btnTips)
        tipsBtn.setOnClickListener {
            val intent = Intent(this,ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Goals Page
        val goalsBtn = findViewById<ImageButton>(R.id.btnGoals)
        goalsBtn.setOnClickListener {
            val intent = Intent(this,GoalsActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Profile Page
        val profileBtn = findViewById<ImageButton>(R.id.btnProfile)
        profileBtn.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Settings Page
        val settings = findViewById<ImageButton>(R.id.btnSettings)
        settings.setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Scroll_View Navigation

        val moodTracking = findViewById<ImageView>(R.id.moodTrack)
        moodTracking.setOnClickListener {
            val intent = Intent(this,MoodTrackingActivity::class.java)
            startActivity(intent)
            finish()
        }

        val journal = findViewById<ImageView>(R.id.journaling)
        journal.setOnClickListener {
            val intent = Intent(this,JournalingActivity::class.java)
            startActivity(intent)
            finish()
        }

        val music = findViewById<ImageView>(R.id.relaxMusic)
        music.setOnClickListener {
            val intent = Intent(this,MusicActivity::class.java)
            startActivity(intent)
            finish()
        }

        val meditate = findViewById<ImageView>(R.id.meditation)
        meditate.setOnClickListener {
            val intent = Intent(this,MeditateActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}