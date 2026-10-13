package com.example.assignmentvpweek4.ui.Car

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentvpweek4.ui.car.components.CarCard

@Composable
fun CarListScreen(viewModel: CarViewModel) {
    val cars by viewModel.cars.collectAsState()
    val selectedCar by viewModel.selectedCar.collectAsState()

    if (selectedCar != null) {
        CarDetailScreen(
            car = selectedCar!!,
            onBackClick = { viewModel.clearSelection() }
        )
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF6F6F6))
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text("On Sale", fontSize = 26.sp, fontWeight = FontWeight.Bold)
                    Text("Find your perfect ride", fontSize = 13.sp, color = Color.Gray)
                }

                Surface(
                    color = Color(0xFFFFEBEE),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Favorite, contentDescription = null, tint = Color.Red, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("${viewModel.getSavedCount()} saved", fontSize = 12.sp, color = Color.Red)
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(cars, key = { it.id }) { car ->
                    CarCard(
                        car = car,
                        onClick = { viewModel.selectCar(car) },
                        onFavoriteToggle = { viewModel.toggleFavorite(car.id) }
                    )
                }
            }
        }
    }
}