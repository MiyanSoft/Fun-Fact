package com.miyansoft.fun_fact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.txtEmail)
        val password = findViewById<EditText>(R.id.txtPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)
        loginBtn.setOnClickListener {
            if(email.text.isEmpty()  || password.text.isEmpty()) {
                Toast.makeText( this,"Email and password required", Toast.LENGTH_LONG).show()
            } else if(email.text.trim().isNotEmpty()  && password.text.trim().isNotEmpty()) {
                Toast.makeText( this,"Login Successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText( this,"Incorrect Email and Password", Toast.LENGTH_LONG).show()

            }

        }
    }
}