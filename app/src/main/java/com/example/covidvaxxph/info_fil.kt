package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import android.widget.Toast as Toast1

class info_fil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaxx_info)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.fil_how1))
        imageList.add(SlideModel(R.drawable.fil_how2))
        imageList.add(SlideModel(R.drawable.fil_how3))
        imageList.add(SlideModel(R.drawable.fil_how4))
        imageList.add(SlideModel(R.drawable.fil_type1))
        imageList.add(SlideModel(R.drawable.fil_type2))
        imageList.add(SlideModel(R.drawable.fil_type3))
        imageList.add(SlideModel(R.drawable.fil_type4))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        //Toolbar toolbar = findViewById(R.id.toolbar)
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
            Toast1.makeText(this, item.title.toString(), Toast1.LENGTH_LONG).show()
            val intent = Intent(this, fil_home::class.java)
            startActivity(intent)
        }

        if (id == R.id.inter_navbutton) {
            Toast1.makeText(this, item.title.toString(), Toast1.LENGTH_LONG).show()
            val intent = Intent(this, inter_fil::class.java)
            startActivity(intent)
        }
        if (id == R.id.ph_navbutton) {
            Toast1.makeText(this, item.title.toString(), Toast1.LENGTH_LONG).show()
            val intent = Intent(this, ph_fil::class.java)
            startActivity(intent)
        }
        if (id == R.id.user_navbutton){
            Toast1.makeText(this, item.title.toString(), Toast1.LENGTH_LONG).show()
            val intent = Intent(this, user_fil::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton){
            Toast1.makeText(this, item.title.toString(), Toast1.LENGTH_LONG).show()
            val intent = Intent(this, info_fil::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}