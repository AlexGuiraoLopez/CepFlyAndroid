package com.example.cepfly2

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity()
{
    lateinit var etUsername : EditText
    lateinit var etPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        var username : String = etUsername.text.toString()
        var password : String = etPassword.text.toString()
    }

    fun login()
    {

    }
}