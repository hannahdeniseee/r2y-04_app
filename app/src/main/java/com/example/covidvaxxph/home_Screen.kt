package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class home_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        //ImageButton imageButton1 = (ImageButton) findViewById(R.Id.imageButton1)
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        imageButton1.setOnClickListener{
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton2.setOnClickListener{
            val intent = Intent(this, vaxx_info::class.java)
            startActivity(intent)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener{
            val intent = Intent(this, vaxx_ph::class.java)
            startActivity(intent)
        }
        
            
    }


}