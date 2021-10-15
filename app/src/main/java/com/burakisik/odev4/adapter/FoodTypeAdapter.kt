package com.burakisik.odev4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.burakisik.odev4.R
import com.burakisik.odev4.data.model.FoodType

class FoodTypeAdapter(private var foodTypes:ArrayList<FoodType>) : RecyclerView.Adapter<FoodTypeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodTypeViewHolder {
        return FoodTypeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_food_type, parent,false))
    }

    override fun onBindViewHolder(holder: FoodTypeViewHolder, position: Int) {
        holder.bind(foodTypes[position])

    }

    override fun getItemCount() = foodTypes.size
}