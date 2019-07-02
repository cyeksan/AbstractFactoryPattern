package com.example.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val factoryList: MutableList<String>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val mList = ArrayList<Fragment>()
    override fun getItem(position: Int): Fragment {
        return mList[position]
    }

    override fun getCount(): Int {
        return mList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        mList.add(fragment)
        factoryList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return factoryList[position]
    }

}