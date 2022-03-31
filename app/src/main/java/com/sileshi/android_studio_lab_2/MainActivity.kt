package com.sileshi.android_studio_lab_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


/* TODO READ THE README FILE FIRST */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO("Create Intent to navigate")

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

     val name:String? = intent.getStringExtra("userName")
     var welcomeTextView = findViewById<TextView>(R.id.welcomeText)

        if(name.isNullOrEmpty()){
            welcomeTextView.text = "Welcome user!"
        }else welcomeTextView.text = "Welcome,$name"

    }
}