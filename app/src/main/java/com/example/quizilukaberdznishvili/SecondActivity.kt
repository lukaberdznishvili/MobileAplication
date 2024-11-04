package com.example.midtermbtueasy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizilukaberdznishvili.R

class SecondActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val counterText = findViewById<TextView>(R.id.counterText)
        val clickButton = findViewById<Button>(R.id.clickButton)

        // Retrieve the email from the intent and display it
        val userEmail = intent.getStringExtra("USER_EMAIL")
        welcomeText.text = "Welcome back\n$userEmail"

        // Set up the click listener for the counter
        clickButton.setOnClickListener {
            counter--
            counterText.text = counter.toString()
        }
    }
}
