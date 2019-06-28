package com.example.factorypattern

class Roll : Bread {

    private var name = "roll"
    private var calories = "562 cal"
    override fun getBreadName(): String {

        return name
    }

    override fun getBreadCalories(): String {

        return calories
    }
}