package com.example.jetpackcomposemissionandroid.jetpackcompose.Ch10_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen,
    ) {
        composable<MyNavRoutes.LoginScreen> {
            LoginScreenUI(navController)
        }

        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUI(navController)
        }

        composable<MyNavRoutes.WelcomeScreen> { backStackEntry ->

            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()

            WelcomeScreenUI(data.userName, navController)
        }
    }

}