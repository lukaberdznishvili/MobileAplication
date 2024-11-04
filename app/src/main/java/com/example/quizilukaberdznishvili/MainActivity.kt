package com.example.midtermbtueasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.quizilukaberdznishvili.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val okayButton = findViewById<Button>(R.id.okayButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        okayButton.setOnClickListener {
            val email = emailInput.text.toString()
            // Handle "Okay" button functionality if needed
        }

        nextButton.setOnClickListener {
            val email = emailInput.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }
    }
}
