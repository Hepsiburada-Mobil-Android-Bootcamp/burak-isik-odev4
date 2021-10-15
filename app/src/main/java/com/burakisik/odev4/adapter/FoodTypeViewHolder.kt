package com.burakisik.odev4.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.burakisik.odev4.R
import com.burakisik.odev4.data.model.FoodType

class FoodTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvFoodName by lazy { itemView.findViewById<TextView>(R.id.foodName) }
    private val ivFoodIcon by lazy { itemView.findViewById<ImageView>(R.id.icItem) }

    fun bind(foodType: FoodType) {
        tvFoodName.text = foodType.name
        ivFoodIcon.setImageResource(R.drawable.ic_food);
    }
}