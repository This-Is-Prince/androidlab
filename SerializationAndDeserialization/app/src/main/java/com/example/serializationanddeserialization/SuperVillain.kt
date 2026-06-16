package com.example.serializationanddeserialization

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SuperVillain(
    val name: String,
    val powerLevel: Int,

    @SerialName("is_in_jail")
    val isInJail: Boolean,
)
