package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapter.ViewPagerAdapter
import com.example.fragment.BreadFragment
import com.example.fragment.FillingFragment
import com.example.factorypattern.R
import com.example.fragment.SauceFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factoryList= resources.getStringArray(R.array.factory_list)
        val fragmentList = arrayListOf(
            BreadFragment(factoryList.toMutableList()),
            FillingFragment(factoryList.toMutableList()),
            SauceFragment(factoryList.toMutableList()))

        val adapter = ViewPagerAdapter(factoryList.toMutableList(), supportFragmentManager)

        adapter.apply {

            for(i in factoryList.indices) {
                addFragment(fragmentList[i], factoryList[i])
            }

        }

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

    }
}
