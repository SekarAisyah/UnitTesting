package com.example.unittesting

class Register {

    private val existingUsers = listOf("Sekar", "Aisyah", "Faishal", "Metty", "Ayu")

    fun validateRegisterInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return false
    }
}