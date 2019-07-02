package com.example.factorypattern.sauce

import com.example.factorypattern.R

class Ketchup: Sauce {

    private var name = "Ketchup"
    private var description = "Red, exciting and delicious"
    private var calories = "164 cal"
    private var image  = R.drawable.ketchup

    override fun getSauceName(): String {
        return name
    }

    override fun getSauceDescription(): String {
        return description
    }

    override fun getSauceCalories(): String {
        return calories
    }

    override fun getSauceImage(): Int {
        return image
    }
}