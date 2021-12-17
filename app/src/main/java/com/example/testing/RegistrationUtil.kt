package com.example.testing

object RegistrationUtil {


    private val existingUser = listOf("peter", "joy")

    /**
     * the input is not valid for
     * empty username/password
     * username already taken
     * password should contain at least two digit
     * password and confirmedPassword are not same
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()){
            return false
        }


        if (username in existingUser){
            return false
        }

        if (password.count{it.isDigit()} < 2 ){
            return false
        }

        if (password != confirmedPassword){
            return false
        }

        return true
    }
}