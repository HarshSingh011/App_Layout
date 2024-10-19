package com.example.prac

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val loginBtn: Button = findViewById<Button>(R.id.log)
        loginBtn.setOnClickListener {
            val intent = Intent(this, second_page::class.java)
            startActivity(intent)
        }

        val RegisterBtn: Button = findViewById<Button>(R.id.Reg)
        RegisterBtn.setOnClickListener {
            val intent = Intent(this, third_page::class.java)
            startActivity(intent)
        }
    }
}