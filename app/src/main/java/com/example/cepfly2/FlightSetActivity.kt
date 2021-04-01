package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight

class FlightSetActivity : AppCompatActivity()
{
    lateinit var etOrigin : EditText
    lateinit var etDestiny : EditText
    lateinit var etPlaneName : EditText
    lateinit var etDuration : EditText
    lateinit var etSeatAmount : EditText
    lateinit var etSeatPrice : EditText

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flight_set)
        etOrigin = findViewById(R.id.et_origin)
        etDestiny = findViewById(R.id.et_destiny)
        etPlaneName = findViewById(R.id.et_planeName)
        etDuration = findViewById(R.id.et_duration)
        etSeatAmount = findViewById(R.id.et_seats)
        etSeatPrice = findViewById(R.id.et_seatPrice)
    }

    private fun setFlightInfo()
    {
        Flight.origin=etOrigin.text.toString()
        Flight.destiny=etDestiny.text.toString()
        Flight.planeName=etPlaneName.text.toString()
        Flight.duration=Integer.parseInt(etDuration.text.toString())
        Flight.seatTotalAmount=Integer.parseInt(etSeatAmount.text.toString())
        Flight.seatPrice=(etSeatPrice.text.toString()).toFloat()

    }

    fun changeToMainMenu(view: View)
    {
        val intent = Intent(this, MainActivity::class.java).apply {  }
        setFlightInfo()
        startActivity(intent)
    }
}