package com.example.factorypattern.factory

import com.example.factorypattern.bread.Bread
import com.example.factorypattern.filling.Filling
import com.example.factorypattern.sauce.Sauce

abstract class AbstractFactory {

    abstract fun getBread(type: String): Bread?
    abstract fun getFilling(type: String): Filling?
    abstract fun getSauce(type: String): Sauce?
}