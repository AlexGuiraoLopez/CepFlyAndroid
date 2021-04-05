package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ClientActivity : AppCompatActivity()
{
    //Intento de onClick manual con botón
    lateinit var btnBuyMenu : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_menu)
        btnBuyMenu = findViewById(R.id.btn_buyMenu) as Button
    }

    fun changeToBuy(view: View)
    {
        val intent = Intent(this,BuyTicketsActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun changeToFlightInfo(view: View)
    {
        val intent = Intent(this,FlightShowActivity::class.java).apply {  }
        startActivity(intent)
    }
}