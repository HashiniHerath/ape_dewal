package com.example.apedeapp

class CartQuantityValidation {

    fun cartQuantityValidation(testYourInt: Int, testYourIntPrice: Int, testBotPrice:Int): Boolean {

        if (testYourInt == 1 || testYourIntPrice == testBotPrice) {
            return true
        }

        return false
    }
}