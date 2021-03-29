package com.example.cepfly2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.netbeans.workers.Pilot

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun changeToStart(view:View)
    {
        val intent = Intent(this, StartActivity::class.java).apply {  }
        startActivity(intent)
    }
}