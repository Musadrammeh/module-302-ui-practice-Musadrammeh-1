package com.example.uipractice

import android.util.Patterns

object Util {

    const val MIN_PASSWORD_LENGTH = 6

    fun isNameValid(name: String): Boolean = name.isNotEmpty()

    fun isEmailValid(emailAdress: String): Boolean =
        emailAdress.isNotBlank()&& Patterns.EMAIL_ADDRESS.matcher(emailAdress).matches()
    fun isPasswordValid(password: String): Boolean =
        password.length >= MIN_PASSWORD_LENGTH

}