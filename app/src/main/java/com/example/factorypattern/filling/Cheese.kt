package com.example.factorypattern.filling

import com.example.factorypattern.R

class Cheese : Filling {

    private var name = "Cheese"
    private var calories = "254 cal / slice"
    private var description = "A ripe and creamy cheese from the south west"
    private var image = R.drawable.cheese

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