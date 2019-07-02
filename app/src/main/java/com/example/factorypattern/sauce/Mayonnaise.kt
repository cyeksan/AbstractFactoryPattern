package com.example.factorypattern.sauce

import com.example.factorypattern.R

class Mayonnaise : Sauce {
    private var name = "Mayonnaise"
    private var description = "Unique meeting of eggs and olive oil"
    private var calories = "321 cal"
    private var image  = R.drawable.mayonnaise

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