package com.example.assignmentvpweek4.ui.car


import androidx.lifecycle.ViewModel
import com.example.assignmentvpweek4.data.Car
import com.example.assignmentvpweek4.data.DummyCarData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CarViewModel : ViewModel() {

    private val _cars = MutableStateFlow<List<Car>>(emptyList())
    val cars: StateFlow<List<Car>> = _cars.asStateFlow()

    private val _selectedCar = MutableStateFlow<Car?>(null)
    val selectedCar: StateFlow<Car?> = _selectedCar.asStateFlow()

    init {
        _cars.value = DummyCarData.cars
    }

    fun toggleFavorite(id: String) {
        _cars.update { list ->
            list.map { if (it.id == id) it.copy(isFavorite = !it.isFavorite) else it }
        }
        if (_selectedCar.value?.id == id) {
            _selectedCar.update { it?.copy(isFavorite = !it.isFavorite) }
        }
    }

    fun selectCar(car: Car) {
        _selectedCar.value = car
    }

    fun clearSelection() {
        _selectedCar.value = null
    }

    fun getSavedCount() = _cars.value.count { it.isFavorite }
}