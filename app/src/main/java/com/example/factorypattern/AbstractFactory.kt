package com.example.factorypattern

abstract class AbstractFactory {


    abstract fun getBread(type: String): Bread?
    abstract fun getFilling(type: String): Filling?
}