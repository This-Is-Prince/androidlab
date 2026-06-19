package com.example.moviesapp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Netflix(
    @SerialName("id")
    val id: String,

    @SerialName("movie")
    val movie: String,

    @SerialName("watched")
    val watched: Boolean,
)
