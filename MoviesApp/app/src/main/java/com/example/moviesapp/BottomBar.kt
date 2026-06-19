package com.example.moviesapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.LocalMovies
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val route: MainRoutes,
)

@Composable
fun NetflixAppBottomBar(mainNavController: NavHostController) {

    val items = listOf(
        NavItem(
            title = "Movies",
            icon = Icons.Default.LocalMovies,
            route = MainRoutes.Movies,
        ),
        NavItem(
            title = "Create Movie",
            icon = Icons.Default.Create,
            route = MainRoutes.CreateMovie,
        ),
    )

    NavigationBar(

    ) {
        items.forEach {
            NavigationBarItem(
                selected = false,
                onClick = {
                    mainNavController.navigate(it.route) {
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title,
                    )
                },
                label = {
                    Text(
                        text = it.title,
                    )
                }
            )
        }

    }
}