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

class user_guide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_guide)

        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)
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
            Toast.makeText(this, item.title.toString(),Toast.LENGTH_LONG).show()
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton){
            Toast.makeText(this, item.title.toString(),Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_info::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}