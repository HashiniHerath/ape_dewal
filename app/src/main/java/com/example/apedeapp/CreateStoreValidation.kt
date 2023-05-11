package com.example.apedeapp

class CreateStoreValidation {

    fun createStoreFieldValidation(testShopName: String, testShopAddress: String, testShopNumber:String): Boolean {

        if (testShopName.isEmpty()) {
            return false
        }

        if (testShopAddress.isEmpty()) {
            return false
        }

        if (testShopNumber.isEmpty()) {
            return false
        }

        return true
    }
}