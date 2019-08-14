package com.learnprogramming.select_bar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var seekBarColor = 0
        var redColor = 0
        var greenColor = 0
        var blueColor = 0

        seekBar.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255
        class InnerClass: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id){
                    R.id.seekBar ->{
                       seekBarColor = p1
                    }
                    R.id.red ->{
                       redColor = p1
                    }
                    R.id.green ->{
                       greenColor = p1
                    }
                    R.id.blue->{
                        blueColor = p1
                    }
                }
                var color = Color.argb(seekBarColor, redColor, greenColor,blueColor)
                page.setBackgroundColor(color)
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }
        var listener = InnerClass()

        seekBar.setOnSeekBarChangeListener(listener)
        red.setOnSeekBarChangeListener(listener)
        green.setOnSeekBarChangeListener(listener)
        blue.setOnSeekBarChangeListener(listener)
//        seekBar.max = 200
//        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
//                tv.text = "Current position is $p1"
//            }
//            override fun onStartTrackingTouch(p0: SeekBar?) {
//                tv.text = "********** SeekBar touched **********"
//            }
//            override fun onStopTrackingTouch(p0: SeekBar?) {
//                tv.text = "*********** Final value ************"
//            }
//        })
    }
}
