package com.example.weempower


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        val courseName = intent.getStringExtra("COURSE_NAME") ?: "Course"
        val courseDesc = intent.getStringExtra("COURSE_DESC") ?: "No description available."

        findViewById<TextView>(R.id.courseDetailText).text = "$courseName\n$courseDesc"

        findViewById<Button>(R.id.btnBackHome2).setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this , SixMonthCoursesActivity::class.java))


            }
        }

    }
}