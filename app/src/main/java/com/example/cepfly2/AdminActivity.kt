package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AdminActivity  : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin_menu)

    }

    fun changeToNewEmployee(view: View)
    {
        val intent = Intent(this,NewEmployeeActivity::class.java).apply { }
        startActivity(intent)
    }
    fun changeToEmployeeInfo(view: View)
    {
        val intent = Intent(this,EmployeeInfoActivity::class.java).apply { }
        startActivity(intent)
    }
    fun changeToStart(view:View)
    {
        val intent = Intent(this, StartActivity::class.java).apply {  }
        startActivity(intent)
    }
}