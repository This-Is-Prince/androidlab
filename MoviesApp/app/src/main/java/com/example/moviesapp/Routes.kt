package com.example.moviesapp

import kotlinx.serialization.Serializable

@Serializable
sealed class RootRoutes {

    @Serializable
    data class SingleMovie(val movieId: String): RootRoutes()

    @Serializable
    object MainScreen: RootRoutes()

}

@Serializable
sealed class MainRoutes {

    @Serializable
    object Movies: MainRoutes()

    @Serializable
    object CreateMovie: MainRoutes()
}