package com.example.weempower

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // 6-Month courses
        val checkFirstAid = findViewById<CheckBox>(R.id.checkFirstAid)
        val checkSewing = findViewById<CheckBox>(R.id.checkSewing)
        val checkLandscaping = findViewById<CheckBox>(R.id.checkLandscaping)
        val checkLifeSkills = findViewById<CheckBox>(R.id.checkLifeSkills)

        // 6-Week courses
        val checkChildMinding = findViewById<CheckBox>(R.id.checkChildMinding)
        val checkCooking = findViewById<CheckBox>(R.id.checkCooking)
        val checkGarden = findViewById<CheckBox>(R.id.checkGarden)

        val btnCalculate = findViewById<Button>(R.id.btnCalculateTotal)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val totalFeeText = findViewById<TextView>(R.id.totalFeeText)

        btnCalculate.setOnClickListener {
            var total = 0

            // Calculate 6-Month course fees
            if (checkFirstAid.isChecked) total += 1500
            if (checkSewing.isChecked) total += 1500
            if (checkLandscaping.isChecked) total += 1500
            if (checkLifeSkills.isChecked) total += 1500

            // Calculate 6-Week course fees
            if (checkChildMinding.isChecked) total += 750
            if (checkCooking.isChecked) total += 750
            if (checkGarden.isChecked) total += 750

            totalFeeText.text = "Total Fee: R$total"
        }

        btnReset.setOnClickListener {
            // Uncheck all checkboxes
            checkFirstAid.isChecked = false
            checkSewing.isChecked = false
            checkLandscaping.isChecked = false
            checkLifeSkills.isChecked = false
            checkChildMinding.isChecked = false
            checkCooking.isChecked = false
            checkGarden.isChecked = false

            // Reset total fee text
            totalFeeText.text = "Total Fee: R0"

            findViewById<Button>(R.id.btnbackTo).setOnClickListener {
                startActivity(Intent(this , MainActivity::class.java))
            }
        }
    }
}
