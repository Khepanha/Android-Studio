package com.learnprogramming.mp3_player

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var pos = 0
var start:Boolean = true
var index:Int = 0
var vol:Int = 0
class MainActivity : AppCompatActivity() {
    private lateinit var mp:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var songArray = resources.getStringArray(R.array.Song)
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,songArray)

    }
   fun b()
   {
       mp = MediaPlayer.create(this, R.raw.beautiful_in_while)
       mp.start()
   }
    fun p()
    {
        mp = MediaPlayer.create(this, R.raw.passenger)
        mp.start()
    }
    fun c ()
    {
        mp = MediaPlayer.create(this, R.raw.chinese)
        mp.start()
    }
    fun e()
    {
        mp = MediaPlayer.create(this, R.raw.endless_love)
    }
    fun w()
    {
        mp = MediaPlayer.create(this, R.raw.waiting_for_you)
    }

    fun play(i:Int)
    {
        when (i)
        {
            0 -> { b() }
            1 -> { p() }
            2 -> { c() }
            3 -> { e() }
            4 -> { w() }
        }
    }

    fun pause(v:View)
    {
        if (mp.isPlaying())
        {
            pos = mp.currentPosition
            mp.pause()
        }
        pause.isEnabled = false
        play.isEnabled = true
    }
    fun play1()
    {
        if (start == true)
        {
            start = false
            play(index)
        }
        else
        {
            mp.pause()
            play(index)
            pause.isEnabled = true
        }
    }
    fun prev()
    {
        if (index > 0 )
        {
            index -= 1
            mp.pause()
            play(index)
        }
        else
        {
            index = 4
            if (mp.isPlaying)
            {
                mp.pause()
                play(index)
            }
        }
    }
    fun next()
    {
        if (index < 4)
        {
            index += 1
            if ( mp.isPlaying)
            {
                mp.pause()
                play(index)
            }
        }
        else
        {
            index = 0
            if(mp.isPlaying)
            {
                mp.pause()
                play(index)
            }
        }
    }
}
