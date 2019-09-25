package com.learnprogramming.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
//            var username = editText.text.toString()
//            textView.text = username


//            var year = editText.text.toString().toInt()
//            var C_year = Calendar.getInstance().get(Calendar.YEAR)

//            var age = C_year - year
//            textView.text = "Your age is: $age"

            var date = editText.text.toString()
            var day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            var month = Calendar.getInstance().get(Calendar.MONTH)
            var year = Calendar.getInstance().get(Calendar.YEAR)
            var arr = date.split("/")
            var dm = intArrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
            var bd=arr[0].toInt()
            var bm=arr[1].toInt()
            var by=arr[2].toInt()
            if (bd > day)
            {
                month -=1
                day += dm[bm -1]
            }
            if (bm > month)
            {
               year-=1
                month +=12
            }
                val urday = day -bd
                val urmonth = month - bm
                val urold = year - by

            var age = ("Your day: $urday Your month:$urmonth Your old:$urold")
            textView.text = age
            println(age)
        }
    }
}
