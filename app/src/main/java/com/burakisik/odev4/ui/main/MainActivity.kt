package com.burakisik.odev4.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.burakisik.odev4.R
import com.burakisik.odev4.adapter.FoodTypeAdapter
import com.burakisik.odev4.adapter.RestaurantAdapter
import com.burakisik.odev4.data.model.FoodType
import com.burakisik.odev4.data.model.Restaurant

class MainActivity : AppCompatActivity() {

    private val rvFoodTypes by lazy { findViewById<RecyclerView>(R.id.rvFoodType) }
    private val rvRestaurants by lazy { findViewById<RecyclerView>(R.id.restaurants) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setLayoutManager()
        populateRvFoodTypes()
        populateRvRestaurants()
    }

    private fun setLayoutManager() {
        rvFoodTypes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvRestaurants.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun populateRvFoodTypes() {
        val foodTypes = ArrayList<FoodType>()
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))
        foodTypes.add(FoodType("Food", R.drawable.ic_food))

        rvFoodTypes.adapter = FoodTypeAdapter(foodTypes)
    }

    private fun populateRvRestaurants() {
        val restaurants = ArrayList<Restaurant>()
        restaurants.add(Restaurant("Kebabcı", R.drawable.ic_restaurant))
        restaurants.add(Restaurant("Kebabcı", R.drawable.ic_restaurant))
        restaurants.add(Restaurant("Kebabcı", R.drawable.ic_restaurant))
        restaurants.add(Restaurant("Kebabcı", R.drawable.ic_restaurant))
        restaurants.add(Restaurant("Kebabcı", R.drawable.ic_restaurant))

        rvRestaurants.adapter = RestaurantAdapter(restaurants)
    }
}