package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class fil_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fil_home)

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        imageButton1.setOnClickListener{
            val intent = Intent(this, user_fil::class.java)
            startActivity(intent)
        }

        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton2.setOnClickListener{
            val intent = Intent(this, info_fil::class.java)
            startActivity(intent)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener{
            val intent = Intent(this, ph_fil::class.java)
            startActivity(intent)
        }

        val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener{
            val intent = Intent(this,inter_fil::class.java)
            startActivity(intent)
        }



    }


}