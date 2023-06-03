package com.example.unittesting

import org.junit.Assert.*
import org.junit.Test

class RegisterTest {

    private val register = Register()

    @Test
    fun testEmptyInput() {
        assertFalse(register.validateRegisterInput("", "password", "password"))
        assertFalse(register.validateRegisterInput("username", "", "password"))
        assertFalse(register.validateRegisterInput("username", "password", ""))
    }

    @Test
    fun testExistingUsername() {
        assertFalse(register.validateRegisterInput("Sekar", "password", "password"))
    }

    @Test
    fun testPasswordMismatch() {
        assertFalse(register.validateRegisterInput("username", "password", "different"))
    }

    @Test
    fun testWeakPassword() {
        assertFalse(register.validateRegisterInput("username", "pass", "pass"))
    }

    @Test
    fun testSingleDigitPassword() {
        assertFalse(register.validateRegisterInput("username", "password1", "password1"))
    }

    @Test
    fun testValidInput() {
        assertFalse(register.validateRegisterInput("newUser", "P@ssw0rd123", "P@ssw0rd123"))
    }
}