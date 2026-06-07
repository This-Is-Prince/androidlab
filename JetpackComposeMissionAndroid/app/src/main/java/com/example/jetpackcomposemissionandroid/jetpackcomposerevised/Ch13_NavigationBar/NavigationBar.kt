package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch13_NavigationBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun RevisedNavigationBar(navController: NavHostController) {

    NavigationBar() {
        NavigationBarItem(
            selected = false,
            onClick = {
navController.navigate(RevisedNavBarRoutes.Home)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home"
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(RevisedNavBarRoutes.Map)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Map,
                    contentDescription = "Map"
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(RevisedNavBarRoutes.Create("Heyaa"))
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Create,
                    contentDescription = "Create"
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(RevisedNavBarRoutes.AcUnit(2))
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.AcUnit,
                    contentDescription = "AcUnit"
                )
            }
        )
    }
}