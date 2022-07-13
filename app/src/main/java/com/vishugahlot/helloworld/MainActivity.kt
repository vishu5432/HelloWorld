package com.vishugahlot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.hello_button)

        button.setOnClickListener{
            Log.v("Hello world button", "Button is clicked")
            Toast.makeText(this@MainActivity, "Hello to you too!", Toast.LENGTH_LONG).show()
        }
    }
}