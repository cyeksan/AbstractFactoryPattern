package com.example.factorypattern

class BreadFactory : AbstractFactory() {
    override fun getFilling(type: String): Filling? {
        return null
    }


    override fun getBread(type: String): Bread? {

        return when (type) {
            "Baguette" -> Baguette()
            "Roll" -> Roll()
            "Brioche" -> Brioche()
            else -> null
        }

    }

}