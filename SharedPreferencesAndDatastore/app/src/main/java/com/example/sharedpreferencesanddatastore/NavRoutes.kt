package com.example.sharedpreferencesanddatastore

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {

    @Serializable
    object SharedPreferences: NavRoutes()

    @Serializable
    object DataStore: NavRoutes()
}