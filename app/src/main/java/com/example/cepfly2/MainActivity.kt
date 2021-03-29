package com.example.cepfly2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.netbeans.workers.Pilot


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printToast(view: View)
    {
        Toast.makeText(this, Pilot.pilotList[0].reference,Toast.LENGTH_SHORT).show()
        println("itsme")
    }
}