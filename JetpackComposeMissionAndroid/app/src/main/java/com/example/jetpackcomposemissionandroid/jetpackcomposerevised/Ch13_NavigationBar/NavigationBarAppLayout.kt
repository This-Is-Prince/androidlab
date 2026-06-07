package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch13_NavigationBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun RevisedNavigationBarAppLayout() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RevisedNavBarRoutes.Home,
    ) {
        composable<RevisedNavBarRoutes.Home> {
            Scaffold(
                bottomBar = { RevisedNavigationBar(navController) }
            ) { innerPadding ->
                Column(
                    modifier = Modifier.padding(innerPadding)
                ) {
                    Text(
                        text = "Home"
                    )
                }
            }
        }

        composable<RevisedNavBarRoutes.Map> {
            Scaffold(
                bottomBar = { RevisedNavigationBar(navController) }
            ) { innerPadding ->
                Column(
                    modifier = Modifier.padding(innerPadding)
                ) {
                    Text(
                        text = "Map"
                    )
                }
            }
        }

        composable<RevisedNavBarRoutes.Create> { backStackEntry ->
            val create = backStackEntry.toRoute<RevisedNavBarRoutes.Create>()

            Scaffold(
                bottomBar = { RevisedNavigationBar(navController) }
            ) { innerPadding ->
                Column(
                    modifier = Modifier.padding(innerPadding)
                ) {
                    Text(
                        text = "Create ${create.id}"
                    )
                }
            }
        }

        composable<RevisedNavBarRoutes.AcUnit> { backStackEntry ->
            val acUnit = backStackEntry.toRoute<RevisedNavBarRoutes.AcUnit>()

            Scaffold(
                bottomBar = { RevisedNavigationBar(navController) }
            ) { innerPadding ->
                Column(
                    modifier = Modifier.padding(innerPadding)
                ) {
                    Text(
                        text = "AcUnit ${acUnit.num}"
                    )
                }
            }
        }
    }


}