package com.sileshi.android_studio_lab_2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //println("Loaded LoginActivity")

        /* TODO - Add missing LOGIN button to activity_login.xml */
        /* TODO - Input type should be: Password and Email types. (check XML)   */
        /* TODO - .apply to send user information from input field BACK to MainActivity */
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val email = findViewById<EditText>(R.id.etEmailAddress)
        val password = findViewById<EditText>(R.id.etPassword)

        btnLogin.setOnClickListener {

            val userName = email.text.toString() // get email input
            val psd = password.text.toString() // get psd input

            val userList = ArrayList<String>()
                userList.add("sileshi@gmail.com")
                userList.add("admin@gmail.com")

            if (userList.contains(userName)&& psd.isNotEmpty()){
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("userName", userName)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please Enter the required fields!", Toast.LENGTH_LONG).show()
                Log.i(".LoginActivity", "Clicked Button")
            }

        }
    }
}