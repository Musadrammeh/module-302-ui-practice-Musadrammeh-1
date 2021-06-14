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

        imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        binding.buttonCreateAccount.setOnClickListener{
            val name = binding.editName.text.toString()
            val emailAdress = binding.editEmail.text.toString()
            val password = binding.editPassword.text.toString()

            if (!Util.isNameValid(name)) showErrorMessageInName()
            if (!Util.isEmailValid(emailAdress)) showErrorMessageInEmail()
            if (!Util.isPasswordValid(password)) showErrorMessageInPassword()
            if (!Util.isNameValid(name) && Util.isEmailValid(emailAdress) && Util.isPasswordValid(password)){
                imm?.hideSoftInputFromWindow(it.windowToken, 0)
                Toast.makeText(this,"", Toast.LENGTH_LONG).show()
            }


        }

    }

    private fun showErrorMessageInName(){
        binding.editName.error=getString(R.string.name_cannot_be_empty)
    }

    private fun showErrorMessageInEmail(){
        binding.editEmail.error=getString(R.string.invalid_email_adress)
    }

    private fun showErrorMessageInPassword(){
        binding.editPassword.error=getString(R.string.invalid_password)


    }

}