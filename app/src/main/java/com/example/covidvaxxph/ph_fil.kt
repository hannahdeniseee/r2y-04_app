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
        val pfizerButton = findViewById<View>(R.id.pfizerButton)
        pfizerButton.setOnClickListener {
            var expanded = pfizer_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //AstraZeneca Window
        val astraButton = findViewById<View>(R.id.astraButton)
        astraButton.setOnClickListener {
            var expanded = astra_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Moderna Window
        val modernaButton = findViewById<View>(R.id.modernaButton)
        modernaButton.setOnClickListener {
            var expanded = moderna_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Sinovac Window
        val sinovacButton = findViewById<View>(R.id.sinovacButton)
        sinovacButton.setOnClickListener {
            var expanded = sinovac_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Sputnik Window
        val sputnikButton = findViewById<View>(R.id.sputnikButton)
        sputnikButton.setOnClickListener {
            var expanded = sputnik_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Janssen Window
        val janssenButton = findViewById<View>(R.id.janssenButton)
        janssenButton.setOnClickListener {
            var expanded = janssen_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //Novavax Window
        val novavaxButton = findViewById<View>(R.id.novavaxButton)
        novavaxButton.setOnClickListener {
            var expanded = novavax_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //BharatWindow
        val bharatButton = findViewById<View>(R.id.bharatButton)
        bharatButton.setOnClickListener {
            var expanded = bharat_expanded()

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
        if (id == R.id.user_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_info::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}
