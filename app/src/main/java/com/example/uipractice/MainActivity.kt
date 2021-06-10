package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.Clock
import java.util.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    private var buttonSignup: Button? = null
    private var buttonLogin: Button? = null
    private var textViewTime: TextView? = null
    private var textViewDate: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewTime = findViewById(R.id.timeTextView)
        textViewDate = findViewById(R.id.dateTextView)
        setDateAndTime()


    }

    private fun setDateAndTime(){
        val today = Date()
        val dateFormat = SimpleDateFormat("dd MMMM yyyy")
        val formatedDate = dateFormat.format(today)

        val timeToShow = timeFormat.format(CurrentDate)
        Log.i("TAG", "$formatedDate")


        textViewDate?.text = formatedDate
    }


}