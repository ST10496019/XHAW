package com.example.weempower

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixMonthCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        val courses = listOf(
            Triple(
                R.id.btnFirstAid ,
                "First Aid" ,
                "R1500\nCovers CPR, burns, wounds, emergencies."
            ),
            Triple(
                R.id.btnSewing ,
                "Sewing" ,
                "R1500\nCovers stitching, alterations, garment design."
            ),
            Triple(
                R.id.btnLandscaping ,
                "Landscaping" ,
                "R1500\nCovers plants, garden layout, structures."
            ),
            Triple(
                R.id.btnLifeSkills ,
                "Life Skills" ,
                "R1500\nCovers banking, literacy, labour law."
            )
        )

        for ((buttonId, name, desc) in courses) {
            findViewById<Button>(buttonId).setOnClickListener {
                val intent = Intent(this , CourseDetailActivity::class.java)
                intent.putExtra("COURSE_NAME" , name)
                intent.putExtra("COURSE_DESC" , desc)
                startActivity(intent)

            }
        }
    }
}