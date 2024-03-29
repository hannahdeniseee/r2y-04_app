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

class inter_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inter_fil)

        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)

        val quizButton = findViewById<ImageButton>(R.id.quizButton)
        quizButton.setOnClickListener{
            val intent = Intent(this, quiz::class.java)
            startActivity(intent)
        }

        val faqButton = findViewById<ImageButton>(R.id.faqButton)
        faqButton.setOnClickListener{
            val intent = Intent(this, faq_fil::class.java)
            startActivity(intent)
        }

        val pollsButton = findViewById<ImageButton>(R.id.funFactsButton)
        pollsButton.setOnClickListener{
            val intent = Intent(this, funfacts_fil::class.java)
            startActivity(intent)
        }

        val checkButton = findViewById<ImageButton>(R.id.checkButton)
        checkButton.setOnClickListener{
            val intent = Intent(this, factcheck_fil::class.java)
            startActivity(intent)
        }

        val MDButton = findViewById<ImageButton>(R.id.doc_says_btn)
        MDButton.setOnClickListener{
            val intent = Intent(this, docsays_fil::class.java)
            startActivity(intent)//
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if (id == R.id.home_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, fil_home::class.java)
            startActivity(intent)
        }

        if (id == R.id.inter_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, inter_fil::class.java)
            startActivity(intent)
        }
        if (id == R.id.ph_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, ph_fil::class.java)
            startActivity(intent)
        }
        if (id == R.id.user_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, user_fil::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, info_fil::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}