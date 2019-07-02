package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.factorypattern.R

class SauceFragment(private val factoryList: MutableList<String>): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_sauce, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewSauce = view.findViewById<RecyclerView>(R.id.recyclerViewSauce)
        val layoutManager =  LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        recyclerViewSauce?.layoutManager = layoutManager

        val anim = AnimationUtils.loadLayoutAnimation(context,
            R.anim.layout_animation_right_to_left
        )

        recyclerViewSauce?.layoutAnimation = anim

        val sauceList = resources.getStringArray(R.array.sauce_list)

        recyclerViewSauce?.adapter =
            SauceAdapter(factoryList, sauceList.toMutableList(), context!!)
    }

}