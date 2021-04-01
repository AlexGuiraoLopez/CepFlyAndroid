package com.example.cepfly2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeToLogin(view:View)
    {
        val intent = Intent(this, LoginActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun changeToClient(view:View)
    {
        val intent = Intent(this, ClientActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun changeToStart(view:View)
    {
        val intent = Intent(this, StartActivity::class.java).apply {  }
        startActivity(intent)
    }
}