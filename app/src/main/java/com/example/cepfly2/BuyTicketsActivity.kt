package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import java.time.Instant

class BuyTicketsActivity : AppCompatActivity()
{
    var ticketsToBuy: Int = 0

    lateinit var tvPrice: TextView
    lateinit var tvTicketAmount : TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tickets_buy)
        tvPrice = findViewById(R.id.tv_totalPrice) as TextView
        tvTicketAmount = findViewById(R.id.tv_ticketsToBuy) as TextView
        displayTicketAmount()
        displayPrice()
        ticketsToBuy = 0
    }


    fun debug(view:View){
        println("Total amount: "+Flight.seatTotalAmount)
        println("Purchased: "+Flight.purchasedSeats)
        println("ToBuy: "+ticketsToBuy)
    }
    private fun displayTicketAmount()
    {
       tvTicketAmount.setText(ticketsToBuy.toString())
    }

    private fun displayPrice()
    {
        var price:Float
        price = (ticketsToBuy*Flight.seatPrice)
        tvPrice.setText(price.toString())
    }

    fun increaseTickets(view: View)
    {
        if (ticketsToBuy!=Flight.seatTotalAmount)
        {
            ticketsToBuy++
            displayTicketAmount()
            displayPrice()
        }
        else
        {
            Toast.makeText(this,"Máximo alcanzado", Toast.LENGTH_SHORT).show()
        }
    }

    fun decreaseTickets(view: View)
    {
        if (ticketsToBuy!=0)
        {
            ticketsToBuy--
            displayTicketAmount()
            displayPrice()
        }
        else
        {
            Toast.makeText(this,"Mínimo alcanzado", Toast.LENGTH_SHORT).show()
        }
    }

    fun buyTickets(view:View)
    {
        val intent = Intent(this,ClientActivity::class.java).apply {  }

        if((Flight.seatTotalAmount-Flight.purchasedSeats)>=ticketsToBuy)
        {
            Flight.purchasedSeats+=ticketsToBuy
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this,"Sold out",Toast.LENGTH_LONG).show()
        }

    }
}