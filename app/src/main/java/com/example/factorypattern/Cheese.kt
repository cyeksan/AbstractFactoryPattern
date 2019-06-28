package com.example.factorypattern

class Cheese : Filling {

    private var name = "cheese"
    private var calories = "254 cal"

    override fun getFillingName(): String {
        return name
    }

    override fun getFillingCalories(): String {
        return calories
    }

}