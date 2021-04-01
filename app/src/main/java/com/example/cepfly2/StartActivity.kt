package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
    }

    fun changeToFlightSet(view: View)
    {
        val intent = Intent(this, FlightSetActivity::class.java).apply {  }
        startActivity(intent)
    }
}