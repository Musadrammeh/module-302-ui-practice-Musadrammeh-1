package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    private var buttonSignup: Button? = null
    private var buttonLogin: Button? = null
    private var textViewTime: TextView? = null
    private var textViewDate: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewDate = findViewById(R.id.dateTextView)
        setDateAndTime()


    }

    private fun setDateAndTime(){
        val today = Date()
        val dateFormat = SimpleDateFormat("dd MMMM yyyy")
        val formatedDate = dateFormat.format(today)
        Log.i("TAG", "$formatedDate")

        textViewDate?.text = formatedDate
    }
}