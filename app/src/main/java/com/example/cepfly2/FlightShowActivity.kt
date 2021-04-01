package com.example.cepfly2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight

class FlightShowActivity : AppCompatActivity()
{
    lateinit var tvOrigin : TextView
    lateinit var tvDestiny : TextView
    lateinit var tvPlaneName : TextView
    lateinit var tvDuration : TextView
    lateinit var tvSeatAmount : TextView
    lateinit var tvSeatPrice : TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flight_show)
        tvOrigin = findViewById(R.id.tv_origin) as TextView
        tvDestiny = findViewById(R.id.tv_destiny) as TextView
        tvPlaneName = findViewById(R.id.tv_planeName) as TextView
        tvDuration = findViewById(R.id.tv_duration) as TextView
        tvSeatAmount = findViewById(R.id.tv_seatAmount) as TextView
        tvSeatPrice = findViewById(R.id.tv_seatPrice) as TextView
        displayFlightInfo()
    }

    private fun displayFlightInfo()
    {
        tvOrigin.setText("Origen: "+Flight.origin)
        tvDestiny.setText("Destino: "+Flight.destiny)
        tvPlaneName.setText("Nombre de avión: "+Flight.planeName)
        tvDuration.setText("Duración: "+Flight.duration)
        tvSeatAmount.setText("Total asientos: "+Flight.seatTotalAmount)
        tvSeatPrice.setText("Precio asiento: "+Flight.seatPrice)
    }

}