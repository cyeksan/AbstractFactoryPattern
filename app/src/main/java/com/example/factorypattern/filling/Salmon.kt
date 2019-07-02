package com.example.factorypattern.filling

import com.example.factorypattern.R

class Salmon : Filling {

    private var name = "Salmon"
    private var calories = "247 cal"
    private var description = "For those who want plenty of protein"
    private var image = R.drawable.salmon

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