package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen5 : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen5)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, eng_fil::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
            finish()
        },1000)
    }
}