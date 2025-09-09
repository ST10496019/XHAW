package com.example.weempower

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.btnSixMonth).setOnClickListener {
            startActivity(Intent(this, SixMonthCoursesActivity::class.java))
        }
        findViewById<Button>(R.id.btnSixWeek).setOnClickListener {
            startActivity(Intent(this, SixWeekCoursesActivity::class.java))
        }
        findViewById<Button>(R.id.btnCalculator).setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }
        findViewById<Button>(R.id.btnContact).setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}



