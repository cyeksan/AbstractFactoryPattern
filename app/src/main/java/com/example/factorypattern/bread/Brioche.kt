package com.example.factorypattern.bread

import com.example.factorypattern.R

class Brioche : Bread {


    private var name = "Brioche"
    private var calories = "425 cal"
    private var description = "Small but naughty"
    private var image = R.drawable.brioche

    override fun getBreadName(): String {

        return name
    }

    override fun getBreadCalories(): String {

        return calories
    }

    override fun getBreadDescription(): String {
        return description
    }

    override fun getBreadImage(): Int {
        return image
    }
}