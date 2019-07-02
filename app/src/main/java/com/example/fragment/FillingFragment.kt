package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.FillingAdapter
import com.example.factorypattern.R

class FillingFragment(private val factoryList: MutableList<String>): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_filling, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewFilling = view.findViewById<RecyclerView>(R.id.recyclerViewFilling)
        val layoutManager =  LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        recyclerViewFilling?.layoutManager = layoutManager
        val anim = AnimationUtils.loadLayoutAnimation(context,
            R.anim.layout_animation_right_to_left
        )

        val fillingList = resources.getStringArray(R.array.filling_list)

        recyclerViewFilling?.layoutAnimation = anim
        recyclerViewFilling?.adapter =
            FillingAdapter(factoryList, fillingList.toMutableList(), context!!)
    }
}