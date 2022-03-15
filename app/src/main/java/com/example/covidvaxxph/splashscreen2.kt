package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen2 : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen2)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, splashscreen3::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
            finish()
        },1000)
    }
}