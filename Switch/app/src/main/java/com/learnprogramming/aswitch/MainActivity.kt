package com.learnprogramming.aswitch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                page1.setBackgroundColor(Color.GRAY)
            }
            else{
                page1.setBackgroundColor(Color.WHITE)
            }
        }
    }
}
