package com.example.factorypattern.bread

import com.example.factorypattern.R

class Baguette : Bread {

    private var name = "Baguette"
    private var calories = "326 cal"
    private var description = "Fresh and crunchy"
    private var image = R.drawable.baguette

    override fun getBreadName(): String {

        return name
    }

    override fun getBreadCalories(): String {

        return calories
    }

    override fun getBreadDescription(): String {
        return  description
    }

    override fun getBreadImage(): Int {
        return image
    }
}