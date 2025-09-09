package com.example.weempower

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixWeekCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_courses)

        val courses = listOf(
            Triple(
                R.id.btnChildMinding ,
                "Child Minding" ,
                "R750\nCovers baby care, toddlers, education."
            ),
            Triple(
                R.id.btnCooking ,
                "Cooking" ,
                "R750\nCovers nutrition, meal planning, preparation."
            ),
            Triple(
                R.id.btnGarden ,
                "Garden Maintenance" ,
                "R750\nCovers watering, pruning, planting."
            )
        )

        for ((buttonId, name, desc) in courses) {
            findViewById<Button>(buttonId).setOnClickListener {
                val intent = Intent(this, CourseDetailActivity::class.java)
                intent.putExtra("COURSE_NAME", name)
                intent.putExtra("COURSE_DESC", desc)
                startActivity(intent)


            }
        }
    }
}