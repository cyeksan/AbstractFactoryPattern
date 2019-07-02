package com.example.fragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.BreadAdapter
import com.example.factorypattern.R

class BreadFragment(private val factoryList: MutableList<String>): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_bread, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewBread = view.findViewById<RecyclerView>(R.id.recyclerViewBread)
        val layoutManager =  LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        recyclerViewBread?.layoutManager = layoutManager
        val anim = AnimationUtils.loadLayoutAnimation(context,
            R.anim.layout_animation_right_to_left
        )

        val breadList = resources.getStringArray(R.array.bread_list)

        recyclerViewBread?.layoutAnimation = anim
        recyclerViewBread?.adapter = BreadAdapter(factoryList, breadList.toMutableList(), context!!)
    }
}