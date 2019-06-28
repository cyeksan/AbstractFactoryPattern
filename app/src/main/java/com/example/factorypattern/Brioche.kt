package com.example.factorypattern

class Brioche : Bread{
    private var name = "brioche"
    private var calories = "425 cal"
    override fun getBreadName(): String {

        return name
    }

    override fun getBreadCalories(): String {

        return calories
    }
}