package com.example.factorypattern

class FillingFactory: AbstractFactory() {

    override fun getBread(type: String): Bread? {
        return null
    }

    override fun getFilling(type: String): Filling? {

        return when(type) {
            "Tomato" -> Tomato()
            "Cheese"-> Cheese()
            else -> null
        }
    }
}