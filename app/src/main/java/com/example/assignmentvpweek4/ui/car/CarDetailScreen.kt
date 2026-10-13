package com.example.assignmentvpweek4.ui.car

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentvpweek4.data.Car

@Composable
fun CarDetailScreen(
    car: Car,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
        ) {
            Image(
                painter = painterResource(id = car.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            IconButton(
                onClick = onBackClick,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.TopStart)
                    .background(Color.White.copy(alpha = 0.7f), shape = RoundedCornerShape(50))
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(text = car.name, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(text = car.location, fontSize = 14.sp, color = Color.Gray)
            Text(
                text = car.price,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "SPECIFICATIONS", fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("YEAR", fontSize = 10.sp, color = Color.Gray)
                    Text(car.year, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                Column {
                    Text("MILEAGE", fontSize = 10.sp, color = Color.Gray)
                    Text(car.mileage, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                Column {
                    Text("TRANSMISSION", fontSize = 10.sp, color = Color.Gray)
                    Text(car.transmission, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                Column {
                    Text("FUEL TYPE", fontSize = 10.sp, color = Color.Gray)
                    Text(car.fuelType, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "ABOUT THIS CAR", fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = car.description, fontSize = 13.sp, color = Color.DarkGray)

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF6F00)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Contact Seller", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}