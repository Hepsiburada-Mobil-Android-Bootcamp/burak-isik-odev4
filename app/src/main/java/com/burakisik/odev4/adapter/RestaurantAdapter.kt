package com.burakisik.odev4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.burakisik.odev4.R
import com.burakisik.odev4.data.model.Restaurant

class RestaurantAdapter(private var restaurants:ArrayList<Restaurant>) : RecyclerView.Adapter<RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent,false))
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(restaurants[position])

    }

    override fun getItemCount() = restaurants.size
}