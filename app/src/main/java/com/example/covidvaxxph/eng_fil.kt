package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class eng_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_fil)

        val eng_button = findViewById<ImageButton>(R.id.eng_button)
        eng_button.setOnClickListener{
            val intent = Intent(this, home_Screen::class.java)
            startActivity(intent)
            engFilCounter.counter = "english"
        }

        val fil_button = findViewById<ImageButton>(R.id.fil_button)
        fil_button.setOnClickListener{
            val intent = Intent(this, fil_home::class.java)
            startActivity(intent)
            engFilCounter.counter = "filipino"
        }
    }

}