package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class ph_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ph_fil)
        val pfizerFilButton = findViewById<View>(R.id.pfizerFilButton)
        pfizerFilButton.setOnClickListener {
            var expanded = pfizer_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //AstraZeneca Window
        val astraFilButton = findViewById<View>(R.id.astraFilButton)
        astraFilButton.setOnClickListener {
            var expanded = astra_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Moderna Window
        val modernaFilButton = findViewById<View>(R.id.modernaFilButton)
        modernaFilButton.setOnClickListener {
            var expanded = moderna_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Sinovac Window
        val sinovacFilButton = findViewById<View>(R.id.sinovacFilButton)
        sinovacFilButton.setOnClickListener {
            var expanded = sinovac_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Sputnik Window
        val sputnikFilButton = findViewById<View>(R.id.sputnikFilButton)
        sputnikFilButton.setOnClickListener {
            var expanded = sputnik_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Janssen Window
        val janssenFilButton = findViewById<View>(R.id.janssenFilButton)
        janssenFilButton.setOnClickListener {
            var expanded = janssen_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Novavax Window
        val novavaxFilButton = findViewById<View>(R.id.novavaxFilButton)
        novavaxFilButton.setOnClickListener {
            var expanded = novavax_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //BharatWindow
        val bharatFilButton = findViewById<View>(R.id.bharatFilButton)
        bharatFilButton.setOnClickListener {
            var expanded = bharat_fil_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Toolbar toolbar = findViewById(R.id.toolbar)
        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
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
