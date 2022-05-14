package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class funfacts_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funfacts_fil)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener{
            val intent = Intent(this, inter_fil::class.java)
            startActivity(intent)
        }
    }
}