package com.example.yamen.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener {
            try {
                val yearOB = txtYOB.text.toString().toInt()
                when(yearOB){
                    in 1900..2018 -> {
                        val my_age = Calendar.getInstance().get(Calendar.YEAR) - yearOB
                        txtAgeOut.text=my_age.toString()
                    }
                    else -> txtAgeOut.text="kosomak".capitalize()
                }
            }catch (ex:Exception){
                txtAgeOut.text="Kosomak"
            }


        }
    }
}
