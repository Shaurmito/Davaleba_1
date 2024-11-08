package com.example.davaleba

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    private var counter = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnClick = findViewById<Button>(R.id.btnClick)

        counter = intent.getIntExtra("counter_value", 0)
        tvCounter.text = counter.toString()

        btnClick.setOnClickListener {
            counter--
            tvCounter.text = counter.toString()
        }
    }
}
