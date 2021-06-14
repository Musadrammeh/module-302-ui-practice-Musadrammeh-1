package com.example.uipractice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.example.uipractice.databinding.ActivityLogInBinding


class LogInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogInBinding
    private var imm: InputMethodManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        binding.buttonLogin.setOnClickListener{

        }
    }

    private fun showErrorMessageForEmail(){
        binding.editEmail.error=getString(R.string.invalid_email_adress)

    }

    private fun showErrorMessageForPassword(){
        binding.editPassword.error=getString(R.string.invalid_password)

    }
}