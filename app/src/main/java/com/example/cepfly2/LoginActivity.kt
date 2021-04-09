package com.example.cepfly2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity()
{
    val USRNM = "alex"
    val PASSWD = "secret"
    lateinit var etUsername : EditText
    lateinit var etPassword : EditText
    lateinit var tvErrorText: TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        etUsername= findViewById(R.id.et_userName) as EditText
        etPassword= findViewById(R.id.et_password) as EditText
        tvErrorText=findViewById(R.id.tv_errorText) as TextView
        tvErrorText.visibility=View.INVISIBLE
    }

    fun changeToAdmin(view: View)
    {
        val intent = Intent(this, AdminActivity::class.java).apply {  }
        var username = etUsername.text.toString()
        var password = etPassword.text.toString()

        if (username.equals(USRNM) && password.equals(PASSWD))
        {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        else
        {
            tvErrorText.visibility=View.VISIBLE
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
        }
    }
}