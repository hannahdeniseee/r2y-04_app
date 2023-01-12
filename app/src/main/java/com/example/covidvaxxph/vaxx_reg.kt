package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.Toolbar//

class vaxx_reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaxx_reg)
        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)

        //A Window
        val reg_stepbtnA = findViewById<View>(R.id.reg_stepbtnA)
        reg_stepbtnA.setOnClickListener{
            var expanded = pfizer_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //B Window
        val reg_stepbtnB = findViewById<View>(R.id.reg_stepbtnB)
        reg_stepbtnB.setOnClickListener{
            var expanded = astra_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //C Window
        val reg_stepbtnC = findViewById<View>(R.id.reg_stepbtnC)
        reg_stepbtnC.setOnClickListener{
            var expanded = moderna_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }

        //DOH Window
        val reg_stepbtnDOH = findViewById<View>(R.id.reg_stepbtnDOH)
        reg_stepbtnDOH.setOnClickListener{
            var expanded = sputnik_expanded()

            expanded.show(supportFragmentManager, "customDialog")
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