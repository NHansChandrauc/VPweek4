package com.example.assignmentvpweek4.ui.hero.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpeditionSquadSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1E1E2C), shape = RoundedCornerShape(10.dp))
            .border(1.dp, Color(0xFF3A3A50), shape = RoundedCornerShape(10.dp))
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("● EXPEDITION SQUAD (3/4)", fontSize = 11.sp, color = Color(0xFF81C784), fontWeight = FontWeight.Bold)
            Text("⚡ 14750 CP", fontSize = 11.sp, color = Color(0xFFFFD54F), fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                repeat(3) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color(0xFF2D2D44), RoundedCornerShape(6.dp))
                    )
                }
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color(0xFF252535), RoundedCornerShape(6.dp))
                        .border(1.dp, Color.Gray, RoundedCornerShape(6.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("+", color = Color.Gray, fontSize = 16.sp)
                }
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFB74D)),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text("Deploy", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            }
        }
    }
}