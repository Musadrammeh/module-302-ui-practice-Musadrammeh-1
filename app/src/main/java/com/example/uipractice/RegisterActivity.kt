package com.example.uipractice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.uipractice.databinding.ActivityLogInBinding
import com.example.uipractice.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private var imm: InputMethodManager? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imm = getSystemService(Context.INPUT_METHOD_SERVICE) as inputMethodManager
        binding.buttonCreateAccount.setOnClickListener{
            val name = binding.editTextName.text.toString()
            val emailAdress = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            if (!Util.isNameValid(name)) showErrorMessageInName()
            if (!Util.isEmailValid(emailAdress)) showErrorMessageInEmail()
            if (!Util.isPasswordValid(password)) showErrorMessageInPassword()
            if (!Util.isNameValid(name)) && Util.isEmailValid(emailAdress) && Util.isPasswordValid(password)
                imm?.hideSoftInputFromWindow(it.windowToken, 0)
                Toast.makeText(this,"", Toast.LENGTH_LONG).show()

        }

        override fun finish(){

        }

        private fun showErrorMessageInName(){
            binding.editTextName.error=getString(R.string.name_cannot_be_empty)
        }

        private fun showErrorMessageInEmail(){
            binding.editTextName.error=getString(R.string.invalid_email_adress)
        }

        private fun ShowErrorMessageInPassword(){
            binding.editTextName.error=getString(R.string.password_must_have_minimum_{6}_characters)
        }
    }
}