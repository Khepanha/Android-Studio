package com.learnprogramming.myapplication_14phone_photo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun getImage(v: View)
    {
        var image = intent.getStringExtra("uri")
        var uri = Uri.parse(image)
        image2.setImageURI(uri);
    }
}

