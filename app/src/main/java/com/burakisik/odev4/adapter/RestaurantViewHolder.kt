package com.burakisik.odev4.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.burakisik.odev4.R
import com.burakisik.odev4.data.model.Restaurant

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvRestaurantName by lazy { itemView.findViewById<TextView>(R.id.name) }
    private val ivRestaurantIcon by lazy { itemView.findViewById<ImageView>(R.id.icItem) }

    fun bind(restaurant: Restaurant) {
        tvRestaurantName.text = restaurant.name
        ivRestaurantIcon.setImageResource(R.drawable.ic_restaurant);
    }
}