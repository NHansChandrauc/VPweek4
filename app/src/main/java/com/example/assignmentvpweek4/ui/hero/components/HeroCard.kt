package com.example.assignmentvpweek4.ui.hero.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentvpweek4.data.Hero

@Composable
fun HeroCard(
    hero: Hero,
    onExpandToggle: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onExpandToggle() },
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E2C))
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = hero.rarity,
                        color = Color(0xFFE57373),
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFF3E2723), RoundedCornerShape(4.dp))
                            .padding(horizontal = 4.dp, vertical = 2.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = hero.heroClass, color = Color(0xFFFFB74D), fontSize = 11.sp)
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "⚡ ${hero.cp} CP", color = Color(0xFFFFD54F), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = if (hero.isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(6.dp))
                ) {
                    Image(
                        painter = painterResource(id = hero.avatarRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(text = hero.name, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Spacer(modifier = Modifier.height(4.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("HP", fontSize = 9.sp, color = Color.Gray, modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(5.dp)
                                .background(Color(0xFF2D2D44), RoundedCornerShape(3.dp))
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth((hero.currentHp.toFloat() / hero.maxHp).coerceIn(0f, 1f))
                                    .background(Color(0xFFE57373), RoundedCornerShape(3.dp))
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("${hero.currentHp}/${hero.maxHp}", fontSize = 8.sp, color = Color.LightGray)
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("MP", fontSize = 9.sp, color = Color.Gray, modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(5.dp)
                                .background(Color(0xFF2D2D44), RoundedCornerShape(3.dp))
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth((hero.currentMp.toFloat() / hero.maxMp).coerceIn(0f, 1f))
                                    .background(Color(0xFF64B5F6), RoundedCornerShape(3.dp))
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("${hero.currentMp}/${hero.maxMp}", fontSize = 8.sp, color = Color.LightGray)
                    }
                }
            }

            AnimatedVisibility(visible = hero.isExpanded) {
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    HorizontalDivider(color = Color(0xFF2D2D44))
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatBox("ATK", hero.atk.toString())
                        StatBox("DEF", hero.def.toString())
                        StatBox("CRIT", hero.crit)
                        StatBox("SPD", hero.spd.toString())
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("★ ${hero.skillName}", fontSize = 11.sp, color = Color(0xFFFFD54F), fontWeight = FontWeight.Bold)
                    Text(hero.skillDescription, fontSize = 10.sp, color = Color.LightGray)

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2E7D32)),
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text("Heal (+250 HP)", fontSize = 10.sp)
                        }
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD84315)),
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text("Add to Squad", fontSize = 10.sp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StatBox(label: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFF14141F), RoundedCornerShape(4.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(label, fontSize = 8.sp, color = Color.Gray)
        Text(value, fontSize = 11.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}