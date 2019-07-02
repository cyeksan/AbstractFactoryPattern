package com.example.factorypattern.factory

class FactoryGenerator {

    fun getFactory(factoryType: String): AbstractFactory? {

        return when (factoryType) {

            "BREAD" -> BreadFactory()
            "FILLING" -> FillingFactory()
            "SAUCE" -> SauceFactory()
            else -> null
        }
    }
}