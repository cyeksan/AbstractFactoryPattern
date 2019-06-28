package com.example.factorypattern

class FactoryGenerator {

    fun getFactory(factoryType: String): AbstractFactory? {

        return when (factoryType) {

            "Bread" -> BreadFactory()
            "Filling" -> FillingFactory()
            else -> null
        }
    }
}