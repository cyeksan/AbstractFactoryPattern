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

class BreadAdapter(
    val factoryList: MutableList<String>,
    val breadList: MutableList<String>,
    val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_content, parent, false)
        return BreadViewHolder(itemView)
    }

    override fun getItemCount(): Int = breadList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = BreadViewHolder(holder.itemView)
        viewHolder.bindTo(position)

    }

    inner class BreadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.cardView.title
        private val description: TextView = itemView.cardView.description
        private val image: ImageView = itemView.cardView.imageView
        private val calories: TextView = itemView.cardView.calories

        fun bindTo(position: Int) {

            for (i in 0 until factoryList.size) {

                if (factoryList[i] == "Bread") {

                    title.text = FactoryGenerator().getFactory(factoryList[i])?.getBread(breadList[position])
                        ?.getBreadName()

                    description.text =
                        FactoryGenerator().getFactory(factoryList[i])?.getBread(breadList[position])
                            ?.getBreadDescription()

                    calories.text = FactoryGenerator().getFactory(factoryList[i])?.getBread(breadList[position])
                        ?.getBreadCalories()

                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            FactoryGenerator().getFactory(factoryList[i])?.getBread(breadList[position])?.getBreadImage()!!
                        )
                    )


                }

            }
        }

    }

}

