package com.example.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breadName = FactoryGenerator().getFactory("Bread")?.getBread("Roll")?.getBreadName()
        val breadCalories = FactoryGenerator().getFactory("Bread")?.getBread("Roll")?.getBreadCalories()

        val cheeseName = FactoryGenerator().getFactory("Filling")?.getFilling("Cheese")?.getFillingName()
        val cheeseCalories = FactoryGenerator().getFactory("Filling")?.getFilling("Cheese")?.getFillingCalories()

        Log.v("breadFactoryResult", "$breadName $breadCalories")
        Log.v("breadFactoryResult", "$cheeseName $cheeseCalories")
    }
}
