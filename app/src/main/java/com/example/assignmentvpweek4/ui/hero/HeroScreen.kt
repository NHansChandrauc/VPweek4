 package com.example.assignmentvpweek4.ui.hero

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentvpweek4.ui.hero.components.ExpeditionSquadSection
import com.example.assignmentvpweek4.ui.hero.components.FilterChipRow
import com.example.assignmentvpweek4.ui.hero.components.HeroCard

@Composable
fun HeroScreen(viewModel: HeroViewModel) {
    val heroes by viewModel.heroes.collectAsState()
    val selectedFilter by viewModel.selectedFilter.collectAsState()


    val squadHeroes = heroes.filter { it.inSquad }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF12121A))
            .padding(16.dp)
    ) {
        Text("Party Roster", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text("Guild Vanguard • 14 Heroes Available", fontSize = 11.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(10.dp))


        ExpeditionSquadSection(squadHeroes = squadHeroes)

        Spacer(modifier = Modifier.height(10.dp))


        FilterChipRow(
            filters = viewModel.filters,
            selectedFilter = selectedFilter,
            onFilterSelected = { viewModel.selectFilter(it) }
        )

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(heroes, key = { it.id }) { hero ->
                HeroCard(
                    hero = hero,
                    onExpandToggle = { viewModel.toggleExpand(hero.id) }
                )
            }
        }
    }
}