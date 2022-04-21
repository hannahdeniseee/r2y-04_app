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

class interactive_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interactive_page)
        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)

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

        val ffButton = findViewById<ImageButton>(R.id.funFactsButton)
        ffButton.setOnClickListener{
            val intent = Intent(this, funfacts::class.java)
            startActivity(intent)
        }

        val fcButton = findViewById<ImageButton>(R.id.checkButton)
        fcButton.setOnClickListener{
            val intent = Intent(this, factcheck_new::class.java)
            startActivity(intent)
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
            val intent = Intent(this, home_Screen::class.java)
            startActivity(intent)
        }

        if (id == R.id.inter_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, interactive_page::class.java)
            startActivity(intent)
        }
        if (id == R.id.ph_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_ph::class.java)
            startActivity(intent)
        }
        if (id == R.id.user_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_info::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}