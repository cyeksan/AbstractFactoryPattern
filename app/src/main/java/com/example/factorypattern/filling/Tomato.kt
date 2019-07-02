package com.example.factorypattern.filling

import com.example.factorypattern.R

class Tomato : Filling {


    private var name = "Tomato"
    private var calories = "120 cal"
    private var description = "A healthy option for your sandwich"
    private var image = R.drawable.tomato

    override fun getFillingName(): String {
        return name
    }

    override fun getFillingCalories(): String {
        return calories
    }

    override fun getFillingDescription(): String {
        return description
    }

    override fun getFillingImage(): Int {
        return image
    }
}