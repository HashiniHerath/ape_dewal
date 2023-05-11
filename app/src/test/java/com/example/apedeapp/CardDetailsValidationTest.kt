package com.example.apedeapp

import org.junit.Assert.*

import org.junit.Test

class CardDetailsValidationTest {

    @Test
    fun `card all Fields Validation false`() {

        val cardDetailsValidation = CardDetailsValidation()

        val result = cardDetailsValidation.cardFieldValidation(
            "",
            "",
            "",
            ""
        )
        assertEquals(false,result)
    }

    @Test
    fun `card all Fields Validation true`() {

        val cardDetailsValidation = CardDetailsValidation()

        val result = cardDetailsValidation.cardFieldValidation(
            "Saman",
            "8766",
            "23",
            "234"
        )
        assertEquals(true,result)
    }

    @Test
    fun `card name validation false`() {

        val cardDetailsValidation = CardDetailsValidation()

        val result = cardDetailsValidation.cardFieldValidation(
            "",
            "8766",
            "23",
            "234"
        )
        assertEquals(false,result)
    }

    @Test
    fun `card cvv validation false`() {

        val cardDetailsValidation = CardDetailsValidation()

        val result = cardDetailsValidation.cardFieldValidation(
            "Saman",
            "8766",
            "23",
            ""
        )
        assertEquals(false,result)
    }
}