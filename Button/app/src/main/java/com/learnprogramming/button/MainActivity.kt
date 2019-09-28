package com.learnprogramming.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var  order = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener(){
//            var selRadio =group.checkedRadioButtonId
//            when (selRadio){
//                R.id.m ->{
//                    Toast.makeText(this, "You are a male", Toast.LENGTH_LONG).show()
//                }
//                R.id.f ->{
//                    Toast.makeText(this, "You are female", Toast.LENGTH_LONG).show()
//                }
//            }
            order = "Your order\n*******\n"
            if (Football.isChecked)
            {
                order = "Football\n"
            }
            if (BasketBall.isChecked)
            {
                order = "Basket Ball\n"
            }
            if (Tennis.isChecked)
            {
                order = "Tennis\n"
            }
        }
    }
}
