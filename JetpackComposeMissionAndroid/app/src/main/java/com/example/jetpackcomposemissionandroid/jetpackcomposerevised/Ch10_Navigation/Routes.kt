package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch10_Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    object Login: Routes()

    @Serializable
    object SignUp: Routes()

    @Serializable
    object PasswordReset: Routes()

    @Serializable
    object ProfileSetup: Routes()

    @Serializable
    object Home: Routes()

    @Serializable
    object Events: Routes()

    @Serializable
    object CreateEvent: Routes()

    @Serializable
    data class EventDetails(val eventId: String): Routes()

    @Serializable
    object PrivateProfile: Routes()

    @Serializable
    data class PublicProfile(val username: String): Routes()

}