package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import com.example.netbeans.workers.Copilot
import com.example.netbeans.workers.Employee
import com.example.netbeans.workers.Pilot

class NewEmployeeActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_employee)
    }

    private fun changeToAdmin()
    {
        val intent = Intent(this, AdminActivity::class.java).apply {  }
        startActivity(intent)
    }

    /**
     * Da de alta un piloto.
     */
    fun assignPilot(view: View)
    {
        if (Pilot.pilotCount<Flight.MAX_PILOT)
        {
            Flight.employeeList[0].add(Pilot("Harrison", "Ford", "45854112-V", "HLK-011", "+34569954521", "05/10/1974"))
            Pilot.pilotCount++
            Toast.makeText(this, "Piloto añadido", Toast.LENGTH_LONG).show()
            changeToAdmin()
        }
        else
        {
            Toast.makeText(this, "Pilotos al máximo", Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * Da de alta un Copiloto.
     */
    fun assignCopilot(view: View)
    {
        if (Copilot.copilotCount<Flight.MAX_COPILOT)
        {
            Flight.employeeList[1].add(Copilot("Cheewakka", "Cheewee", "41254741-L", true))
            Toast.makeText(this, "Copiloto añadido", Toast.LENGTH_LONG).show()
            Copilot.copilotCount++
            changeToAdmin()
        }
        else
        {
            Toast.makeText(this, "Copilotos al máximo", Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * Da de alta un asistente.
     */
    fun assignEmployee(view: View)
    {
        if (Employee.employeeCount<Flight.MAX_EMPLOYEE)
        {
            Flight.employeeList[2].add(Employee.assistantList[Employee.employeeCount])
            Employee.employeeCount++
            Toast.makeText(this, "Asistente añadido", Toast.LENGTH_SHORT).show()
            changeToAdmin()
        }
        else
        {
            Toast.makeText(this, "Asistentes máximo", Toast.LENGTH_LONG).show()
        }
    }



}