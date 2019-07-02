package com.example.factorypattern.factory

import com.example.factorypattern.filling.Filling
import com.example.factorypattern.bread.Bread
import com.example.factorypattern.filling.Cheese
import com.example.factorypattern.filling.Salmon
import com.example.factorypattern.filling.Tomato
import com.example.factorypattern.sauce.Sauce

class FillingFactory: AbstractFactory() {

    override fun getFilling(type: String): Filling? {

        return when(type) {
            "Tomato" -> Tomato()
            "Cheese"-> Cheese()
            "Salmon" -> Salmon()
            else -> null
        }
    }

    override fun getBread(type: String): Bread? {
        return null
    }

    override fun getSauce(type: String): Sauce? {
        return null
    }

}