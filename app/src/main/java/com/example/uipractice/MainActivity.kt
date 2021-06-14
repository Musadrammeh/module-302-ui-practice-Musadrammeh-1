package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.uipractice.databinding.ActivityMainBinding
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.Clock
import java.util.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDateAndTime()
        binding.buttonSignUp.setOnClickListener(this)
        binding.buttonLogin.setOnClickListener(this)

    }

    private fun setDateAndTime(){
        val currentDate = Date()
        val timeFormat = SimpleDateFormat("dd MMMM yyyy")
        val dateFormat = SimpleDateFormat ("hh:mm a")

        val timeToShow = timeFormat.format(currentDate)
        binding.timeTextView.text = timeToShow

        val dateToShow = dateFormat.format(currentDate)
        binding.dateTextView.text = dateToShow
    }

    override fun onClick(v: View?){
        val classToGo = when (v){
            binding.buttonLogin -> LogInActivity::class.java
            else -> RegisterActivity::class.java
        }
        val intent = Intent(this,classToGo)
        startActivity(intent)
    }




}