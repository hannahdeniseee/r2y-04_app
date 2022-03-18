package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class interactive_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interactive_page)


        val quizButton = findViewById<ImageButton>(R.id.quizButton)
        quizButton.setOnClickListener{
            val intent = Intent(this, quiz::class.java)
            startActivity(intent)
        }

        val faqButton = findViewById<ImageButton>(R.id.faqButton)
        faqButton.setOnClickListener{
            val intent = Intent(this, faqs::class.java)
            startActivity(intent)
        }

        val pollsButton = findViewById<ImageButton>(R.id.pollsButton)
        pollsButton.setOnClickListener{
            val intent = Intent(this, polls::class.java)
            startActivity(intent)
        }
    }
}