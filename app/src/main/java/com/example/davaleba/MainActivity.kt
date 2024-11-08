package com.example.davaleba

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumberInput = findViewById<EditText>(R.id.etNumberInput)
        val tvNumberDisplay = findViewById<TextView>(R.id.tvNumberDisplay)
        val btnOkay = findViewById<Button>(R.id.btnOkay)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnOkay.setOnClickListener {
            val numberText = etNumberInput.text.toString()
            tvNumberDisplay.text = "your number is $numberText"
        }

        btnNext.setOnClickListener {
            val number = etNumberInput.text.toString().toIntOrNull() ?: 0
            val intent = Intent(this, CounterActivity::class.java)
            intent.putExtra("counter_value", number)
            startActivity(intent)
        }
    }
}
