package com.example.factorypattern.factory

import com.example.factorypattern.bread.Bread
import com.example.factorypattern.filling.Filling
import com.example.factorypattern.sauce.Ketchup
import com.example.factorypattern.sauce.Mayonnaise
import com.example.factorypattern.sauce.Sauce

class SauceFactory : AbstractFactory() {
    override fun getBread(type: String): Bread? {
        return null
    }

    override fun getFilling(type: String): Filling? {
        return null
    }

    override fun getSauce(type: String): Sauce? {
        return when(type) {

            "Ketchup" -> Ketchup()
            "Mayonnaise" -> Mayonnaise()
            else -> null
        }
    }
}