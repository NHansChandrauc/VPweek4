package com.example.assignmentvpweek4.data
import androidx.annotation.DrawableRes

data class Car(
    val id: String,
    val name: String,
    val location: String = "Semarang",
    val price: String = "Rp 245.000.000",
    val transmission: String,
    val fuelType: String,
    val year: String,
    val mileage: String,
    @DrawableRes val imageRes: Int,
    val isFavorite: Boolean = false,
    val description: String = "The $name is a sporty compact vehicle with great features for daily driving."
)