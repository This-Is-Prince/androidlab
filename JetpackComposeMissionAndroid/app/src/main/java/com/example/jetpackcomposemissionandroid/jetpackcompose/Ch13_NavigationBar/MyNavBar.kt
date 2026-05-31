package com.example.jetpackcomposemissionandroid.jetpackcompose.Ch13_NavigationBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun MyNavBar(navController: NavHostController) {
    val navItems = listOf(
        NavItem("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItem("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItem("Notifications", Icons.Default.Notifications, NavBarRoutes.Notifications),
        NavItem("Profile", Icons.Default.Person, NavBarRoutes.Profile),
    )

    NavigationBar(

    ) {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = false,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                    )
                },
                label = {
                    Text(
                        text = item.title,
                    )
                }
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val route: NavBarRoutes,
)