package com.example.factorypattern.bread

import com.example.factorypattern.R

class Roll : Bread {

    private var name = "Roll"
    private var calories = "562 cal"
    private var description = "Fluffy and hot"
    private var image = R.drawable.roll

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