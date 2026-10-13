package com.example.assignmentvpweek4.data
import androidx.annotation.DrawableRes

import com.example.assignmentvpweek4.R

object DummyCarData {
    val cars = listOf(
        Car(
            id = "1",
            name = "Daihatsu Ayla",
            location = "Surabaya",
            price = "Rp 135.000.000",
            transmission = "Manual",
            fuelType = "Petrol",
            year = "2020",
            mileage = "25,000 km",
            imageRes = R.drawable.ayla,
            isFavorite = false
        ),
        Car(
            id = "2",
            name = "Honda CRV",
            location = "Surabaya",
            price = "Rp 280.000.000",
            transmission = "Auto",
            fuelType = "Petrol",
            year = "2013",
            mileage = "15,200 km",
            imageRes = R.drawable.crv,
            isFavorite = false
        ),
        Car(
            id = "3",
            name = "Honda HRV",
            location = "Jakarta",
            price = "Rp 320.000.000",
            transmission = "Auto",
            fuelType = "Petrol",
            year = "2021",
            mileage = "18,500 km",
            imageRes = R.drawable.hrv,
            isFavorite = true
        ),
        Car(
            id = "4",
            name = "JAC J5",
            location = "Tangerang",
            price = "Rp 210.000.000",
            transmission = "Manual",
            fuelType = "Petrol",
            year = "2019",
            mileage = "40,000 km",
            imageRes = R.drawable.j5,
            isFavorite = false
        ),
        Car(
            id = "5",
            name = "MG 4 EV",
            location = "Jakarta",
            price = "Rp 425.000.000",
            transmission = "Auto",
            fuelType = "EV",
            year = "2023",
            mileage = "8,200 km",
            imageRes = R.drawable.mg4,
            isFavorite = true
        ),
        Car(
            id = "6",
            name = "Innova Reborn",
            location = "Malang",
            price = "Rp 350.000.000",
            transmission = "Auto",
            fuelType = "Diesel",
            year = "2020",
            mileage = "35,000 km",
            imageRes = R.drawable.reborn,
            isFavorite = true
        ),
        Car(
            id = "7",
            name = "Tiggo 9 CSH",
            location = "Jakarta",
            price = "Rp 450.000.000",
            transmission = "Auto",
            fuelType = "PHEV",
            year = "2024",
            mileage = "5,000 km",
            imageRes = R.drawable.tiggo,
            isFavorite = true
        ),
        Car(
            id = "8",
            name = "Daihatsu Xenia",
            location = "Semarang",
            price = "Rp 190.000.000",
            transmission = "Manual",
            fuelType = "Petrol",
            year = "2022",
            mileage = "28,000 km",
            imageRes = R.drawable.xenia,
            isFavorite = false
        ),
        Car(
            id = "9",
            name = "Toyota Yaris",
            location = "Semarang",
            price = "Rp 245.000.000",
            transmission = "Auto",
            fuelType = "Petrol",
            year = "2021",
            mileage = "52,400 km",
            imageRes = R.drawable.yaris,
            isFavorite = true
        ),
        Car(
            id = "10",
            name = "Toyota Yaris Cross",
            location = "Bandung",
            price = "Rp 310.000.000",
            transmission = "Auto",
            fuelType = "Hybrid",
            year = "2024",
            mileage = "30,500 km",
            imageRes = R.drawable.yariscross,
            isFavorite = true
        )
    )
}
