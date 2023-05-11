package com.example.apedeapp

import org.junit.Assert.*

import org.junit.Test

class AddItemValidationTest {

    @Test
    fun `empty fields return false`() {

        val addItemValidation = AddItemValidation()

        val result = addItemValidation.addItemFieldValidation(
            "",
            "",
            "",
            ""
        )

        assertEquals(false, result)
    }

    @Test
    fun `empty name return false`() {

        val addItemValidation = AddItemValidation()

        val result = addItemValidation.addItemFieldValidation(
            "",
            "Blue",
            "3600",
            "Super"
        )

        assertEquals(false, result)
    }

    @Test
    fun `empty Price return false`() {

        val addItemValidation = AddItemValidation()

        val result = addItemValidation.addItemFieldValidation(
            "Bag",
            "Blue",
            "",
            "Super"
        )

        assertEquals(false, result)
    }

    @Test
    fun `all fields return true`() {

        val addItemValidation = AddItemValidation()

        val result = addItemValidation.addItemFieldValidation(
            "Bag",
            "Blue",
            "3600",
            "Super"
        )

        assertEquals(true, result)
    }
}