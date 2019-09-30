package com.learnprogramming.myapplication_14phone_photo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun imageSelect(v:View)
    {
        var  i = Intent(Intent.ACTION_PICK)
        i.type = "image/*"
        startActivityForResult(i,1)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
        if (resultCode == Activity.RESULT_OK)
        {
            if (requestCode == 1)
            {
                var selectImage = data?.data
                imageView.setImageURI(selectImage)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
        val intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("uri",imageSelect(imageView).toString())
    }

}
