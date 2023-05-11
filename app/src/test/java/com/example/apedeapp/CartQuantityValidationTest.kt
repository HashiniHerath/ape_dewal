package com.example.apedeapp

import org.junit.Assert.*

import org.junit.Test

class CartQuantityValidationTest {

    @Test
    fun `cartQuantityValidationTrue`() {

        val cartQuantityValidation = CartQuantityValidation()

        val result = cartQuantityValidation.cartQuantityValidation(

            1,
            200,
            200
        )
        assertEquals(true, result)
    }

    @Test
    fun `cartQuantityValidationFalse`() {

        val cartQuantityValidation = CartQuantityValidation()

        val result = cartQuantityValidation.cartQuantityValidation(

            0,
            200,
            400
        )
        assertEquals(false, result)
    }
}