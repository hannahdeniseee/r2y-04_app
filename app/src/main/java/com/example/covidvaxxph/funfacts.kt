package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class funfacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funfacts)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener{
            val intent = Intent(this, interactive_page::class.java)
            startActivity(intent)
        }
    }
}