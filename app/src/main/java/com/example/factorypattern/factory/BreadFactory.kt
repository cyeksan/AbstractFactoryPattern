package com.example.factorypattern.factory

import com.example.factorypattern.bread.Baguette
import com.example.factorypattern.bread.Bread
import com.example.factorypattern.bread.Brioche
import com.example.factorypattern.bread.Roll
import com.example.factorypattern.filling.Filling
import com.example.factorypattern.sauce.Sauce

class BreadFactory : AbstractFactory() {

    override fun getBread(type: String): Bread? {

        return when (type) {
            "Baguette" -> Baguette()
            "Roll" -> Roll()
            "Brioche" -> Brioche()
            else -> null
        }

    }

    override fun getFilling(type: String): Filling? {
        return null
    }

    override fun getSauce(type: String): Sauce? {
        return null
    }



}