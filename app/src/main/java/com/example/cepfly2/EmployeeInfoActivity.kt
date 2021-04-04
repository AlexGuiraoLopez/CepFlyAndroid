package com.example.cepfly2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.netbeans.flight.Flight
import com.example.netbeans.workers.Copilot
import com.example.netbeans.workers.Pilot

class EmployeeInfoActivity : AppCompatActivity()
{
    lateinit var tvEmployeeDescription : TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employee_info)
        tvEmployeeDescription = findViewById(R.id.tv_employeeDescription) as TextView
        tvEmployeeDescription.text=Flight.employeeList[0][0].toString()
    }


    fun showEmployeeList()
    {
        for (i in Flight.employeeList.indices)
        {
            for (j in 0 until Flight.employeeList[i].size)
            {
                when (i)
                {
                    0 -> if (Flight.employeeList[i][j] != null)
                    {
                        val pilot = Flight.employeeList[i][j] as Pilot
                        pilot.showInfo()
                    } /*else{
                                    System.out.println("Todavía no hay pilotos");
                                }*/
                    1 -> if (Flight.employeeList[i][j] != null)
                    {
                        val copilot = Flight.employeeList[i][j] as Copilot
                        copilot.showInfo()
                    } /*else{
                                    System.out.println("Todavía no hay copilotos");
                                }*/
                    2 -> if (Flight.employeeList[i][j] != null)
                    {
                        Flight.employeeList[i][j].showInfo()
                    } /*else{
                                    System.out.println("Todavía no hay asistentes");
                                }*/
                }
            }
        }
    }
}