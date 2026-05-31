package com.example.jetpackcomposemissionandroid.jetpackcompose.Ch13_NavigationBar

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun NavBarHomeScreen(navController: NavHostController) {

    NavigationBarAppLayout(navController) {
        Text(
            text = "Home Screen",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}