package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.TurnLeft
import androidx.compose.material.icons.filled.TurnRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RevisedTopBar(showSnackBar: () -> Unit) {

    TopAppBar(
        title = {
            Text(
                text = "Yooo"
            )
        },
        navigationIcon = {
            IconButton(
                onClick = showSnackBar
            ) {
                Icon(
                    imageVector = Icons.Default.BarChart,
                    contentDescription = "Bar Chart",
                )
            }
        },
        actions = {
            IconButton(
                onClick = showSnackBar
            ) {
                Icon(
                    imageVector = Icons.Default.TurnLeft,
                    contentDescription = "Turn Left",
                )
            }


            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.TurnRight,
                    contentDescription = "Turn Right",
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.TurnLeft,
                    contentDescription = "Turn Left",
                )
            }


            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.TurnRight,
                    contentDescription = "Turn Right",
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.TurnLeft,
                    contentDescription = "Turn Left",
                )
            }


            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.TurnRight,
                    contentDescription = "Turn Right",
                )
            }

        },
        modifier = Modifier.padding(0.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            navigationIconContentColor = Color.White,
            titleContentColor = Color.White,
            actionIconContentColor = Color.White,
        )
    )
}