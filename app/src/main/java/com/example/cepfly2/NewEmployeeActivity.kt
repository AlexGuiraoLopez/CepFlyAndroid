package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import com.example.netbeans.visualfront.ConsoleColors
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
        val intent = Intent(this,AdminActivity::class.java).apply {  }
        startActivity(intent)
    }

    /**
     * Da de alta un piloto.
     */
    fun assignPilot(view:View)
    {
        //Flight.employeeList[0][0] = Pilot.pilotList[0]
        Toast.makeText(this,"Añadido",Toast.LENGTH_LONG)
        changeToAdmin()

        /*FALTA CONTROLAR ESTA COMPROBACION DE NULL EN KOTLIN
        if (Flight.employeeList[0][Flight.MAX_PILOT - 1] == null)
        {
            Flight.employeeList[0][0] = Pilot.pilotList[0]
            Toast.makeText(this,"Añadido",Toast.LENGTH_LONG)
            changeToLogin()
        }
        else
        {
            Toast.makeText(this,"Pilotos al máximo",Toast.LENGTH_LONG)
        }
        */

    }

    /**
     * Da de alta un Copiloto.
     */
    fun assignCopilot(view: View)
    {
        if (Flight.employeeList[1][Flight.MAX_COPILOT - 1] == null)
        {
            Flight.employeeList[1][0] = Copilot.copilotList[0]
            Toast.makeText(this,"Añadido",Toast.LENGTH_LONG)
            changeToAdmin()
        }
        else
        {
            Toast.makeText(this,"Copilotos al máximo",Toast.LENGTH_LONG)
        }
    }

    /**
     * Da de alta un asistente.
     */
    fun assignEmployee(view:View)
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
                    Toast.makeText(this,"Añadido",Toast.LENGTH_LONG)
                    changeToAdmin()
                }
                listIndex++
            } while (!asigned)
        }
        else
        {
            Toast.makeText(this,"El numero de asistentes ya es el máximo",Toast.LENGTH_LONG)
        }
    }


}