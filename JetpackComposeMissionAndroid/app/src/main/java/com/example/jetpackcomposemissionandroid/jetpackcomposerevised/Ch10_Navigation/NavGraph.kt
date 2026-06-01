package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch10_Navigation

import android.text.style.AlignmentSpan
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun RevisedNavGraph() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Home,
    ) {
        composable<Routes.Home> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        navController.navigate(Routes.EventDetails("Yooo"))
                    }
                ) {
                    Text(
                        text = "Go to EventDetails"
                    )
                }
            }
        }

        composable<Routes.EventDetails> { backStackEntry ->
            val data = backStackEntry.toRoute<Routes.EventDetails>()

            Text(
                text = "Event Details ${data.eventId}"
            )
        }
    }
}