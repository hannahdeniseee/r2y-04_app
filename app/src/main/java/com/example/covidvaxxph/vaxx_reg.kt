package com.example.covidvaxxph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class vaxx_reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaxx_reg)

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

        //C Window
        val reg_stepbtnDOH = findViewById<View>(R.id.reg_stepbtnDOH)
        reg_stepbtnDOH.setOnClickListener{
            var expanded = sputnik_expanded()

            expanded.show(supportFragmentManager, "customDialog")
        }
    }
}