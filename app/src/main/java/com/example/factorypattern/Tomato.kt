package com.example.factorypattern

class Tomato : Filling {

    private var name = "tomato"
    private var calories = "120 cal"

    override fun getFillingName(): String {
        return name
    }

    override fun getFillingCalories(): String {
        return calories
    }
}