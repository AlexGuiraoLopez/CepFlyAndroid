package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import com.example.netbeans.workers.Copilot
import com.example.netbeans.workers.Pilot
import java.util.ArrayList

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
        if (Pilot.pilotCounter<Flight.MAX_PILOT)
        {
            Flight.employeeList[0].add(Pilot("Harrison", "Ford", "45854112-V", "HLK-011", "+34569954521", "05/10/1974"))
            Pilot.pilotCounter++
            Toast.makeText(this, "Añadido", Toast.LENGTH_LONG).show()
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
        if (Copilot.copilotCounter<Flight.MAX_COPILOT)
        {
            Flight.employeeList[1].add(Copilot("Cheewakka", "Cheewee", "41254741-L", true))
            Toast.makeText(this, "Añadido", Toast.LENGTH_LONG).show()
            Copilot.copilotCounter++
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
    /*
    fun assignEmployee(view: View)
    {
        var asigned = false
        var listIndex = 0
        if (Flight.employeeList[2][Flight.MAX_EMPLOYEE - 1] == null)
        {
            do {
                if (Flight.employeeList[2][listIndex] == null)
                {
                    Flight.employeeList[2][listIndex] = Employee.assistantList[listIndex]
                    asigned = true
                    Toast.makeText(this, "Añadido", Toast.LENGTH_LONG)
                    changeToAdmin()
                }
                listIndex++
            } while (!asigned)
        }
        else
        {
            Toast.makeText(this, "El numero de asistentes ya es el máximo", Toast.LENGTH_LONG)
        }
    }
    */


}