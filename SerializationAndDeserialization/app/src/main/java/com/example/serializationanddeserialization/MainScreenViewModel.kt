package com.example.serializationanddeserialization

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainScreenViewModel: ViewModel() {

    private val _decodedSuperVillain = MutableStateFlow<SuperVillain?>(null)
    val decodedSuperVillain = _decodedSuperVillain.asStateFlow()

    private val _encodedSuperVillain = MutableStateFlow<String>("")
    val encodedSuperVillain = _encodedSuperVillain.asStateFlow()

    init {
        _encodedSuperVillain.update {
            "{ \"name\": \"John Doe\", \"powerLevel\": 13, \"is_in_jail\": false }"
        }
    }

    fun updateDecodedSuperVillain(decodedSuperVillain: SuperVillain) {
        _decodedSuperVillain.update {
            decodedSuperVillain
        }
    }

    fun updateEncodedSuperVillain(encodedSuperVillain: String) {
        _encodedSuperVillain.update {
            encodedSuperVillain
        }
    }
}