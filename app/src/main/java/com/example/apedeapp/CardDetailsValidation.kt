package com.example.apedeapp

class CardDetailsValidation {

    fun cardFieldValidation(testCardName: String, testCardNumber: String, testExDate:String, testCardCVV:String): Boolean {

        if (testCardName.isEmpty()) {
            return false
        }

        if (testCardNumber.isEmpty()) {
            return false
        }

        if (testExDate.isEmpty()) {
            return false
        }

        if (testCardCVV.isEmpty()) {
            return false
        }

        return true
    }
}