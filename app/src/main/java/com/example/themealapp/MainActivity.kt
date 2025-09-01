package com.example.themealapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// initiating all my variables
class MainActivity : AppCompatActivity() {
    private lateinit var edittextNamebox: EditText
    private lateinit var submitButton: Button
    private lateinit var displayText: TextView
    private lateinit var buttonReset: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } // initiating all my variables
        edittextNamebox = findViewById(R.id.edittextNamebox)
        submitButton = findViewById(R.id.submitButton)
        displayText = findViewById(R.id.displayText)
        buttonReset = findViewById(R.id.buttonReset)

        submitButton.setOnClickListener { // setting my button to process the user's input
            val time = edittextNamebox.text.toString().trim().lowercase()
            var mealType = ""
// Setting conditions
            if (time == "morning") {
                mealType = "Bacon and eggs"
            } else if (time == "lunch") {
                mealType = "Salad and a Protein shake"
            } else if (time == "lunch") {
                mealType = "Salad and a Protein shake"
            } else { // Message that shows when the user has inserted the incorrect conditions
                mealType = "Please enter a valid time of day maybe try Morning"
            }
            displayText.text = mealType
        }
// Clear text button
        buttonReset.setOnClickListener {
            edittextNamebox.text.clear()
            displayText.text = ""

        }

    }
}

