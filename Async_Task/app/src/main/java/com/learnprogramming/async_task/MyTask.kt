package com.learnprogramming.async_task
import android.content.Context
import android.os.AsyncTask
import android.renderscript.Sampler
import android.widget.TextView
import android.widget.Button
import android.widget.ProgressBar
import java.security.AccessControlContext

class MyTask(context: Context, button: Button, progressBar: ProgressBar, textView: TextView) : AsyncTask<Void, Int, String>()
{
    lateinit var button: Button
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView
    init {
        this.button = button
        this.progressBar = progressBar
        this.textView = textView
    }
    override fun onPreExecute() {
        super.onPreExecute()
        textView.text = "Preparing for download..."
        Thread.sleep(1000)
    }
    override fun doInBackground(vararg p0: Void?): String {
        for (i in 1..100 step 1) {
            Thread.sleep(100)
            publishProgress(i)
        }
        return "Download Completed"
    }

    override fun onProgressUpdate(vararg values: Int?) {
        var progress = values[0]
        textView.text = "$progress  % download"
        progressBar.progress = progress!!
    }

    override fun onPostExecute(result: String?) {
        textView.text = result
    }
}
