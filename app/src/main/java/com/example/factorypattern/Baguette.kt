package com.example.factorypattern

class Baguette : Bread{

    private var name = "baguette"
    private var calories = "326 cal"

    override fun getBreadName(): String {

        return name
    }

    override fun getBreadCalories(): String {

        return calories
    }
}