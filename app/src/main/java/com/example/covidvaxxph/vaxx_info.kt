package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class vaxx_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaxx_info)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/vaxx_info1.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/vaxx_info2.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/vaxx_info3.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/vaxx_info4.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/type_1.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/type_2.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/type_3.png?raw=true", title = null ))
        imageList.add(SlideModel(imageUrl = "https://github.com/hannahdeniseee/r2y-04_app/blob/master/app/src/main/res/drawable/type_4.png?raw=true", title = null ))

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