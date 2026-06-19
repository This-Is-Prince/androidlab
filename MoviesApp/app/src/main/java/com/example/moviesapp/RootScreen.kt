package com.example.moviesapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun RootScreen() {

    val rootNavController = rememberNavController()

    NavHost(
        navController = rootNavController,
        startDestination = RootRoutes.MainScreen,
    ) {
        composable<RootRoutes.SingleMovie> { backStackEntry ->
            val route = backStackEntry.toRoute<RootRoutes.SingleMovie>()

            SingleMovieScreen(
                rootNavController,
                route.movieId,
            )
        }
        composable<RootRoutes.MainScreen> {
            MainScreen(
                rootNavController,
            )
        }
    }
}