package com.example.cepfly2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import com.example.netbeans.workers.Copilot
import com.example.netbeans.workers.Employee
import com.example.netbeans.workers.Pilot

class EmployeeInfoActivity : AppCompatActivity()
{
    lateinit var tvEmployeeDescription : TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employee_info)
        tvEmployeeDescription = findViewById(R.id.tv_employeeDescription) as TextView
        showEmployeeInfo()
    }

    private fun showEmployeeInfo()
    {
        if (Pilot.pilotCount!=0||Copilot.copilotCount!=0||Employee.employeeCount!=0)
        {
            tvEmployeeDescription.text=Flight.employeeList[0][0].toString()
        }
        else
        {
            tvEmployeeDescription.text="No hay información disponible"
        }
    }

}