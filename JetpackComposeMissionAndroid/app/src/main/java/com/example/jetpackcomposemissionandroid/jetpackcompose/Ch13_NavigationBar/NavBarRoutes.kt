package com.example.jetpackcomposemissionandroid.jetpackcompose.Ch13_NavigationBar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {

    @Serializable
    object Home: NavBarRoutes()

    @Serializable
    object Search: NavBarRoutes()

    @Serializable
    object Notifications: NavBarRoutes()

    @Serializable
    object Profile: NavBarRoutes()
}