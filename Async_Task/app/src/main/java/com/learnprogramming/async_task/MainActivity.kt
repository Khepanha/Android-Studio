package com.learnprogramming.async_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun downloadFile(v:View)
    {
        when (v.id)
        {
            R.id.button -> Toast.makeText(this,"Start Downloading",Toast.LENGTH_LONG).show()
        }
        var MyTask = MyTask(this@MainActivity,button,progressBar,status)
        MyTask.execute()
    }
}
