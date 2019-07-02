package com.example.factorypattern.factory

class FactoryGenerator {

    fun getFactory(factoryType: String): AbstractFactory? {

        return when (factoryType) {

            "Bread" -> BreadFactory()
            "Filling" -> FillingFactory()
            "Sauce" -> SauceFactory()
            else -> null
        }
    }
}