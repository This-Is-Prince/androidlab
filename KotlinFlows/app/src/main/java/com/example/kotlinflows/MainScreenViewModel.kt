package com.example.kotlinflows

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

class MainScreenViewModel : ViewModel() {

    private val _continuousNumber = MutableStateFlow<Int>(0)
    val continuousNumber =
        _continuousNumber
            .filter { it % 2 == 0 }
            .flowOn(Dispatchers.IO)
            .stateIn(
                viewModelScope,
                SharingStarted.WhileSubscribed(5000),
                0
            )

    init {
        viewModelScope.launch {
            repeat(1000001) {
                Log.d("C", "$it")

                delay(100.milliseconds)

                _continuousNumber.value = it
            }
        }
    }
}