package com.example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.factorypattern.R
import com.example.factorypattern.factory.FactoryGenerator
import kotlinx.android.synthetic.main.recycler_view_content.view.*

class FillingAdapter(
    val factoryList: MutableList<String>,
    val fillingList: MutableList<String>,
    val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_content, parent, false)
        return FillingViewHolder(itemView)
    }

    override fun getItemCount(): Int = fillingList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = FillingViewHolder(holder.itemView)
        viewHolder.bindTo(position)

    }

    inner class FillingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.cardView.title
        private val description: TextView = itemView.cardView.description
        private val image: ImageView = itemView.cardView.imageView
        private val calories: TextView = itemView.cardView.calories

        fun bindTo(position: Int) {

            for (i in 0 until factoryList.size) {

                if (factoryList[i] == "FILLING") {

                    title.text = FactoryGenerator().getFactory(factoryList[i])?.getFilling(fillingList[position])
                        ?.getFillingName()

                    description.text =
                        FactoryGenerator().getFactory(factoryList[i])?.getFilling(fillingList[position])
                            ?.getFillingDescription()

                    calories.text = FactoryGenerator().getFactory(factoryList[i])?.getFilling(fillingList[position])
                        ?.getFillingCalories()

                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            FactoryGenerator().getFactory(factoryList[i])?.getFilling(fillingList[position])?.getFillingImage()!!
                        )
                    )


                }

            }
        }

    }

}