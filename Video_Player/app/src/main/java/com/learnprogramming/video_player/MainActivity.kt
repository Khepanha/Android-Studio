package com.learnprogramming.video_player

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var position = 0
    var mediaControls: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (mediaControls == null)
        {
            mediaControls = MediaController(this@MainActivity)
        }
        try {
            videoView.setMediaController(mediaControls)
            videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/"  + R.raw.passenger))
        }catch (e: Exception)
        {
            Log.e("Error", e.message)
        }
        videoView.setOnPreparedListener {
            videoView.start()
            if (position == 0)
            {
                videoView.start()
            }
            else
            {
                videoView.pause()
            }
        }
        val button = findViewById<View>(R.id.submit) as Button
    }
}
