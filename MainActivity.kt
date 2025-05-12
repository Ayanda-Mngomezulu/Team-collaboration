package com.example.cashcompass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //load button
        val btnSubmit = findViewById<Button>(R.id.btnRegister)
        //set the onClick action to the button
        btnSubmit?.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }

        //load button
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        //set the onClick action to the button
        btnCancel?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}