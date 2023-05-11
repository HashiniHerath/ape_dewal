package com.example.apedeapp

class AddItemValidation {

    fun addItemFieldValidation(testName: String, testColor: String, testPrice:String, testDescription: String): Boolean {

        if (testName.isEmpty()) {
            return false
        }

        if (testColor.isEmpty()) {
            return false
        }

        if (testPrice.isEmpty()) {
            return false
        }

        if (testDescription.isEmpty()) {
            return false
        }

        return true
    }
}