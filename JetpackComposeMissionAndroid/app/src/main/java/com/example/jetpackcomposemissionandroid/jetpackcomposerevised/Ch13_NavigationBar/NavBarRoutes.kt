package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch13_NavigationBar

import kotlinx.serialization.Serializable

@Serializable
sealed class RevisedNavBarRoutes {

    @Serializable
    object Home: RevisedNavBarRoutes()

    @Serializable
    object Map: RevisedNavBarRoutes()

    @Serializable
    data class Create(val id: String): RevisedNavBarRoutes()

    @Serializable
    data class AcUnit(val num: Int): RevisedNavBarRoutes()
}