package com.example.apedeapp

import org.junit.Assert.*

import org.junit.Test

class CreateStoreValidationTest {

    @Test
    fun `shop name validation`() {

        val createStoreValidation = CreateStoreValidation()

        val result = createStoreValidation.createStoreFieldValidation(
            "",
            "Colombo 07",
            "0786543456"
        )
        assertEquals(false,result)
    }

    @Test
    fun `shop address validation`() {

        val createStoreValidation = CreateStoreValidation()

        val result = createStoreValidation.createStoreFieldValidation(
            "My Store",
            "",
            "0786543456"
        )
        assertEquals(false,result)
    }

    @Test
    fun `all fields validation false`() {

        val createStoreValidation = CreateStoreValidation()

        val result = createStoreValidation.createStoreFieldValidation(
            "",
            "",
            ""
        )
        assertEquals(false,result)
    }

    @Test
    fun `all fields validation true`() {

        val createStoreValidation = CreateStoreValidation()

        val result = createStoreValidation.createStoreFieldValidation(
            "My Store",
            "Colombo 07",
            "0786543456"
        )
        assertEquals(true,result)
    }
}