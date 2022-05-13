package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class faq_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq_fil)

        val quizButton = findViewById<ImageButton>(R.id.backButton)
        quizButton.setOnClickListener{
            val intent = Intent(this, inter_fil::class.java)
            startActivity(intent)
        }
    }
}