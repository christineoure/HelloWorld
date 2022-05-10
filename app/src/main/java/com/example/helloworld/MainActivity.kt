package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi : Button
    lateinit var  btnSend : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnSend = findViewById(R.id.btnSend)

        btnBmi.setOnClickListener {
            val intent = Intent(this, CalculateBMIActivity::class.java)
            startActivity(intent)
        }
        btnSend.setOnClickListener {
            val intent = Intent(this, SendMoney::class.java)
             startActivity(intent)
        }
    }
}