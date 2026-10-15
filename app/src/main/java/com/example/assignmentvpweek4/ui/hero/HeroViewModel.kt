package com.example.assignmentvpweek4.ui.hero

import androidx.lifecycle.ViewModel
import com.example.assignmentvpweek4.data.DummyHeroData
import com.example.assignmentvpweek4.data.Hero
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HeroViewModel : ViewModel() {

    private val _heroes = MutableStateFlow<List<Hero>>(emptyList())
    val heroes: StateFlow<List<Hero>> = _heroes.asStateFlow()

    private val _selectedFilter = MutableStateFlow("All (14)")
    val selectedFilter: StateFlow<String> = _selectedFilter.asStateFlow()

    val filters = listOf("All (14)", "Berserker (2)", "Archmage (3)", "Divine Oracle (2)")

    init {
        _heroes.value = DummyHeroData.heroes
    }

    fun selectFilter(filter: String) {
        _selectedFilter.value = filter
    }

    fun toggleExpand(id: String) {
        _heroes.update { list ->
            list.map { if (it.id == id) it.copy(isExpanded = !it.isExpanded) else it }
        }
    }
}