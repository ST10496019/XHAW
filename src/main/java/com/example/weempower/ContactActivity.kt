package com.example.weempower

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ContactActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)


        findViewById<TextView>(R.id.contactText).text = """Contact Us:
Phone: 011-123-4567
Email: info@empoweringthenation.co.za
Venues: Johannesburg North, South, and East"""


        findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}