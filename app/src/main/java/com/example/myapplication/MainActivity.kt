package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var letters = "";
    var numbers = 0;

    var state = "default";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        val increaseBtn = findViewById<Button>(R.id.increaseButton)
        val decreaseBtn = findViewById<Button>(R.id.decreaseButton)

        // Letters
        button1.setOnClickListener {
            when (state) {
                "increase" ->
                    addLetter("A")
                "decrease" ->
                    decreaseLetter()
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        button2.setOnClickListener {
            when (state) {
                "increase" ->
                    addLetter("B")
                "decrease" ->
                    decreaseLetter()
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        button3.setOnClickListener {
            when (state) {
                "increase" ->
                    addLetter("C")
                "decrease" ->
                    decreaseLetter()
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        // Numbers
        button4.setOnClickListener {
            when (state) {
                "increase" ->
                    addNumber(1)
                "decrease" ->
                    decreaseNumber(1)
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        button5.setOnClickListener {
            when (state) {
                "increase" ->
                    addNumber(2)
                "decrease" ->
                    decreaseNumber(2)
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        button6.setOnClickListener {
            when (state) {
                "increase" ->
                    addNumber(3)
                "decrease" ->
                    decreaseNumber(3)
                else ->
                    Toast.makeText(this, "Select a state first", Toast.LENGTH_SHORT).show()
            }

            state = "default"
        }

        increaseBtn.setOnClickListener {
            state = "increase"
        }

        decreaseBtn.setOnClickListener {
            state = "decrease"
        }
    }

    fun showToast(view: View) {
        Toast.makeText(this, "💀 skul", Toast.LENGTH_SHORT).show();
    }

    fun addLetter(letter: String) {
        letters += letter

        Toast.makeText(this, letters, Toast.LENGTH_SHORT).show();
    }

    fun decreaseLetter()
    {
        if (letters.isEmpty()) {
            Toast.makeText(this, "Letters are currently empty", Toast.LENGTH_SHORT).show()
            return
        }

        letters = letters.dropLast(1)
        Toast.makeText(this, letters, Toast.LENGTH_SHORT).show()
    }

    fun addNumber(number: Int) {
        numbers += number

        Toast.makeText(this, numbers.toString(), Toast.LENGTH_SHORT).show();
    }

    fun decreaseNumber(number: Int) {
        val result = numbers - number;

        if (result < 0) {
            Toast.makeText(this, "Result must not be less than 0", Toast.LENGTH_SHORT).show()
            return
        }

        numbers = result;
        Toast.makeText(this, numbers.toString(), Toast.LENGTH_SHORT).show()
    }
}