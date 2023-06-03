package com.example.unittesting

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CountNumberTest {

    private val testCountNumber : CountNumber = CountNumber()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected, testCountNumber.sum(40,2))
    }

    //Equals digunakan untuk membandinkan antara
}