package com.example.moviesapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(rootNavController: NavHostController) {

    val mainNavController = rememberNavController()

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = { NetflixAppTopBar() },
        bottomBar = { NetflixAppBottomBar(mainNavController) }
    ) { innerPadding ->
        NavHost(
            navController = mainNavController,
            startDestination = MainRoutes.Movies,
        ) {
            composable<MainRoutes.Movies> {
                MoviesScreen(innerPadding, rootNavController)
            }
            composable<MainRoutes.CreateMovie> {
                CreateMovieScreen(innerPadding)
            }
        }
    }
}